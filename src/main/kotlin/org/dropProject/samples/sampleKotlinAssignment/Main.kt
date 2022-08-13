package org.dropProject.samples.sampleKotlinAssignment

fun findMax(numbers: Array<Int>) : Int {
    var max = numbers[0]
    for (number in numbers) {
        if (max < number) {
            max = number
        }
    }

    if (max < 0) {
        return 0
    }

    return max
}

fun main() {
    val numbers = arrayOf(1, 2, 3, -6, -7)

    println(findMax(numbers))
}