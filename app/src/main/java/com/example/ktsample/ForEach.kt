package com.example.ktsample

fun <T> Iterable<T>.myForEach(action: (T) -> Unit) {
    for (element in this) action(element)
}
