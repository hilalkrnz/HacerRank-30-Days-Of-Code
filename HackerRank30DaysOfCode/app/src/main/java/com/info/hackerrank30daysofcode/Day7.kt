package com.info.hackerrank30daysofcode

class Day7 {
    fun main(args: Array<String>) {
        val n = readLine()!!.trim().toInt()

        val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

        arr.reverse();

        for(i in arr.indices){
            print(arr[i])
            print(" ")
        }
    }
}