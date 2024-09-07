fun main() {
    println("CONTADOR DE PALAVRAS DE UMA FRASE")

    println("Por favor, digite uma frase: ")
    val fraseDigitada: String = readln()

    val fraseDigitadaSeparada = fraseDigitada.split(" ")

    val palavras = fraseDigitadaSeparada.size

    println("A frase contém $palavras palavras")
}