package qrcodeapi.controller


import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.http.converter.HttpMessageConverter
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import com.google.zxing.BarcodeFormat
import com.google.zxing.EncodeHintType
import com.google.zxing.client.j2se.MatrixToImageWriter
import com.google.zxing.qrcode.QRCodeWriter
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel
import java.awt.image.BufferedImage
import org.springframework.http.converter.BufferedImageHttpMessageConverter


@Configuration
class AppConfig {
    @Bean
    fun bufferedImageHttpMessageConverter():
            HttpMessageConverter<BufferedImage> = BufferedImageHttpMessageConverter()
}
data class ErrorResponse(val error:String)

class ImageConverter {
    fun stringToBufferedImage(correction: Char, contents: String, size: Int): BufferedImage {
        val writer = QRCodeWriter()
        val transformedCorrection = when (correction) {
            'L' -> ErrorCorrectionLevel.L
            'M' -> ErrorCorrectionLevel.M
            'Q' -> ErrorCorrectionLevel.Q
            else -> ErrorCorrectionLevel.H
        }
        val hints = mapOf(EncodeHintType.ERROR_CORRECTION to transformedCorrection)
        val bitMatrix = writer.encode(contents, BarcodeFormat.QR_CODE, size, size, hints)

        return MatrixToImageWriter.toBufferedImage(bitMatrix)
    }
}

@RestController
class QRCodeRestController {

    @GetMapping(path = ["api/health"])
    fun hello():HttpStatus = HttpStatus.OK

    @GetMapping(path =  ["api/qrcode"])
    fun getImage(contents: String = "setoptimizer.com",
                 size: Int = 250,
                 correction:Char = 'L',
                 type: String = "png"): ResponseEntity<out Any>? {
        validateRequest(contents,size,correction,type)?.let {
            return it
        }
        val mediaType = when (type.lowercase()) {
            "png" -> MediaType.IMAGE_PNG
            "jpeg" -> MediaType.IMAGE_JPEG
            "gif" -> MediaType.IMAGE_GIF
            else -> MediaType.APPLICATION_OCTET_STREAM
        }
        val converter = ImageConverter()
        val image = converter.stringToBufferedImage(correction,contents,size)
        return ResponseEntity
                 .ok()
                 .contentType(mediaType)
                 .body(image)
    }


    private fun validateRequest(contents: String,
                                size: Int = 250,
                                correction:Char = 'L',
                                type: String = "png"): ResponseEntity<ErrorResponse>? {
        if (contents.isBlank()) {
            return errorResponse("Contents cannot be null or blank")
        }
        if (size !in 150..350) {
            return errorResponse("Image size must be between 150 and 350 pixels")
        }
        if (correction !in listOf('L','M','Q', 'H')){
                return errorResponse("Permitted error correction levels are L, M, Q, H")

        }
        if (type !in listOf("png", "jpeg", "gif")) {
            return errorResponse("Only png, jpeg and gif image types are supported")
        }
        return null
        }

    private fun errorResponse(message: String): ResponseEntity<ErrorResponse> =
        ResponseEntity
            .badRequest()
            .contentType(MediaType.APPLICATION_JSON)
            .body(ErrorResponse(message))
    }


