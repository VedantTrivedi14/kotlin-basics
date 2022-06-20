package com.mywork.myapplication.kotlinfiles

import java.util.*

fun main() {
    println("hello world")
    // var : mutable , val : readonly can't mutable
    var name = "ved"
    println(name)
    name = "vedant"
    println(name)
    name = ""
    println(name)
    println(name.isEmpty())
    var age = 21
    age = 22
    println(age)

    val fullName = "trivedi"
    println(fullName)
//        fullName = "vedant"
    println(fullName::class)

    // explicit type
    var myAge: Int = 21
    val myName: String = "vedant"

    //concat
    println("$myName $myAge")

    //byte-shorts-long-integer
    val myByte: Byte = 8 //8 bit signed integer
    val myShort: Short = 16 //16 bit signed integer
    val myInt: Int = 32 // 32 bit signed integer
    val long: Long = 64 // 64 bit signed integer

    val myFloat: Float = 32.00F //32 bit Floating point number
    val myDouble: Double = 64.00 // 64 bit  Floating point number

    println(myByte.toDouble()::class)

    val bigLong: Long = 1_000_000_00
    println(bigLong)

    val newInt = myInt + 12
    println(newInt)
    println(myInt.plus(12))

    // String object
    var coder: String = "Vedant trivedi"
    println(coder.length)
    println(coder.replaceFirstChar { it.lowercase(Locale.getDefault()) })
    println(coder.uppercase(Locale.getDefault()))

//    Char : 16 bit unicode character
    val c: Char = 'x'
    val backSlash: Char = '\\'
    val newLine: Char = '\n'
    val tab: Char = '\t'

    val foo: String = "y"
//multi line String

    var message: String = "hello\nmy name is vedant trivedi\nHow are you?"
    println(message)

    message = """
        hello 
        i am ved 
        how are you?
    """.trimIndent()
    println(message)

    message = """
      hello 
      i am ved 
      how are you?   
    """
    println(message)

    message = """
      hello 
       i am ved 
       how are you?   
    """.replaceIndent("abc-|-")
    println(message)
    message = """
      hello 
      i am ved 
      how are you?   
    """.trimMargin()
    println(message)

    val nam = "ved"
    println("hello $nam your age is $age, your name is ${nam.length} character long")

    //Boolean
    var isBlank: Boolean = false
    println(isBlank)
    println(isBlank.not())

    isBlank = "".isBlank()
    println(isBlank)

    isBlank = "ved".isBlank()
    println(isBlank)

    // conditional
    var calories = 1700
//    calories = 1900
//    calories =2000
    if (calories > 2000) {
        println("you have consumed all calories for the day")
    } else if (calories > 1500) {
        println("you have some more calories to eat!")
    } else {
        println("you have some calories to left!")
    }

    if (age > 23) println("age is greater then 10") else println("age is less  then 23")
    println("hello")
//    if condition is false then this line is printed but it shouldn't be printed so for more then
//     one line use curly braces

    val myUmar = 21
    val yourUmar = 24

    val myNam = "ved"
    val yourNam = "ar"

//logical and or
    if ((myUmar != yourUmar) && (myNam != yourNam)) {
        println("both true")
    } else {
        println("false")
    }

    if ((myUmar == yourUmar) || (myNam == yourNam)) {
        println("false")
    } else {
        println("true")
    }

//    structurally equality
    var name1 = "ved"
    var name2 = "tri"
    println(name1 == name2)
    println(name1 != name2)
    name2 = "ved"
    println(name1 == name2)
    println(name1 != name2)

//    referential equality
    var a = 10
    var b = 10
    println(a == b)

    class person(var name: String)

    var obj1 = person("ved")
    var obj2 = person("ved")
    println(obj1 === obj2)

//   nullable
    var ab: String = "ved"
//    ab = null
//    ? allow veritable as null
    var abc: String? = "ved"
    abc = null

    var person2: person? = person("foo")
    person2 = null

//    nullable safe calls = ?.
    val firstName = "ved"
    val length = firstName.length

    var lastName: String? = "tri"
    println(lastName?.length)
    lastName = null
    println(lastName?.length)
    lastName = "vedant_trivedi"

    println(lastName?.substring(0, 2)?.length)
    println(lastName?.substring(0, 5)?.drop(2)?.substring(2, 3)?.length)

//    Elvis operator = ?:
    var length1: Int = if ((lastName != null)) lastName.length else 0
    var length2: Int = lastName?.substring(0, 2)?.length ?: 0
//    above both lines are same

    //functions = by default all functions in kotlin has return type unit
    purpleCow()

    var x = purpleCow()
    println(x)

    sayHi()
    hi()
    doWork()
    name("ved",21)
    name("tri",20)
    printUserInfo(firstName="ved",lastName="trivedi",age=21, isSunBurned = false, likeMovies = true, lovesPopcorn = true)
}

fun purpleCow() {
    println("hello purple cow")
    var y = moo()
    println(y)
}

fun moo(): String {
    return "moo!"
}

fun sayHi() {
    println("hi")
    fun sayBye() {
        println("bye")
    }
    sayBye()
}

fun hi() = println("hello")
var salary = 35000
fun doWork() = if (salary > 30000) println("do work") else println("not work")

fun name(name : String, age : Int){
    println("$name your age id $age")
}

fun printUserInfo(firstName: String,lastName: String,age:Int,isSunBurned:Boolean,likeMovies : Boolean,lovesPopcorn : Boolean){
    println("$firstName $lastName is age of $age. sunBurned: $isSunBurned likeMoves :$likeMovies lovePopcorn : $lovesPopcorn")
}