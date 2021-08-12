package one.digitalinnovation.digionebank

class Pessoa {
    var nome : String = "Daniel"
    var cpf : String = "123.123.123-12"
}

fun main(){
    val daniel = Pessoa()

    println(daniel.nome)
    println(daniel.cpf)
}
