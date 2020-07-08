//enum class NamaHari() {
//    SENIN,
//    SELASA,
//    RABU,
//    KAMIS,
//    JUMAT,
//    SABTU,
//    MINGGU
//}

class DataKu {
    var name: String = ""
//        get() = field        // getter
//        set(value) {         // setter
//            field = value
//        }
    var kelas: String = ""
}

fun main() {
    //TODO ini adalah contoh penggunaan dari Map Collection
//    val mentorBinar = mapOf("KelasAndroid" to "Mas Binar","KelasAndroid" to "Mas Senno", "KelasFrontEnd" to "Mas Tata", "KelasBackEnd" to "Mas Reza")
//    val mentorBinar = mapOf(1 to "Mas Binar" to 'A' to 4.5f to 5.5 to "Mas Abrar")

//    mentorBinar.forEach{i, s -> println("$i, Nama Mentor : $s")}

    //TODO ini adalah contoh penggunaan dari MutableMap
    val studentAndroidBinar = mutableMapOf(1 to "Andri", 2 to "Andra", 3 to "Andi", 4 to "Abrar", 5 to "Nanda")

    println("All item of MutableMap : ${studentAndroidBinar.entries}")
    println("Key on MutableMap : ${studentAndroidBinar.keys}")
    println("Values on MutableMap : ${studentAndroidBinar.values}")

    //TODO ini adalah contoh penggunaan dari Enum Class
//    val namaHari = enumValues<NamaHari>().joinToString { it.name }
//
//    println("Berikut nama hari dalam seminggu : $namaHari")

    //TODO ini adalah contoh penggunaan setter dan getter
    val namaKu = DataKu()
    namaKu.name = "Andri" // ini akses setter
    namaKu.kelas = "Andorid Binar"
    println(" Nama Saya Adalah ${namaKu.name}") // ini untuk akses getternya
    println(" Kelas Saya Adalah ${namaKu.kelas}")

    //TODO Link DATA Class : https://yoesuv.blogspot.com/2017/08/kotlin-data-classes.html
}