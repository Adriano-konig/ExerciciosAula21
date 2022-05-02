package Exercicio1

fun main() {
    val livro: RegistradoLivro = RegistradoLivro()
    livro.registrarLivro("000.0000-00")
    livro.registrarLivro("11111.111.11-00", "Harry Potter")
    livro.registrarLivro("2222.2222-90", "Star wars", "Ação")
    livro.registrarLivro()
}