                          fun main() {

    /* a) Erstelle eine Map über Waren und ihren Preisen.
    Erstelle eine Map, der Schlüssel ist vom Typ String und der Wert ist vom Typ Double.
    Die Map soll initial (also zu Beginn) mit folgenden Paaren gefüllt sein:
    "Schokolade" -> 1.99
    "Banane" -> 0.29
    "Yoghurt" -> 0.49
    "Müsli" -> 2.99 */

    var warenUndPreise: MutableMap<String, Double> = mutableMapOf(
        "Schokolade" to 1.99,
        "Banane" to 0.29,
        "Yoghurt" to 0.49,
        "Müsli" to 2.99)

    /* b) Erstelle eine MutableMap über Personennamen und ihren Lieblingstieren.
    Erstelle eine Map, der Schlüssel ist vom Typ String und der Wert ist vom Typ String.
    Die Map soll initial mit folgenden Paaren gefüllt sein:
    "Berta" -> "Hunde"
    "Frank" -> "Katzen"
    "Luis" -> "Mäuse"
    "Sylvia" -> "Eulen"*/

    var personenUndLieblingsTier: MutableMap<String, String> = mutableMapOf(
        "Berta" to "Hunde",
        "Frank" to "Katzen",
        "Luis" to "Mäuse",
        "Sylvia" to "Eulen")


    /* c) Erstelle eine Map über Hausnummern und der Hausfarbe.
    Erstelle eine Map, der Schlüssel ist vom Typ Int und der Wert ist vom Typ String.
    Die Map soll initial mit folgenden Paaren gefüllt sein:
    12 -> "Rot"
    45 -> "Blau"
    23 -> "Gelb"
    28 -> "Grün" */

    var hausNummerUndFarbe: MutableMap<Int, String> = mutableMapOf(
        12 to "Rot",
        45 to "Blau",
        23 to "Gelb",
        28 to "Grün")

    println(warenUndPreise + personenUndLieblingsTier + hausNummerUndFarbe)


}
