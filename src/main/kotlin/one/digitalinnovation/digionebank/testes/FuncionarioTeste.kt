package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Funcionario
import java.math.BigDecimal

fun main(){
    val joao = Funcionario(nome = "João", cpf = "222.222.222-22", salario = BigDecimal.valueOf(2000.00))
    println(joao.nome)
    println(joao.cpf)
    println(joao.salario)
}