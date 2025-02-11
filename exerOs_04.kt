fun main() {
    print("Digite a primeira nota: ")
    val nota1 = readLine()?.toDoubleOrNull()
    
    print("Digite a segunda nota: ")
    val nota2 = readLine()?.toDoubleOrNull()
    
    print("Digite a terceira nota: ")
    val nota3 = readLine()?.toDoubleOrNull()
    
    print("Digite a quarta nota: ")
    val nota4 = readLine()?.toDoubleOrNull()
    
    if (nota1 != null && nota2 != null && nota3 != null && nota4 != null) {
        val media = (nota1 + nota2 + nota3 + nota4) / 4
        println("A média das notas é $media")
    } else {
        println("Entrada inválida. Por favor, insira notas válidas.")
    }
}