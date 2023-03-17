fun main(){
    val test1 = Test("Unitário", true)
    val test2 = Test("Unitário", true)//Qualquer mudança retorna false

    println(test1)
    println(test2)

    println(test1 == test2)//Caso Test não fosse uma data class, retornaria sempre false.
}

//Usando classe normal, a gente não compara o conteúdo do objeto e sim o objeto em si.
data class Test(var testName: String, var isTested: Boolean)