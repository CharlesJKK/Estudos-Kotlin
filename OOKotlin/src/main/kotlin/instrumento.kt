fun main(){
    val nicole = Musicia("Nicole")
    val kiko = Musicia("Kiko")
    val viktoria = Musicia("Viktoria")

    val g = Guitar("Giver")
    g.jingle(nicole)

    val f = Flute("Fender")
    f.jingle(kiko)

    val v = Violin("Gender IV")
    v.jingle(viktoria)
}

class Musicia(val name: String)

internal class InstrumentStrings(val numeroDeCordas: Int, val marca: String)//Essa classe só fica disponível em instrumento.kt

abstract class Instrument(var name: String){

    private lateinit var instrumentStrings: InstrumentStrings

    fun addStrings(num: Int, marca: String){
        instrumentStrings = InstrumentStrings(num, marca)
    }

    abstract fun tune(): Boolean

    fun jingle(musicia: Musicia){
        if (tune()){
            println("Tocando o... $name, pelo ${musicia.name}")
        }else{
            println("Por favor ${musicia.name}, afine o instrumento $name")
        }
    }
}

abstract class StringInstrument(name: String, var cordas: Int): Instrument(name){

}

class Guitar(name: String): StringInstrument(name, 6){
    init {
        addStrings(10, "NIG")
    }

    override fun tune(): Boolean {
        println("Afinação em E(MI)")

        return true
    }
}

class Violin(name: String) : StringInstrument(name, 4){

    override fun tune(): Boolean {

        return false
    }
}

class Flute(name:String): Instrument(name){
    override fun tune(): Boolean {
        println("Afinação em C(D6)")

        return true
    }
}

