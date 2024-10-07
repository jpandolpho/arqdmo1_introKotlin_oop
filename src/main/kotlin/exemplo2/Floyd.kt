package exemplo2

class Floyd {

    fun imprime(linhas:Int){
        var value = 1
        for(linha in 1..linhas){
            for(coluna in 1..linha){
                print("$value ")
                value+=1
            }
            println()
        }
    }

    fun imprimeCaractere(linhas: Int){
        for(linha in 1..linhas){
            for(coluna in 1..linha){
                print("#")
            }
            println()
        }
    }
}