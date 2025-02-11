fun main() {
    print("Quanto você ganha por hora? ")
    val valorHora = readLine()?.toDoubleOrNull()
    
    print("Quantas horas você trabalhou no mês? ")
    val horasTrabalhadas = readLine()?.toDoubleOrNull()
    
    if (valorHora != null && horasTrabalhadas != null) {
        val salario = valorHora * horasTrabalhadas
        println("O total do seu salário no mês é R$ %.2f".format(salario))
    } else {
        println("Entrada inválida. Por favor, insira números válidos.")
    }
}