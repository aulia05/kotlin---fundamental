fun main() {
    //Nullable type
    // Perlu menggunakan tanda ? supaya objek bernilai null
    val text : String? = null
    //val textLength = text.length //Compile time error
    if (text != null) {
        val textLength = text.length //ready to go
    }
}