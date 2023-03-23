fun main(){
    val userA = UserEx("Charles", true)

    val userB = userA.copy(isAdmin = false)//copy serve para copiar dados de um objeto anterior

    //estrutura de dados simples
    //Pair - 2 e Triple - 3
    val coordinates = Pair(10, 20)//Pair serve para trabalhar com dualidade sem precisar criar um data class
    //val coordinates = 10 to "Tiago"//Funciona como o Pair, porém mais descritivo e associativo Nesse ex: id 10 é de Tiago
    println(coordinates.first)
    println(coordinates.second)

//-----------------------------------------------------------------------

    //Herança

    val teacher1 = Teacher("Girafales", "Rua avenida principal BR 201")
    println(teacher1.description())

    val student1 = Student(1370813 , "Charles", "Rua avenida principal BR 221")
    println(student1.description())
}

//class people é uma super class, que é a classe que vc herda propriedades
//open permite que outras classes possam herdar da classe com o open(fica onde está o abstract)
//abstract serve para que você possa evitar istanciar a classe pai(pois ela não precisa ser instanciada)
abstract class People(var name: String, var address: String){

    protected var accessLevel = false
    //protected -> somente classes filhas podem ter acesso a essa variavel ou funções se declarado numa função
    //private -> somete a classe atual pode acessar as suas propriedades ou funções se declarado numa função
    //(nada) default -> qualquer um pode mudar essa variavel(ou que esteja no mesmo pacote)

    fun description() = "Meu nome é $name e meu endreço é $address. Nível de acesso: $accessLevel"
}

class Teacher(name: String, address: String): People(name, address){//Professor está herdando atributos e funções da classe People
    init {
        accessLevel = true
    }
}

class Student(var registration: Int, name: String, address: String): People(name, address){
}

data class UserEx (var name: String, var isAdmin: Boolean = false)