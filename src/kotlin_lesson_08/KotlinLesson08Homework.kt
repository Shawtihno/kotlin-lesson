fun main(){
    stringTransformation("Это невозможно выполнить за один день")
    stringTransformation("Я не уверен в успехе этого проекта")
    stringTransformation("Произошла катастрофа на сервере")
    stringTransformation("Этот код работает без проблем")
    stringTransformation("Удача")
    date(dateInput = "2021-12-01 09:48:23".split(" "))
    creditCardMask(cardNumber = "4539 1488 0343 6467")
    //println("Введите email: ")
    // userEmailTransformation(email = readln())
    file("C:/Пользователи/Документы/report.txt")
    abbreviation("Котлин лучший язык программирования".split(" "))
    wordsUpper("слово начинается с заглавной буквы".split(" "))
    encrypt("Kotlin")
    decrypt("oKltni")




}
//1
fun stringTransformation(phrase: String){
    val result = when {
        phrase.contains("невозможно", true) -> phrase.replace("невозможно", "совершенно точно возможно, просто требует времени", true)
        phrase.startsWith("Я не уверен", false) -> "$phrase , но моя интуиция говорит об обратном."
        phrase.contains("катастрофа", true) -> phrase.replace("катастрофа", "интересное событие", true)
        phrase.endsWith("без проблем", true) -> phrase.replace("без проблем", "с парой интересных вызовов на пути", true)
        phrase.endsWith(phrase, true) -> "Иногда $phrase, но не всегда"
        else -> phrase
    }
    println(result)
}
//2
fun date(dateInput: List<String>){
    println(dateInput[0])
    println(dateInput[1])

}
//3
fun creditCardMask(cardNumber: String){
    val notMasked = cardNumber.substring(15)
    println("**** **** ****  $notMasked")
}
//4
fun userEmailTransformation(email: String ){
    val result = when {
        email.contains("@") -> email.replace("@" , " [at] ")
        else -> email

    }
    val resultTwo = result
    val resultFinal = when{
        resultTwo.contains(".") -> resultTwo.replace(".", " [dot] ")
        else -> resultTwo}
    println(resultFinal)
}

//5
fun file(filePath: String){
    val fileName = filePath.substring(26)
    print(fileName)
    print("\n")
}

//6
fun abbreviation(abbr : List<String>){
    for(i in abbr){
        print(i[0].uppercase())



    }
    print("\n")
}

//7
fun wordsUpper(words: List<String>){
    for(word in words){
        print("${word[0].uppercase()}${word.substring(1)} ")
    }
    print("\n")
}

//8

fun encrypt(encryptWord: String){
    val encryptedWord = if(encryptWord.length % 2 != 0) {
        "$encryptWord "
    } else {
        encryptWord
    }
    val encryptingWord = encryptedWord.substring(1,2) + encryptedWord.substring(0,1) + encryptedWord.substring(3,4) + encryptedWord.substring(2,3) +  encryptedWord.substring(5,6) +  encryptedWord.substring(4,5)
    println(encryptingWord)


}
fun decrypt(decryptWord: String){
    val decryptedWord = if(decryptWord.length % 2 != 0) {
        "$decryptWord "
    } else {
        decryptWord
    }
    val decryptingWord = decryptedWord.substring(1,2) + decryptedWord.substring(0,1) + decryptedWord.substring(3,4) + decryptedWord.substring(2,3) +decryptedWord.substring(5,6) +decryptedWord.substring(4,5)
    println(decryptingWord)
}

