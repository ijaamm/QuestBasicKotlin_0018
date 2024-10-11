package com.example.paw2

/*  - Lambda function
    - Lambda function adalah fungsi yang tidak memiliki nama
    - lambda function biasanya digunakan untuk membuat fungsi yang sederhana
    - lambda function menggunakan tanda -> untuk memisahkan parameter dan body fungsi
 */

fun uppercaseString(string: String): String{
    return string.uppercase()
}

//dapat di tulis dalam ekspresi lambda sbb:
fun main(){
    uppercaseString("Hello")
    println({string: String -> string.uppercase() }("Hello"))
    //HELLO
}