

fun main(){
    //mapOf -> existe também o mutableListOf
    val product = mutableMapOf(//todo mapOf é nullable
        "Android" to "Google",
        "iOS" to "Apple",
        "Windows" to "Microsoft"
    )

    //val res = product["Android]
    //val res = product.getOrDefault("Android2", "Não existe empresa para esse sistema.")
    //val res = product.getOrElse("Android2"){"Não existe empresa para esse sistema."}


    //val res = product.containsValue("123456")
    val res = product.containsKey("Windows")
    if(res){
        println("Sim")
    }

    println(product.keys)
    println(product.values)

    product["Android"] = "Empresa XYZ"
    product.remove("Android")// ("Android", "Google") -> só remove se as duas derem match
    //product.clear() -> Apaga todos os valores

    println(product.keys)
    println(product.values)


    val contactsGmail = mapOf(
        1 to "Tiago",
        2 to "Gabriel",
        3 to "Adenilda",
        4 to "Roberto",
        5 to ""
    )
    //Filtrando todos os elementos que tem e e fazendo um map neles para pegar apenas as letras iniciais com substring
    val r = contactsGmail.filter{it.value.contains("a")}.map { it.value.substring(0, 1) }

    println(r)
}
