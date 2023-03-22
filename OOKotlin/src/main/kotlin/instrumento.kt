fun main(){
    val g = Guitar("vermelha")
    g.console()
}

internal class InstrumentStrings(val numeroDeCordas: Int, val marca: String)//Essa classe só fica disponível em instrumento.kt

open class Instrument(var cor: String){

    private lateinit var instrumentStrings: InstrumentStrings

    fun console(){
        println("Esse instrumento é da cor $cor e tem ${instrumentStrings.numeroDeCordas} cordas")
    }

    fun addStrings(num: Int, marca: String){
        instrumentStrings = InstrumentStrings(num, marca)
    }
}

class Guitar(cor: String): Instrument(cor){
    init {
        instrumentStrings = addStrings(10, "NIG")
    }
}

