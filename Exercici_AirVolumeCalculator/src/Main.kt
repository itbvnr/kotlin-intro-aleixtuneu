/* Per poder fer un estudi de la ventilació d'una aula necessitem poder
   calcular la quantitat d'aire que hi cap en una habitació. Llegeix les 3
   dimensions de l'aula i printa per pantalla quin volum té. */

fun main() {
    val MsgInputX = "Introdueix la base: "
    val MsgInputY = "Introdueix l'altura: "
    val MsgInputZ = "Introdueix l'amplada: "
    val MsgResult = "Volum total: "

    println(MsgInputX)
    var inputX = readln().toDouble()

    println(MsgInputY)
    var inputY = readln().toDouble()

    println(MsgInputZ)
    var inputZ = readln().toDouble()

    val result = CalculateVolume(inputX, inputY, inputZ)

    println(MsgResult + result)
}

fun CalculateVolume(inputX: Double, inputY: Double, inputZ: Double): Double {
    return inputX * inputY * inputZ
}