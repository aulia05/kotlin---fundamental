import java.util.Scanner

fun main(args: Array<String>){
    val skors = Scanner(System.`in`)
    print("Masukan nilai Kamu : ")

    var nilai:Int = skors.nextInt()

    if (nilai >= 90 ){
        print ("Nilai kamu $nilai, masuk kategori A")

    }
    else if(nilai >= 80 && nilai <= 90)
    {
        print("Nilai kamu $nilai, masuk kategori B")
    }
    else if (nilai >= 70 && nilai <= 80)
    {
        print("Nilai kamu $nilai, masuk kategori C")
    }
    else if (nilai >= 60 && nilai <= 70)
    {
        print("Nilai kamu $nilai, masuk kategori D")
    }else{
        print("Nilai kamu $nilai, masuk kategori E")

    }
}