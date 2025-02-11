fun main() {
    print("Digite o valor em metros: ")
    val metros = readLine()?.toDoubleOrNull()
    
    if (metros != null) {
        val centimetros = metros * 100
        println("$metros metros equivalem a $centimetros centímetros.")
    } else {
        println("Entrada inválida. Por favor, insira um número válido.")
    }
}