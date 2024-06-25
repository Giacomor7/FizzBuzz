package com.example.fizzbuzz

fun main()  {
    var i = 1

    do {
        var result = ""
        if (i % 3 == 0){
            result += "Fizz"
        }
        if (i % 5 == 0){
            result += "Buzz"
        }
        if (result == ""){
            result += i.toString()
        }
        print(result + "\n")
        i++
    } while (i <= 100)
}