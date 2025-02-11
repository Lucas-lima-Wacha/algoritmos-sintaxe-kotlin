fun main() {
    print("Digite um número: ")
    val numero = readLine()?.toIntOrNull()
    
    if (numero != null) {
        println("O número informado foi $numero")
    } else {
        println("Entrada inválida. Por favor, insira um número válido.")
    }
}