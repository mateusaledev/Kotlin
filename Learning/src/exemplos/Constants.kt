package exemplos

class Constants private constructor(){
    companion object BANCO {
        val TABLE = "Pessoa"

        fun teste() {
            println("Sou um método estático.")
        }
    }

    object VENDAS {
        val TABLE_NAME = "Vendas"
    }

    object COLUNAS{
        val ID = "Id"
        val TOTAL = "Total"
    }
}

fun main() {

}