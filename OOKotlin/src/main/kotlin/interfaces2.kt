import java.io.FileWriter
import java.lang.Exception


fun buscarSistemaDeLog(): LoggerGenerico{
    return SistemaServidor()
}

fun main(){
    val userA = Usuario(buscarSistemaDeLog())
    userA.criarPublicacao()

    val userB = Usuario(buscarSistemaDeLog())
    userB.criarPublicacao()
}

interface LoggerGenerico {
    fun print(message: String)
}

class SistemaConsole: LoggerGenerico {
    override fun print(message: String) {
        println(message)
    }
}

class SistemaServidor: LoggerGenerico {
    override fun print(message: String) {
        println(message)
    }
}

class SistemaArquivo: LoggerGenerico {
    override fun print(message: String) {
        val path = "C:/Users/selra/Downloads/aula.txt"
        try {
            val fw = FileWriter(path, true)
            fw.write(message)
            fw.write("\n")
            fw.close()
        }catch (e: Exception){
            e.printStackTrace()
        }
    }
}

//Em português pq já existe outra classe User em outro arquivo.
class Usuario(val logger: LoggerGenerico){
    init {
        log("Usuário criado!")
    }

    fun criarPublicacao(){
        log("Novo post criado!")
    }

    fun log(mensagem: String){
        logger.print(mensagem)
    }
}