fun main() {

    /* Wir können auch die Werte bereits vorhandener Paare ändern. Schreibe deine Lösungen in die Datei für diese Aufgabe.

    a) Gegeben ist folgende MutableMap:
    Die MutableMap mappt von einer Person zu ihrem Lieblingstier.

    val personZuHaustier: MutableMap<String, String> = mapOf(
        "Berta" -> "Hunde"
    "Frank" -> "Katzen"
    "Luis" -> "Mäuse"
    "Sylvia" -> "Eulen"
    "Hans" -> "Pfau") */

    val personZuHaustier: MutableMap<String, String> = mutableMapOf(
        "Berta" to "Hunde",
        "Frank" to "Katzen",
        "Luis" to "Mäuse",
        "Sylvia" to "Eulen",
        "Hans" to "Pfau")


    /*
    Verwende für die folgenden Teilaufgaben eine passende Funktion oder Schreibweise aus der Vorlesung.
    Ändere den Wert des Paares "Berta" -> "Hunde" zu "Berta" -> "Esel"
    Ändere den Wert des Paares "Sylvia" -> "Eulen" zu "Sylvia" -> "Pferde"
    Ändere den Wert des Paares "Frank" -> "Katzen" zu "Frank" -> "Spechte"
    Ändere den Wert des Paares "Luis" -> "Mäuse" zu "Luis" -> "Spechte" */

    println("original: ${personZuHaustier}")
    personZuHaustier.set("Berta","Esel")
    println("Berta mit Esel: ${personZuHaustier}")
    personZuHaustier.set("Sylvia","Pferde")
    println("Sylvia mit Pferde: ${personZuHaustier}")
    personZuHaustier.set("Frank","Spechte")
    println("Frank mit Spechte: ${personZuHaustier}")
    personZuHaustier.set("Luis","Spechte")
    println("Luis mit Spechte: ${personZuHaustier}")


    /*
    b) Fragen:
    Kann eine Map oder MutableMap diese zwei Paare enthalten?
    "Berta" -> "Hunde"
    "Berta" -> "Hunde"
    Falls nein, ändere nur einen Schlüssel oder nur einen Wert, sodass eine Map oder MutableMap beide Paare enthalten kann. */


    //nein ist nicht möglich, weil maps einzigartig sind (keine doppelten keys + values)


}