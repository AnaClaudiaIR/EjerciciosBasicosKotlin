fun main() {
   var numInt:Int = 0
    var numMax: Int = 0
    var numOculto:Int? = 0

    do {
        var opcion = menu()

        when (opcion){
            1 ->
            {
                println("Introduce número de intentos: ")
                numInt = readln().toInt()

                println("Número máximo para adivinar")
                numMax = readln().toInt()
            }

            2 ->
            {
                numOculto = (0..numMax).random()

                if (numInt == 0 || numMax == 0){
                    numInt = 5
                    numMax = 10
                }

                adivinar(numInt,numMax,numOculto)
            }
            3 ->
            {
                println("Has salido.")
            }
            else ->
            {
                println("Introduce una opción válida")
            }
        }
    } while (opcion!=3)
}

fun menu():Int{
    var opcion = 0

        println("1. Configurar")
        println("2. Jugar")
        println("3. Salir")
        println("\nIntroduce la opción: ")
        opcion = readln().toInt()
    return opcion
}

fun adivinar(int: Int, max: Int, ocu: Int){
    var numAd:Int = 0
    var intentos:Int = 0

    for (i in 0..int){
        println("Número: ")
        var numAd:Int = readln().toInt()

        intentos++

        while (numAd != ocu){
            if (numAd < ocu){
                println("El número es mayor.")
                break
            } else {
                println("El número es menor")
                break
            }
        }

        if (numAd == ocu){
            println("Has ganado! Has necesitado " + intentos + " intentos")
            break
        }

        if (intentos >= int){
            println("Perdiste! Intentos consumidos.")
            break
        }
    }
}