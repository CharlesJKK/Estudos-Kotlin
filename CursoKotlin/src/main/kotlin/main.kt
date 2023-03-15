import java.util.Arrays

fun main(args: Array<String>){

    //Varíaveis Mutáveis = Começam com var e podem mudar de valor;
    var nome = "Charles Alves Sales Junior"
    nome = "Marmelada"

    //Varíaveis Imutáveis = Começam com val e não é possível mudar o valor;
    val idade = 28

    // \n quebra linha e \t da um espaço

    // três aspas duplas formata o texto automaticamente """Oi tudo bem (ENTER) seu produto chegou """.trimIndent()
//----------------------------------------------------------------------------------------------------

// operador elvis

    val elvis = "teste";
    val evilsEvils = elvis ?: "ElvisPrelis"

    println(evilsEvils)


//----------------------------------------------------------------------------------------------------
    /* Tipos de variáveis
        String - Textos com aspas duplas "Oiii"
        Char - Texto, mas usando aspas simples 'T'
        byte - Números Inteiros (-128 até 127)
        int - Números Inteiros (-2147483648 até 2147483647)
        long - Números Inteiros (-9223372036854775808 até 9223372036854775807)
        float - Números Decimais (1.1234567 até 7 casas decimais)
        double - Números Decimais (1.123456789 até 15 casas decimais)
        boolean - Valores Booleanos - true ou false
     */
    //Não é necessário inferir o tipo da variável, mas é possível Ex:
    val byte: Byte = 28 //Byte é o único que precisa inferir o seu tipo.
    val meuNome: String? = "Literalmente eu" // O ? após o String indica que ele pode ser null
    val dinheiro = 2.50f //Ele reconhece automáticamente como double, é necessário o f no final para ser float;
    var dinheiroReal = 290

    val qtdTxt = meuNome?.length

    dinheiroReal++
//----------------------------------------------------------------------------------------------------
    //Concatenação em Kotlin
    //println("Eu tenho $byte anos, e sou $meuNome e tenho de dinheiro $dinheiroReal ${byte}")

//----------------------------------------------------------------------------------------------------
    //if e else
    val verdade = false

    if(verdade){
        println("Q isso")
    }else{
        println("Falsooo")
    }

//----------------------------------------------------------------------------------------------------
    //Array em kotlin

    var listaCompras = arrayOf("Arroz", "Feijão", "Batata", "Uva")
    var textoLenght = "Heloooo"

    println(listaCompras[0])
    println(Arrays.toString(listaCompras))
    println("Tamanho do array size ${listaCompras.size}") // size substitui o length em arrays
    println("Tamanho do texto length ${textoLenght.length}")

//----------------------------------------------------------------------------------------------------
    //Estruturas de repetição

    //While

    var indice = 0;

    while (indice < listaCompras.size){

        println(listaCompras[indice])

        indice++
    }

    // for

    var indice2 = 0;
    for (indice2 in 0..listaCompras.size - 1){
        println(listaCompras[indice2] + " indice 2")
    }

    for (item in listaCompras){
        println(item + " for diferenciado")
    }

//----------------------------------------------------------------------------------------------------
    //Estrutura condicional com when

    var opcao = 4

    when(opcao){
        1 -> println("Subo de Baranja")
        2 -> println("Subo de Uba")
        3 -> println("Subo de Murango")
        else -> println("Nenhum suco com essa opção")
    }
}