package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Pessoa

fun main(){
    val daniel = Pessoa(nome = "Daniel", cpf="111.111.111-11")

    println(daniel.nome)
    println(daniel.cpf)
}