package Exercicio1

class RegistradoLivro {

    fun registrarLivro(isbn: String){
        println("O Livro foi registrado com o ISBN:  $isbn")
    }

    fun registrarLivro(isbn: String, nome: String){
        println("O livro foi registrado com o ISBN $isbn e o nome $nome")
    }

    fun registrarLivro(isbn: String, nome: String, genero: String){
        println("O Livro foi registrado com o ISBN $isbn, nome $nome e o genero $genero")
    }

    fun registrarLivro() {
        var nome = ""
        var isbn = ""
        var genero = ""

        println("Quantos livro tem: ")
        var qtdadeLivro = readln().toInt()
        val listaLivro = ArrayList<String>(qtdadeLivro)

        for(i: Int in 1..qtdadeLivro) {
            println("Digite o nome livro: ")
            nome = readln()
            println("Digite o numero ISBN de livro")
            isbn = readln()
            println("Qual gênero esse livro: ")
            genero = readln()

            listaLivro.add(nome)
            listaLivro.add(isbn)
            listaLivro.add(genero)
        }
       for(i: Int in 1..qtdadeLivro) {
           listaLivro
        }
        println("Livros registrado: $listaLivro")
    }
}