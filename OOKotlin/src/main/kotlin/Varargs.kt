//vararg serve para passar n parametros sem precisar declarar.
//podendo passar o tipo do parametro como float ou uma variavel generica que pode receber qualquer tipo
//Se existir vararg nos parametros, junto de outros parametros, mas o vararg tem de ser o ultimo da direita
//EX:
fun main() {
    println(media(10f, 8f, 20f, 10f, 50f))//sendo possível passar 5 argumentos sem precisar declarar todos.
 }

 fun media(vararg notas: Float): Float {
     var soma = 0f
     for (n in notas){
         soma += n
     }
     return (soma / notas.size)
}

//Exemplo de parametro generico

fun <T>mediaGenerica(vararg notas: T): Float {
    var soma = 0f
    for (n in notas){
        if(n is Float){
            soma += n
        }
    }
    return (soma / notas.size)
}


// Entendendo Any, Unit e Nothing
// Unit diz que a função não tem retorno
// Nothing(colocado no lugar do Unit abaixo) é um tipo usado pra retornar uma exceção da função
fun valores(value: Any): Unit{//Pode receber qualquer valor e funciona como um parametro generico

}


