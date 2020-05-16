fun main() {
    println("ini adalah sebuah kata")
    checkWord("ini adalah sebuah kata")
    println("2 pasang sandal hilang")
    checkWord("2 pasang sandal hilang")
}

fun checkWord(word: String){
    val listValue: List<String> = word.split(" ").map { it -> it.trim()}
    var total = 0
    var totalWord= 0
    listValue.forEach {
        it ->
        total++
        if (letters(it)){
            totalWord++
        }
    }
    println("$totalWord / $total")
}

fun letters(str: String):Boolean{
    return str.matches("^[a-zA-Z]*$".toRegex())
}
