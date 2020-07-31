fun main (args: Array<String>){
    showMenu()
    selectOption()
}

fun showMenu (){
    val title = ":: Bienvenido a Recipe Maker ::"
    val espa = "\n-------------------------------------------------\n"
    val sT = """
        Selecciona la opción deseada
        1. Hacer una receta
        2. Ver mis recetas
        3. Salir
    """.trimIndent()
    println(title + espa + sT)
}


fun selectOption (){

    println("\nSelecciona la opcion deseada con el numero a su izquierda y la tecla enter")

    val response: String? = readLine()
    val thrdOpt = "\nGRACIAS por su visita, vuelva pronto ;)"
    val ops = "\nPor favor selecciona una opcion valida"


    if (response == "1"){
        showMakeRecipe()
    }else if (response == "2") {
        showRecipes()
    }else if (response == "3"){
        println(thrdOpt)
    }else (println(ops))

}

fun showMakeRecipe (){
    println("\n:: ¡Genial! Hagamos nuestra receta ::")
}

fun showRecipes (){
    println("\n:: Damas y caballeros, con ustedes: LAS RECETAS")
}
