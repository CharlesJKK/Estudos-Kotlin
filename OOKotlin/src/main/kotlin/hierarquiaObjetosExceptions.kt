import java.lang.Exception
import java.lang.IllegalArgumentException

//Hierarquia de objetos & exceptions

fun main(){
    val obj: Any = getObject(2)
    val cast = obj as String
    println(cast.length)
    println(obj.toString().length)
    if(obj is String){
        println(obj.length)
    }

    divide(10, 0)
    showView()
}

fun getObject(value: Int): Any {
    return when(value){
        1 -> 1
        2 -> "Aula"
        3 -> true
        else -> 1.0
    }
}

fun divide(x: Int, y: Int){

    try {
        println(x / y)
    }catch (e: Exception){//Exception é o tipo de exception mais gênerica possível
        println("Não é possível dividir um número por 0")
    }
}

fun showView(){
    try {
        val res = applyDiscount(100.0, 52)
        println(res)
    }catch (e: IllegalArgumentException){
        println(e.message)
    }
}

fun applyDiscount(price: Double, value: Int): Double{

    val discount = value * price / 100

    if(value> 50){
        throw IllegalArgumentException("Desconto de $discount% é muito alto!")//throw é usado para lançar uma exception
    }

    return discount
}