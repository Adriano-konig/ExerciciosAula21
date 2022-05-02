package Exercicio3

import kotlin.system.exitProcess

class Carro {
    var velocidade: Int = 0
    var cor: String = ""
    var valor: Double = 0.0
    var ano: Int = 0
    var porta: Int = 0
    var subtracao: Int = 0

    fun tipoMarca() {

        println(
            "Qual marca voc~e quer receber a informação?: \n" +
                    "1 => Renault\n" +
                    "2 => Fiat\n" +
                    "3 => hyundai\n" +
                    "4 => sair sistema"
        )
        var opçao = readln().toInt()

        when {
            opçao == 1 -> {
                println("Marca: Renault")
                println("ano: ")
                ano = readln().toInt()
                println("valor: ")
                valor = readln().toDouble()
                println("cor: ")
                cor = readln()
                println("portas: ")
                porta = readln().toInt()
                println("velocidade: ")
                velocidade = readln().toInt()

            }
            opçao == 2 -> {
                println("Marca: Fiat")
                println("ano: ")
                var ano = readln().toInt()
                println("valor: ")
                var valor = readln().toDouble()
                println("cor: ")
                var cor = readln()
                println("portas: ")
                var porta = readln()
                println("velocidade: ")
                var velocidade = readln().toInt()
            }
            opçao == 3 -> {
                println("Marca: Hyundai")
                println("ano: ")
                var ano = readln().toInt()
                println("valor: ")
                var valor = readln().toDouble()
                println("cor: ")
                var cor = readln()
                println("portas: ")
                var porta = readln()
                println("velocidade: ")
                var velocidade = readln().toInt()
            }
            opçao == 4 -> {
                println("Encerrando")
                exitProcess(0)
            }
        }
    }
        fun motor() {
            val pegarMetodo:Carro = Carro()

            println("Iniciando o motor... minha velocidade está em $velocidade")
        }
        fun frear(){
            subtracao = velocidade - 5
            println("Freando... minha velocidade está em $subtracao")
        }
        fun acelerar(){
            var acelerando = subtracao+10
            println("Acelerando... minha velocidade está $acelerando")
        }
}