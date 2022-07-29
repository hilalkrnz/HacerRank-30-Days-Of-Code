package com.info.hackerrank30daysofcode
import java.io.*
import java.util.*

class Day6 {


    fun main(args: Array<String>) {

        val input = Scanner(System.`in`)
        val n = input.nextInt()

        input.nextLine()

        for(i in 0 until n){
            val string = input.nextLine()
            val chars = string.toCharArray()

            for(j in chars.indices){

                if(j % 2 == 0){
                    print(chars[j])
                }
            }

            print(" ")

            for(j in chars.indices){

                if(j % 2 != 0){
                    print(chars[j])
                }
            }

            println()
        }
        input.close()
    }
}