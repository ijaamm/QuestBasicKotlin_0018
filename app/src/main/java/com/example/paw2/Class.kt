package com.example.paw2

class Motor()

class Contact(val id: Int, var email: String)

fun main(){
    val contact = Contact(1, "marry@gmail.com")

    //print the value of the property: email
    println(contact.email)

    //update the value of the property: email
    contact.email = "jane@gmail.com"

    //print the new value of the property: email
    println(contact.email)
}