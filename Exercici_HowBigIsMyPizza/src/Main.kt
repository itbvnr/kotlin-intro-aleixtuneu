/* 1. Llegeix el diametre d'una pizza rodona i imprimeix la seva superfície.
      Pots fer servir per escriure el valor de Pi. */

fun main() {
    val MsgInput = "Introdueix el diàmetre: "
    val MsgResult = "Superfície de la pizza: "

    println(MsgInput)
    var diameter = readln().toDouble()

    var result = calculateArea(diameter)

    println(MsgResult + result)
}

fun calculateArea(diameter: Double): Double {
    val pi = 3.14159
    return pi * ((diameter / 2) * (diameter / 2))
}