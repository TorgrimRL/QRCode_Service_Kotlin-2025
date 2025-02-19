// Write your code here. Do not import any libraries
val text = readLine()!!

val myFileLocation ="MyFile.txt"
val myFile = File(myFileLocation)
myFile.writeText(text)
myFile.appendText(text)

