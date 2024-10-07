package exercicios.ex1

class USMoney(var dollars:Int, var cents:Int) {
    init{
        if(dollars<0 || cents<0){
            dollars = 0
            cents = 0
        }
    }

    init{
        if(cents>99){
            dollars += cents / 100
            cents %= 100
        }
    }

    fun plus(other: USMoney): USMoney{
        return USMoney((dollars+other.dollars), (cents+other.cents))
    }

    override fun toString(): String {
        var str = "$dollars dollar"
        if(dollars!=1)
            str+='s'
        str += " and $cents cent"
        if(cents!=1)
            str+='s'
        return str
    }
}

fun main() {
    val money1 = USMoney(2,25)
    println(money1)
    val money2 = USMoney(3,176)
    println(money2)
    println(money1.plus(money2))
}