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



    if (response == "1"){
        showMakeRecipe()
    }else if (response == "2") {
        showRecipes()
    }else if (response == "3"){
        println(thrdOpt)
    }else (println(optionIncorrect()))

}

fun optionIncorrect () {
//    val ops = "\nPor favor selecciona una opcion valida"
//    println(ops)
    println(showMenu())
    println(selectOption())
}