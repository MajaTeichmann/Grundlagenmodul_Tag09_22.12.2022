fun main() {

    /* a) Gegeben ist folgende MutableMap:
    Die MutableMap mappt von Person zu ihrem Lieblingstier.

    val personZuHaustier: MutableMap<String, String> = mapOf(
    "Berta" -> "Hunde"
    "Frank" -> "Katzen"
    "Luis" -> "Mäuse"
    "Sylvia" -> "Eulen"
    "Hans" -> "Pfau" ) */

    val personZuHaustier: MutableMap<String, String> = mutableMapOf(
        "Berta" to "Hunde",
        "Frank" to "Katzen",
        "Luis" to "Mäuse",
        "Sylvia" to "Eulen",
        "Hans" to "Pfau")

    /* Füge der MutableMap die folgenden Paare hinzu, verwendet dazu eine Funktion oder Schreibweise aus der Vorlesung.
    "Tim" -> "Schildkröte"
    "Fabian" -> "Papagei"
    "Jannik" -> "Schlange" */

    var neueHaustiere= mutableMapOf(
        "Tim" to "Schildkröte",
        "Fabian" to "Papagei",
        "Jannik" to "Schlange")

    var alleHaustiere = personZuHaustier + neueHaustiere
    println(alleHaustiere)


    /*
    b)
    Was passiert, wenn du der MutableMap das Paar "Luis" -> "Mäuse" hinzufügst?
    Was passiert, wenn du der MutableMap das Paar "Bernd" -> "Igel" hinzufügst? */

                    // alleHaustiere.put("Luis","Mäuse")

    /*
    c)
    Erstelle eine passende MutableMap. Die MutableMap hat initial (zu Begin) folgende Paare:
    1 -> 2.5
    2 -> 5.0
    3 -> 7.5
    4 -> 10.0 */

    var zahlenPaare: MutableMap<Int,Double> = mutableMapOf(
        1 to 2.5,
        2 to 5.0,
        3 to 7.5,
        4 to 10.0)

    /* Füge dann der Map folgende weitere Paare hinzu:
    10 -> 10.1
    25 -> 45.23
    99 -> 259.46 */

    var weitereZahlenPaare = mutableMapOf(
        10 to 10.1,
        25 to 45.23,
        99 to 259.46)



}