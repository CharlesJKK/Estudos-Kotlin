
fun findInstrument(): Playable {
    return Violin()
}

fun getMenu(): Menu{
    return McDonald()
}

fun main(){
    val musician1 = MusicianInterface("Tiago")
    musician1.playable = findInstrument()
    musician1.menu = getMenu()
    musician1.startPlay()
    musician1.makeOrder()
}

class MusicianInterface(val name: String) {

    lateinit var playable: Playable //Polimorfismo
    lateinit var menu : Menu

    fun startPlay(){
        playable.play()
    }

    fun makeOrder(){
        val combo = menu.comboOfTheDay()
        println(combo)
    }
}

interface Menu {
    fun comboOfTheDay(): String
}

class McDonald: Menu {
    override fun comboOfTheDay(): String {
        return "BigMac"
    }
}

class  Bk: Menu {
    override fun comboOfTheDay(): String {
        return "Whopper"
    }
}

class Girafas: Menu {
    override fun comboOfTheDay(): String {
        return "Big girafa"
    }
}

interface Playable {
    fun play()
}

class Guitar: Playable {
    override fun play() {
        println("Zinnnnnnnnnnnnnzashshsaaa (Som de guitarra)")
    }
}

class Drums: Playable {
    override fun play() {
        println("Dum dum don don dap (Som de Bateria)")
    }
}

class Violin: Playable {
    override fun play() {
        println("Xien xien xon xon (Som de Violino)")
    }
}