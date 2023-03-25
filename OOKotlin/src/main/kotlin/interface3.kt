
fun main(){
    val tela = TelaPrincipal()
    val linkEntrar = Link("Entrar", 10 to 20)
    println("Antes do click no link")
    linkEntrar.clickListener = tela
    linkEntrar.click()
    println("Depois do click no link")
}

class TelaPrincipal: OnClickListener{
    override fun onClick() {
        println("Tela principal recebeu o evento de click de 'alguém")
    }
}

abstract class Component {
    abstract  fun position(): Pair<Int, Int>

    open fun render(){
        println("Desenhando na tela")
    }
}

abstract class Text(val text: String, val pos: Pair<Int, Int>): Component(){
    override fun render() {
        super.render()
        println("Desenhando o text $text")
    }
}

class Btn(text: String, val backgroundColor: Int, pos: Pair<Int, Int>): Text(text, pos){
    override fun position(): Pair<Int, Int> {
        return pos
    }

    override fun render() {
        super.render()
        println("Desenhando a cor de fundo $backgroundColor")
    }
}

class Link(text: String, pos: Pair<Int, Int>): Text(text, pos){

    lateinit var clickListener: OnClickListener

    override fun position(): Pair<Int, Int> {
        return pos
    }

    fun click(){
        clickListener.onClick()
    }
}

interface OnClickListener {
    fun onClick()
}