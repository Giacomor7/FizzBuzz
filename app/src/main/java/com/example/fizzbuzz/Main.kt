package com.example.fizzbuzz

fun main()  {
    var i = 1

    while (i <= 300) {
        print(calculateFizzBuzz(i) + "\n")
        i++
    }
}

private fun calculateFizzBuzz(i: Int): String {
    var result = emptyArray<String>()
    result = fizz(i, result)
    result = buzz(i, result)
    result = bang(i, result)
    result = bong(i, result)
    result = fezz(i, result)
    reverse(i, result)
    result = default(result, i)
    var output = ""
    for (word in result) {
        output += word
    }
    return output
}

private fun default(
    result: Array<String>,
    i: Int
): Array<String> {
    var result1 = result
    if (result1.isEmpty()) {
        result1 += i.toString()
    }
    return result1
}

private fun reverse(i: Int, result: Array<String>) {
    if (i % 17 == 0) {
        result.reverse()
    }
}

private fun fezz(
    i: Int,
    result: Array<String>
): Array<String> {
    var result1 = result
    if (i % 13 == 0) {
        var tempResult = emptyArray<String>()
        var fezzAdded = false
        for (word in result1) {
            if (word[0] == 'B' && !fezzAdded) {
                tempResult += "Fezz"
                fezzAdded = true
            }
            tempResult += word
        }
        if (!fezzAdded) {
            tempResult += "Fezz"
        }
        result1 = tempResult
    }
    return result1
}

private fun bong(
    i: Int,
    result: Array<String>
): Array<String> {
    var result1 = result
    if (i % 11 == 0) {
        result1 =
            arrayOf("Bong") // opted for readability over performance: could refactor so previous if blocks do not evaluate in this case
    }
    return result1
}

private fun bang(
    i: Int,
    result: Array<String>
): Array<String> {
    var result1 = result
    if (i % 7 == 0) {
        result1 += "Bang"
    }
    return result1
}

private fun buzz(
    i: Int,
    result: Array<String>
): Array<String> {
    var result1 = result
    if (i % 5 == 0) {
        result1 += "Buzz"
    }
    return result1
}

private fun fizz(
    i: Int,
    result: Array<String>
): Array<String> {
    var result1 = result
    if (i % 3 == 0) {
        result1 += "Fizz"
    }
    return result1
}