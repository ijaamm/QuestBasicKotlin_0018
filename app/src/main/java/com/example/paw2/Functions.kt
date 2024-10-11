package com.example.paw2

fun withoutParameter() {
    println("==withoutParameter==")
    println("Hello, World!")
}

fun withParameter(name: String){
    println()
    println("==withParameter==")
    println("Hello, $name")
}

//need argument
//need argument merupakan cara untuk memanggil fungsi dengan menyebutkan nama parameter
fun withNamedArgument(name: String, age: Int){
    println()
    println("==withNamedArgument==")
    println("Hello, $name! you are $age years old.")
}

//default parameter value
//default parameter value merupakan cara untuk memanggil fungsi dengan menyebutkan nama parameter
fun withDefaultParameter(name: String = "indra", age: Int){
    println()
    println("==withDefaultParameter==")
    println("Hello, $name! you are $age years old.")
}

fun withReturn(panjang: Int, lebar: Int) : Int {
    return panjang * lebar
}

fun main() {
    withoutParameter()
    withParameter("Jhon")
    withNamedArgument(name = "Jhon", age = 30)
    withDefaultParameter(age = 25)

    val hasil = withReturn(5, 10)
    println()
    println("==withReturn==")
    println("Luas: $hasil")
}