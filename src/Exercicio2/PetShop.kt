package Exercicio2

import kotlin.system.exitProcess

class PetShop {

    fun registro() {
        var nome: String = ""
        var raca: String = ""
        var responsavel: String = ""
        println("Quantos animais quer fazer consulta: ")
        var quantidade = readln().toInt()

         //   var ListaAnimais = ArrayList<String>(quantidade)

        for (i: Int in 1..quantidade) {
            println("Qual raça: c => cachorro, g => gato e p = peixe")
            raca = readln()
            println("Como chama: ")
            nome = readln()
            println("Nome responsavel: ")
            responsavel = readln()
        //}
//          ListaAnimais.add(raca)
//          ListaAnimais.add(nome)
//          ListaAnimais.add(responsavel)

                if (raca == "c") {
                    println(
                        "Digite numero oque seu $nome esta fazendo: \n" +
                                "[1]=>movimentar\n" +
                                "[2]=> comer\n" +
                                "[3]=> dormir\n" +
                                "[4]=> sair sistema\n"
                    )
                    var num = readln().toInt()

                    if (num == 1) {
                        println("Adando em 4 patas")
                    } else if (num == 2) {
                        println("Comendo bife")
                    } else if (num == 3) {
                        println("Dormindo na cama da Jéssica")
                    } else if (num == 4) {
                        exitProcess(0)
                    } else {
                        println("opção inválido")
                        registro()
                    }
                }
                    if(raca == "g") {
                        println(
                            "Digite numero oque seu $nome esta fazendo: \n" +
                                    "[1]=>movimentar\n" +
                                    "[2]=> comer\n" +
                                    "[3]=> dormir\n" +
                                    "[4]=> sair sistema\n"
                        )
                        var num = readln().toInt()

                        if (num == 1) {
                            println("Andando e saltando em 4 patas")
                        } else if (num == 2) {
                            println("Comendo whiskas sachê")
                        } else if (num == 3) {
                            println("Dormindo na caixa")
                        } else if (num == 4) {
                            exitProcess(0)
                        } else {
                            println("opção inválido")
                            registro()
                        }
                    }
                    if (raca == "p") {

                        println(
                            "Digite numero oque seu $nome esta fazendo: \n" +
                                    "[1]=>movimentar\n" +
                                    "[2]=> comer\n" +
                                    "[3]=> dormir\n" +
                                    "[4]=> sair sistema\n"
                        )
                        var num = readln().toInt()

                        if (num == 1) {
                            println("Nadando")
                        } else if (num == 2) {
                            println("Comendo ração molhada")
                        } else if (num == 3) {
                            println("Dormindo de olho aberto")
                        } else if (num == 4) {
                            exitProcess(0)
                        } else {
                            println("opção inválido")
                            registro()
                        }

                    }

                }
        println("Quer continuar? s-sima n-não")
        var letra = readln()
        if (letra == "s") {
            registro()
        }else{
            println("encerrando")
            exitProcess(0)
        }

            }

        }
