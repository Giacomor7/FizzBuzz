package com.example.fizzbuzz

fun main()  {
    var i = 1

    while (i <= 300) {
        var result = emptyArray<String>()
        if (i % 3 == 0){
            result += "Fizz"
        }
        if (i % 5 == 0){
            result += "Buzz"
        }
        if (i % 7 == 0){
            result += "Bang"
        }
        if (i % 11 == 0){
            result = arrayOf("Bong") // opted for readability over performance: could refactor so previous if blocks do not evaluate in this case
        }
        if (i % 13 == 0){
            var tempResult = emptyArray<String>()
            var fezzAdded = false
            for (word in result){
                if (word[0] == 'B' && !fezzAdded){
                    tempResult += "Fezz"
                    fezzAdded = true
                }
                tempResult += word
            }
            if (!fezzAdded){
                tempResult += "Fezz"
            }
            result = tempResult
        }
        if (i % 17 == 0){
            result.reverse()
        }
        if (result.isEmpty()){
            result += i.toString()
        }
        var output = ""
        for (word in result){
            output += word
        }
        print(output + "\n") // result is now an array!
        i++
    }
}