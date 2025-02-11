fun main() {
    print("Digite o raio do círculo: ")
    val raio = readLine()?.toDoubleOrNull()
    
    if (raio != null) {
        val area = Math.PI * raio * raio
        println("A área do círculo com raio $raio é %.2f".format(area))
    } else {
        println("Entrada inválida. Por favor, insira um número válido.")
    }
}