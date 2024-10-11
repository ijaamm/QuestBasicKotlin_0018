package com.example.paw2

/*  - Data class
    - Data class adalah class yang di gunakan untuk menyimpan data
    - Data class menyediakan fungsi untuk untuk meng-override fungsi equals(), hashCode(), dan toString()
    - Data class juga menyediakan fungsi copy() untuk membuat salinan objek dengan beberapa perubahan
 */

data class DataClass(
    val id: Int,
    var email: String
)

fun main(){
    val data = DataClass(1, "indra@gmail.com")
    println(data)

    //fungsi equals
    val data2 = DataClass(1, "makan@gmail.com")
    println(data == data2) //false

    //fungsi copy
    val data3 = data.copy()
    println(data3)

    //fungsi copy dan perubahan
    val data4 = data.copy(email = "sahar@gamil.com")
    println(data4)
}