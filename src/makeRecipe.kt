import kotlin.io.readLine as readLine1

fun showMakeRecipe (){
    println("\n:: ¡Genial! Hagamos nuestra receta ::\n\n Hacer receta")
    println("\nSelecciona por categoria el ingrediente que buscas")

    val ingredientType :
            Array<String> =
        arrayOf("1. Agua", "2. Leche", "3. Carne", "4. Verduras", "5. Frutas", "6. Cereal", "7. Huevos", "8. Aceites")
//    for((index,ingType) in ingredientType.withIndex()){
//        println("$index: $ingType")
//    }
    for (iT in ingredientType){
        println(iT)
    }

    println(selectOptionMakeRecipe())
}


fun selectOptionMakeRecipe (){
    println("Selecciona la opcion deseada")
    val response: String? = kotlin.io.readLine()
    when (response){
        "1" -> println("\n:: Categoria Agua ::")
        "2" -> println("\n:: Categoria Leche ::")
        "3" -> println("\n:: Categoria Carne ::")
        "4" -> println("\n:: Categoria Verduras ::")
        "5" -> println("\n:: Categoria Frutas ::")
        "6" -> println("\n:: Categoria Cereal ::")
        "7" -> println("\n:: Categoria Huevos ::")
        "8" -> println("\n:: Categoria Aceites ::")
        else -> (showMakeRecipe())
    }
}

