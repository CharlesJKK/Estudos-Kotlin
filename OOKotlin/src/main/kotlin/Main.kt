fun main(args: Array<String>) {

    val userA = User("Charles", true)
    //Exemplo de when apenas com if e else direto.
    when {
        userA.name == "Charles" -> {
            println("Charles também foi encontrado em outro banco de dados")
        }
        else -> println("Nem em outro banco de dados o usuário foi encontrado")
    }

    val userB = User("Pele")//Sobrecargada de constructor 2
    userB.printNameUpperCase()
    println(userB.getNameLength())

    User.resetCount()//Chamando o comportamento da classe, chamando ela diretamente sem instanciar o objeto

    val userC = User() //Sobrecargada de constructor 3
    println(userC.getNameLength())

    login(userA)
    println(Database.name)
    println(Database.userIsLogged?.name)




    val maguinhoCantor = Musician()
    maguinhoCantor.style = "Metal Rock"
    maguinhoCantor.desc()

    val guitar = Musician.Guitar()//Exemplo de classe aninhada
    guitar.desc()

    val sax = maguinhoCantor.Sax() //Exemplode Inner class, bom para hierarquia e para instanciar o objeto
    // tem que esta "vivo"
    sax.desc()

    val creditCardApiName = "visa"
    val card = CreditCard.valueOf(creditCardApiName.uppercase())

    //Reforçando when
    when(card){
        CreditCard.VISA -> println("Ganhou desconto!")
        else -> println("Seu cartão não tem desconto, utilize um visa caso queira 40% de desconto.")
    }
}

class Musician{ //Class com um exemplo de classe nested e uma inner
    var style: String = "Rock"
    fun desc() = println("Meu estilo é: $style")

    class Guitar {
        var strings = 6
        fun desc() = println("tocando uma guitarra com $strings cordas")
    }

    inner class Sax{
        var family = "Saxofone soprano"
        fun desc() = println("Família: $family e eu toco: $style")
    }
}

enum class CreditCard(val label: String) {
    VISA("Visa"),
    MASTER("Mastercard"),
    ELO("Elo"),
    AMEX("American Express")
}

fun login(user: User){
    Database.userIsLogged = user
}


//Class é como se fosse um molde responsavel por criar N objetos com propriedades ou comportamentos
//Constructor uma forma de predefinir propriedades podendo ser iniciada como
//Opção 1: class User constructor(var name: String) - sem valor padrão e palava constructor explicita
//Opção 2: class User(var name: String = "") - recebe um valor padrão e o constructor não está explicito
//Opção 3: class User(var name: String) espera que o consructor receba o valor (var)
//Sobrecarga de constructor = exemplo em User.kt
//Init: Inicia logo após o constructor principal e serve para iniciliar algo e não tem parametros
/*Propriedades e comportamentos da CLASSE: todos os objetos conseguem enxergar a mesma variavel ou proriedade com o
 companion object : propriedades e comportamentos da CLASSE(Ex em User.kt)*/

/*Visibilidade de variaveis: private = deixa a propriedade ou comportamente visivel somente dentro do objeto e não
 por suas instâncias*/

//const: quer dizer que é uma constante de compilação, assim que o código compilar ele já vai alocar o valor
/*Objetos Unicos: um Objeto que só pode existir um(SINGLETON), diferente de um objeto normal que vc pode instanciar varios objetos
 exemplo em Database.kt*/

/*Tipos de classes:
 1: Classes aninhadas (Nested Class)
 2: Classes internas (Inner Class)
 3: Data class: Exemplo no arquivo DataClass
 4: Classes enumeradas (Enum Class)
 Boas práticas com Enum: geralmente o Enum é muito utilizado em conjunto com condições When*/

//Desestruturação de classes em Destructuring.kt





