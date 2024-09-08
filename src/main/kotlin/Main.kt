fun main() {
    println("CONTADOR DE PALAVRAS DE UMA FRASE")

    println("Por favor, digite uma frase: ")
    val fraseDigitada: String = readln()

    val fraseDigitadaSeparada = fraseDigitada.split(" ")

    val filtradorDeEspacosDaFrase = fraseDigitadaSeparada.filter { it.isNotEmpty() }

    val QuantidadeDePalavras = filtradorDeEspacosDaFrase.size

    println("Sua frase tem $QuantidadeDePalavras palavras")
}