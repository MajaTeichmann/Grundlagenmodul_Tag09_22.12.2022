fun main() {

    /* a) Gegeben ist folgende Map:
    Die Map mappt von Person zu ihrem Lieblingstier. */

    val personZuHaustier: Map<String, String> = mapOf(
        "Berta" to "Katzen",
        "Frank" to "Katzen",
        "Luis" to "Mäuse",
        "Sylvia" to "Eulen",
        "Hans" to "Pfau")


    /* Verwende die Funktion get() oder die Index[] Schreibweise, wie in Aufgabe 1 oder in der Vorlesung gezeigt.
    Was ist das Lieblingstier von Frank?
    Was ist das Lieblingstier von Sylvia?
    Was ist das Lieblingstier von Hans? */

    var lieblingsTierVonFrank: String? = personZuHaustier ["Frank"]
    var lieblingsTierVonSylvia: String? = personZuHaustier ["Sylvia"]
    var lieblingsTierVonHans: String? = personZuHaustier ["Hans"]

    println("Das Lieblingstier von Frank ist ${lieblingsTierVonFrank}, von Sylvia ${lieblingsTierVonSylvia} und von Hans ${lieblingsTierVonHans}.")


    /* b) Gegeben ist folgende Map:
    Die Map mappt von Hausnummer zu Hausfarbe.

    12 -> "Rot"
    45 -> "Blau"
    23 -> "Gelb"
    28 -> "Grün"
    36 -> "Lila"
    92 -> "Rosa"

    Erstelle eine geeignete Map mit den genannten Paaren.
    Lese den Wert aus der Map aus und weise ihn einer Variable zu,
    gib dann die Variable in der Konsole aus.
    Verwende in deiner Lösung die Funktion get() oder die Index[] Schreibweise.
    Welche Hausfarbe hat das Haus mit der Nummer 28?
    Welche Hausfarbe hat das Haus mit der Nummer 45?
    Welche Hausfarbe hat das Haus mit der Nummer 92?
    Welche Hausfarbe hat das Haus mit der Nummer 12? */

    // var hausNummer: MutableList<Int> = mutableListOf(12,45,23,28,36,92)
    /* var hausFarbe: MutableList<String> = mutableListOf("Rot",
        "Blau",
        "Gelb",
        "Grün",
        "Lila",
        "Rosa") */

    var hausNummerUndHausFarbe: Map<Int, String> = mapOf(
        12 to "Rot",
        45 to "Blau",
        23 to "Gelb",
        28 to "Grün",
        36 to "Lila",
        92 to "Rosa",)

    println("Haus 28 hat die Farbe ${hausNummerUndHausFarbe.get(28)}")
    println("Haus 45 hat die Farbe ${hausNummerUndHausFarbe.get(45)}")
    println("Haus 92 hat die Farbe ${hausNummerUndHausFarbe.get(92)}")
    println("Haus 12 hat die Farbe ${hausNummerUndHausFarbe.get(12)}")


}