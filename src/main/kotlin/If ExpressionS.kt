fun main() {
    val  NilaiDiatasKKM= 80
    val NilaiDibawahKKM  = 65
    val nilai:String
    nilai = if (NilaiDibawahKKM > 65) {
        "Selamat ya! "
    } else if (NilaiDibawahKKM > NilaiDiatasKKM) {
        "Nilai kamu 80, selamat ya! "
    } else {
        "Nilai kamu 65, silakan ikuti remidial. "
    }
    print(nilai)
}