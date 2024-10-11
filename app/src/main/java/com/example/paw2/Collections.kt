package com.example.paw2

/*  - list adalah kumpulan data yang di susun secara beruntun  dari
    - list bersifat ordered, artinya data yang dimasukan akan memiliki posisi sesuai urutan
    - list bersifat mutable dan read only artinya data yang dimasukan dapat di ubah dan tidak dapat di ubah
    - list read only menggunakan listof
    - list mutable menggunakan mutabelistof
 */

fun ContohList(){
    println("===List===")
    //list read-only
    val readOnlyAbjad = listOf("A", "B", "C")
    println(readOnlyAbjad)

    //list mutable
    val shape: MutableList<String> = mutableListOf("Circle", "Square", "Triangle")
    println(shape)

    //menambahkan data pada list mutable
    shape.add("Circle")
    println(shape)

    //menghapus data dari list mutable
    shape.remove("Triangle")
    println(shape)

    //mengubah data di dalam list mutable
    shape[0] = "Oval"
    println(shape)

    //list read only
    val shapesLocked: List<String> = shape
    println(shapesLocked)
}

/*  - set adalah kumpulan data yang tidak memiliki posisi atau urutan tertentu dan hanya menyimpan data unik (tidak ada duplikasi)
    - set bersifat unordered, artinya data yag di masukan tidak memiliki posisi tertentu
    - set bersifat mutable dan read only, artinya data yang dimasukan dapat di ubah dan tidak dapat di ubah
    - set read only menggunakan setOf
    - set mutable menggunakan mutableSetOf
 */

fun ContohSet(){
    println()
    println("===Set===")

    //set Read-Only
    val readOnlyAbjad = setOf("A", "B", "C")
    println(readOnlyAbjad)

    //set mutable
    val shape: MutableSet<String> = mutableSetOf("Circle", "Square", "Triangle")
    println(shape)

    //menambahkan data kedalam set mutable
    shape.add("Rectangle")
    println(shape)

    //menghapus data dari set mutable
    shape.remove("Circle")
    println(shape)

    //list read only
    val shapesLocked: Set<String> = shape
    println(shapesLocked)
}

/*  - map adalah kumpulan data yang disusun dalam pasangan key-value
    - map bersifat unordered, artinya data yang di masukan tidak memiliki posisi tertentu
    - map bersifat mutable dan read-only, artinya data yang di masukan dapat di ubah dan tidak dapat di ubah
    - map read-only menggunakan mapOf
    - map mutable menggunakan mutableMapOf
 */

fun ContohMap(){
    println()
    println("===Map===")

    //Map Read-Only
    val readOnlyShape: Map<String, Int> = mapOf("Circle" to 1, "Square" to 2, "Triangle" to 3)
    println(readOnlyShape)

    //Map mutable
    val shape: MutableMap<String, Int> = mutableMapOf("Circle" to 1, "Square" to 2, "Triangl" to 3)

    //menambahkan data ke dalam map mutable
    shape["Rectangle"] = 4
    println(shape)

    //menghapus data dari map mutable
    shape.remove("Circle")
    println(shape)

    //mengubah data didalam map mutable
    shape["Square"] = 5
    println(shape)

    //Map Read-Only
    val shapesLocked: Map<String, Int> = shape
    println(shapesLocked)
}

fun main(){
    ContohList()
    ContohSet()
    ContohMap()
}