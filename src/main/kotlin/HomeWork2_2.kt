//Задача №2 - "Люди/Человеки"

val endingY = "человеку"
val endingM = "людям"
val endingMZ = "людям (никому)"
val endingEY = "людей"


fun pickPhrase(count: Int): String? {
    print("Понравилось $count ")
    if (count == 0) return endingMZ

    var count = count % 100
    return if ((count >= 11) && (count <= 19)) {
        endingM
    } else {
        val i = count % 10

        when (i) {
            1 -> endingY
            4 -> endingEY
            else -> endingM
        }
    }
}

fun main() {
    println((pickPhrase(0)))
    println((pickPhrase(1)))
    println((pickPhrase(5)))
    println((pickPhrase(3)))
    println((pickPhrase(10)))
    println((pickPhrase(11)))
    println((pickPhrase(12)))
    println((pickPhrase(71)))
    println((pickPhrase(72)))
    println((pickPhrase(80)))
    println((pickPhrase(12)))
    println((pickPhrase(992)))
    println((pickPhrase(1992)))
}