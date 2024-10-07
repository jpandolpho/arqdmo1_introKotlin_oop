package exercicios.ex2

class Carta(var valor:Int, var naipe:Char) {
    init{
        if(valor<1||valor>13){
            valor = 1
        }
    }
    init{
        if((naipe != 'P') || (naipe != 'C') || (naipe != 'O') || (naipe != 'E')){
            naipe=' '
        }
    }
}