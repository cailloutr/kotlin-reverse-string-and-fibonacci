fun main(args: Array<String>) {
//    var num = ""
//    while (num != "exit") {
//        println("Sequencia Fibonacci, escolha um numero para saber se ele pertence a sequencia(type exit to quit)")
//        num = readln()
//        try {
//            println(fibonacci(num.toInt()))
//        } catch (e: Exception) {
//            println("Entrada invalida")
//        }
//    }

    println(inverse("Amarelo"))
}

fun fibonacci(num: Int): String {
    var a = 0
    var b = 1
    var temp = b

    if (num == 0 || num == 1) {
        return "$num pertence a sequencia"
    }

    while (b < num) {
        temp = b
        b += a
        a = temp
        if (b == num) {
            return "$num pertence a sequencia"
        }
    }
    return "$num nao pertence a sequencia"
}

fun inverse(string: String): String {
    var newString = ""
    for (char in (string.length - 1) downTo 0) {
        newString += string[char]
    }
    return newString
}