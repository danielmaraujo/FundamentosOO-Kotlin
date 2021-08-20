package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Gerente
import one.digitalinnovation.digionebank.ImprimeRelatorioFuncionario


fun main(){
    val maria = Gerente(nome = "Maria", cpf = "222.222.222-22", salario = 5000.00)

    ImprimeRelatorioFuncionario.imprime(maria)
}