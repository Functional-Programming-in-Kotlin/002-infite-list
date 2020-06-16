package com.example.lazy_evaluation

//class InfinityList {
//
//}

fun main(args: Array<String>) {
    generateSequence(0) { number -> number + 2 }
        .take(100)
        .forEach { number ->
            print(number)
        }
}