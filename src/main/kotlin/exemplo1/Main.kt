package exemplo1

fun main() {
    val calc = Calculadora()
    val a = 10
    val b = 5
    println("$a + $b = ${calc.soma(a,b)}")
    println("$a x $b = ${calc.multiplicacao(a,b)}")
}