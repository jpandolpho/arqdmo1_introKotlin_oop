package exemplo2

class Floyd (
    private val lines:Int = 1,
    var simbolo: Char = '#'
    ){

    fun imprime(numeros:Boolean = true){
        if (numeros){
            imprimeNumeros()
        }else{
            imprimeCaractere()
        }
    }

    private fun imprimeNumeros(){
        var value = 1
        for(linha in 1..lines){
            for(coluna in 1..linha){
                print("$value ")
                value+=1
            }
            println()
        }
    }

    private fun imprimeCaractere(){
        for(linha in 1..lines){
            for(coluna in 1..linha){
                print("$simbolo")
            }
            println()
        }
    }
}