package org.dropProject.samples.sampleKotlinAssignment

fun findMax(numbers: Array<Int>): Int {
    var max = numbers[0]
    for (number in numbers) {
        if (number > max) {
            max = number
        }
    }

    return max
}

fun main() {
    val numbers = arrayOf( 1, 3, 7, 4, 2)
    println("max = ${findMax(numbers)}")
}