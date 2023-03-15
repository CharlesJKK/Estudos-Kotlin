import javax.xml.crypto.Data

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


fun main(args: Array<String>) {

    val userA = User("Charles", true)
    userA.printNameUpperCase()
    println(userA.getNameLength())

    val userB = User("Pele")
    userB.printNameUpperCase()
    println(userB.getNameLength())

    User.resetCount()//Chamando o comportamento da classe, chamando ela diretamente sem instanciar o objeto

    val userC = User()
    println(userC.getNameLength())

    login(userA)
    println(Database.name)
    println(Database.userIsLogged?.name)

}

fun login(user: User){
    Database.userIsLogged = user
}


