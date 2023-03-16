


class User constructor(var name: String, var isAdmin: Boolean = false){

    //lateinit var evita usar nullable e não preciso passar um valor inicial, mas preciso obrigatoriamente atribuir
    //um valor para a variável depois
    lateinit var lastName: String
    
    private val hairColor: String = "Black"//Visível apenas aqui dentro

    companion object {

        //val é constante em tempo de execução e const e constante em tempo de compilação
        const val MAX_NAME_LENGTH = 8 // padrao UPPER_CASE para algo que tem que ser constante

        var count = 0

        fun resetCount(){
            count = 0
        }
    }

    init {
        count++
        println(count)
    }

    constructor(name: String) : this(name, false){
        println("Sobrecarga de constructor")
    }

    constructor() : this("Desconhecido", false){
        println("Execução do constructor 3")
    }

    fun printNameUpperCase(){
        return println(name.uppercase())
    }

    fun output() = println("Meu nome é: $name $lastName, sou admin ${isAdmin}")

    fun getNameLength(): Int{
        return name.length
    }
}