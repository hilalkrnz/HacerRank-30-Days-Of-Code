package com.info.hackerrank30daysofcode

import kotlin.math.max

class Day10 {

    fun main(args: Array<String>) {

        val n = readLine()!!.trim().toInt()

        val binary = Integer.toBinaryString(n)

        val string = binary.toString()


        var currentMax = 0
        var counter = 0

        for(i in string){

            if(i == '1'){

                counter++

            }else{
                currentMax = max(counter, currentMax)
                counter = 0
            }

        }

        println(max(counter, currentMax))

    }
}