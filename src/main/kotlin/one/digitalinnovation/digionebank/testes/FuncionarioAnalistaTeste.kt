package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.ImprimeRelatorioFuncionario


fun main(){
    val joao = Analista(nome = "João", cpf = "222.222.222-22", salario = 2000.00)

    ImprimeRelatorioFuncionario.imprime(joao)
}