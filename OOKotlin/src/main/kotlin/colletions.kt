

fun main() {

    //setOf é uma coleção que não permite adicionar elementos repetidos
    //setOf é imutavel
    //multableSetOf é mutavel
    val users = setOf(
        UserEx("Tiago", true),
        UserEx("Tia", false),
        UserEx("Tiago", true),
    )

    users.forEach { println(it) }









    /*
    //Arrays são praticamentes coleções estáticas, com valores fixos.

    val items = intArrayOf(1, 2, 3, 4, 5, 6)
    println(items.size)
    items.forEach { println("Imprimindo números: $it")
    }

    val users = arrayOf<UserEx?>(
        UserEx("Tiago", true),
        UserEx("Charles", false),
        null
    )

    val newList = users.plus(UserEx("Lucas", false))

    newList.forEach { println(it) }


//----------------------------------------------------------------------------------------------

    //Lists - são coleções dinâmicas e que é imutavel -> listOf
    //multableList - são listas mutaveis -> multableListOf
    //val emptyList = emptyList<UserEx?>() -> Cria uma lista vazia

    val users = mutableListOf<UserEx>(
        UserEx("Tiago", true),
        UserEx("Triago", false),
        UserEx("Charles", false)
    )

    users[0] = UserEx("Eu", true) //Atualização elemento
    users.add(UserEx("Novo user", false)) // Adicionar elemento
    users.forEach { println(it) }
    println("========================")

    users.remove(users.last())//Excluir elemento
    users.forEach { println(it) }
    println("========================")

    //Filter serve pra filtrar algo com base em uma condição, existe também o filterNot que é o contrário do filter
    val filtered = users.filter { user ->
        user.isAdmin == false
    }
    filtered.forEach { println(it) }


    //println(users.first())// firstOrNull() -> caso a lista esteja vazia, retorna null e o aplicativo não da exception
    //println(users.last()) // lastOrNull()

    //println(users.isEmpty()) -> Confere se a lista está vazia



    //combinações de lista -> opção 1
    val a = mutableListOf("Tiago", "Lucas")
    val b = listOf("Joao", "Peter", "Lucy")

    b.filterTo(a, {it.contains("a")})
    println(a)

    //opção 2
    val c = listOf("A", "B")
    val d = listOf("E", "F")
    val all = listOf(c, d)
    println(all)//Assim a lista fica com um array de arrays.
    println(all.flatten())//Assim cria uma única lista com os dois elementos

     */

}