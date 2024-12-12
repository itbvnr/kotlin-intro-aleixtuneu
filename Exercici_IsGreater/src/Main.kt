/* L'usuari escriu dos valors i s'imprimeix si el primer és més gran que el segon i en qualsevol altre cas. */

fun main() {
    val MsgInputOne = "Introdueix el primer valor: "
    val MsgInputTwo = "Introdueix el segon valor: "
    val MsgBiggerOne = "El primer número és més gran que el segon."
    val MsgBiggerTwo = "El segon número és mes gran que el primer."
    val MsgEqual = "Els dos números són iguals."

    println(MsgInputOne)
    val inputOne = readln().toInt()

    println(MsgInputTwo)
    val inputTwo = readln().toInt()

    if (inputOne > inputTwo) {
        println(MsgBiggerOne)
    } else if (inputOne < inputTwo) {
        println(MsgBiggerTwo)
    } else {
        println(MsgEqual)
    }
}