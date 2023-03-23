fun main(){
    val g = Guitar("Giver")
    g.tune()
    g.jingle()

    val f = Flute("Fender")
    f.tune()
    g.jingle()

    val v = Violin("Gender IV")
    v.tune()
    v.jingle()
}

internal class InstrumentStrings(val numeroDeCordas: Int, val marca: String)//Essa classe só fica disponível em instrumento.kt

abstract class Instrument(var name: String){

    private lateinit var instrumentStrings: InstrumentStrings

    fun addStrings(num: Int, marca: String){
        instrumentStrings = InstrumentStrings(num, marca)
    }

    abstract fun tune()

    fun jingle(){

    }
}

abstract class StringInstrument(name: String, var cordas: Int): Instrument(name){

}

class Guitar(name: String): StringInstrument(name, 6){
    init {
        addStrings(10, "NIG")
    }

    override fun tune() {
        println("Afinação em E(MI)")
    }
}

class Violin(name: String) : StringInstrument(name, 4){

    override fun tune() {
        println("Afinação em D(RÉ)")
    }
}

class Flute(name:String): Instrument(name){
    override fun tune() {
        println("Afinação em C(D6)")
    }
}

