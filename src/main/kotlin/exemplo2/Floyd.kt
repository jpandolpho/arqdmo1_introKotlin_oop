package exemplo2

class Floyd (
    private var lines:Int
    ){

    fun imprime(){
        var value = 1
        for(linha in 1..lines){
            for(coluna in 1..linha){
                print("$value ")
                value+=1
            }
            println()
        }
    }

    fun imprimeCaractere(){
        for(linha in 1..lines){
            for(coluna in 1..linha){
                print("#")
            }
            println()
        }
    }
}