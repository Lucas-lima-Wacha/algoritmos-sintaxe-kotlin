fun main() {
    print("Digite o lado do quadrado: ")
    val lado = readLine()?.toDoubleOrNull()
    
    if (lado != null) {
        val area = lado * lado
        val dobroArea = area * 2
        println("A área do quadrado é %.2f".format(area))
        println("O dobro da área é %.2f".format(dobroArea))
    } else {
        println("Entrada inválida. Por favor, insira um número válido.")
    }
}
