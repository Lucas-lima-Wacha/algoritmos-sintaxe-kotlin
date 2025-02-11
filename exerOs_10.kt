fun main() {
    
    print("Digite a temperatura em Celsius: ")
    val celsius = readLine()!!.toDouble()

    
    val fahrenheit = (celsius * 9 / 5) + 32

    
    println("A temperatura em Fahrenheit é: %.2f".format(fahrenheit))
}