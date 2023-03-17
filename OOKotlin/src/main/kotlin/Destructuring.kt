fun main(){
    val user1 = UserDes("Charles", false)

    val (name, isAdmin) = user1 /*Exemplo de desestruturação, só é possível fazer com data class, sempre desestruturar
     de acordo com a ordem das variaveis do objeto(da esquerda pra direita)*/
}

data class UserDes (var name: String, var isAdmin: Boolean = false)