
fun main() {
    println("CONTADOR DE PALAVRAS EM UMA FRASE")
    println("Por favor, digite uma frase: ")
    val fraseDigitadaPeloUsuario = readln()
    println("Frase: $fraseDigitadaPeloUsuario")

    var i = 0;

    while (i < fraseDigitadaPeloUsuario.length) {
        val caractere = fraseDigitadaPeloUsuario[i]
        println(caractere)

        if ((caractere >= 'A' && caractere <= 'Z') ||
            (caractere >= 'a' && caractere <= 'z') ||
            (caractere >= '0' && caractere <= '9')) {

            println("Você digitou uma frase!")
        }

        i++
    }
}