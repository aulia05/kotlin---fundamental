fun main() {
    var wordOne = "Modern "
    var wordTwo = "Concise "
    var wordThree = "Pragmatic "
    var wordFour = "Safe"
    var text = """
        kotlin is $wordOne
        kotlin is $wordTwo
        kotlin is $wordThree
        kotlin is $wordFour
        """.trimIndent()

    print(text)
}