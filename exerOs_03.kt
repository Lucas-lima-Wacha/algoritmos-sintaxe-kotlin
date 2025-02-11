fun main() {
    print("Digite o primeiro número: ")
    val numero1 = readLine()?.toDoubleOrNull()
    
    print("Digite o segundo número: ")
    val numero2 = readLine()?.toDoubleOrNull()
    
    if (numero1 != null && numero2 != null) {
        val soma = numero1 + numero2
        println("A soma dos números informados é $soma")
    } else {
        println("Entrada inválida. Por favor, insira números válidos.")
    }
}