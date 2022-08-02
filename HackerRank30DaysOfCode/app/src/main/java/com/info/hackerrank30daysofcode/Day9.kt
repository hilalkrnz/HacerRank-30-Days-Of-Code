package com.info.hackerrank30daysofcode

class Day9 {

    fun factorial(n: Int): Int {
        var result = 1
        for(i in 1..n){
            result = result * i
        }
        return result

    }

    fun main(args: Array<String>) {
        val n = readLine()!!.trim().toInt()

        val result = factorial(n)

        println(result)
    }
}