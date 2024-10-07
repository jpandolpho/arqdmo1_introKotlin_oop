package exemplo1

class Calculadora {
    fun soma(a:Int, b:Int) = a+b

    fun multiplicacao(a:Int, b:Int) = somaSucessiva(a,b)

    private fun somaSucessiva(a: Int, b: Int): Int {
        var resultado = 0
        for(i in (1..b)){
            resultado+=a
        }
        return resultado
    }


}