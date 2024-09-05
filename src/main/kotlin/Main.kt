
fun main() {
    println("CONTADOR DE PALAVRAS EM UMA FRASE")
    println("Por favor, digite uma frase: ")
    val fraseDigitadaPeloUsuario = readln()
    println("Frase: $fraseDigitadaPeloUsuario")

    var i = 0;

    while (i < fraseDigitadaPeloUsuario.length) {
        println(i)
        i++
    }
}