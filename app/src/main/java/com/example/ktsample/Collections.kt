package com.example.ktsample

fun fibonachiJazz() {
    listOf(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987,
        1597, 2584, 4181, 6765, 10946, 17711)
        .filter { it % 2 == 0 }
        .map { it.toString() }
        .flatMap { numStr -> numStr.toList() }
        .distinct()
        .sorted()

}