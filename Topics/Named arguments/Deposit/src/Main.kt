import kotlin.math.pow

fun calculateCompoundInterest(
    amount: Int = 1000,
    percent: Int = 5,
    years: Int = 10)
: Int {
    val percentDouble = percent.toDouble()
    val finalAmount =  (amount * (1 + (percentDouble / 100)).pow(years))
    return finalAmount.toInt()
}



fun main() {

    val parameterString = readln()
    val value = readln().toInt()
    when {
        parameterString == "amount" -> println(calculateCompoundInterest(amount = value))
        parameterString == "percent" -> println(calculateCompoundInterest(percent = value))
        parameterString == "years" -> println(calculateCompoundInterest(years = value))

    }

}