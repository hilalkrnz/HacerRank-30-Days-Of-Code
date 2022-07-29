package com.info.hackerrank30daysofcode

class Day3 {
    fun main(args: Array<String>) {
        val N = readLine()!!.trim().toInt()

        when{

            N % 2 != 0 -> print("Weird")
            N < 6 -> print("Not Weird")
            N < 21 -> print("Weird")

            else -> {
                print("Not Weird")
            }

        }
    }

}