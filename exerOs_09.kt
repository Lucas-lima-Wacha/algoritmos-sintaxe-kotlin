fun main() {
    
    print("Digite a temperatura em Fahrenheit: ")
    val fahrenheit = readLine()!!.toDouble()

    
    val celsius = (fahrenheit - 32) * 5 / 9

    
    println("A temperatura em Celsius é: %.2f".format(celsius))
}