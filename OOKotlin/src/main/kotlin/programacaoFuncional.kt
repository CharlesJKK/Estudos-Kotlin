
// É praticamente tratar tudo como funções matematicas f(x) = x * x
// Estados imutaveis
// A prog. fuuncional trata as funções de forma em que estas possam ser passadas como parametros para outras funções
// e podendo ter o resultado(diferente) podendo ser armazenado em uma constante
// Funções puras nativas do Kotlin: filter, forEach e o map

fun main(){

    val users = listOf(
        UserEx("Tiago", true),
        UserEx("Tia", false),
        UserEx("Tiago", true),
    )

    //Como funcionar o filter normalmente
    val newUsersNames =  users.filter { user ->
        user.name == "Tiago"
    }
    println(newUsersNames)

    //Filter como funciona por de baixo dos panos
    val newUsers = users.filter(::filtrarAdmins)
    newUsers.forEach {
        println(it)
    }

    val listNames = users.map { user ->
        user.name.uppercase()
    }
    listNames.forEach { println(it) }

    //calc(5, 5, ::sum)
    //calc(5, 5, ::minus)

    //calc(5, 5, {x, y -> x * y})//Assim não é necessário criar outra função

    //calc(5, 5) {x, y -> x / y}//Assim é outra maneira também sem criar função
}

fun sum(x: Int, y: Int): Int{
    return x + y
}

fun minus(x: Int, y: Int): Int{
    return x - y
}

fun filtrarAdmins(user: UserEx): Boolean {
    return user.isAdmin
}

fun calc(a: Int, b: Int, operation: (Int, Int) -> Int){
    val result = operation(a, b)
    println("Resultado da operação de $a com $b foi $result")
}