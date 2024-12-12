/* L'usuari escriu un enter amb la seva edat i s'imprimeix si és major d'edat, i en qualsevol altre cas. */

fun main() {
    val MsgHello = "Introdueix la teva edat: "
    val MsgOk = "Ets major d'edat."
    val MsgKo = "No ets major d'edat."
    val MsgError = "No has introduït un valor vàlid."

    println(MsgHello)
    val age = readln().toInt()

    if (age >= 18) {
        println(MsgOk)
    } else if ( age < 0) {
        println(MsgError)
    } else {
        print(MsgKo)
    }
}