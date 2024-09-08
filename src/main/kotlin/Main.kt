fun main() {
    println("CONTADOR DE PALAVRAS DE UMA FRASE")

    println("Por favor, digite uma frase: ")
    val typedSentence: String = readln()

    val separateTypedSentence = typedSentence.split(" ")

    val sentenceSpaceFilter = separateTypedSentence.filter { it.isNotEmpty() }

    val amountOfWords: Int = sentenceSpaceFilter.size

    println("Sua frase tem $amountOfWords palavras")

}