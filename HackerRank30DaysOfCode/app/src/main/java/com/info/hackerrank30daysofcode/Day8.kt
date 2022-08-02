package com.info.hackerrank30daysofcode

import java.util.*
import kotlin.collections.HashMap

class Day8 {

    fun main(args: Array<String>) {

        val input = Scanner(System.`in`)
        val n = input.nextInt()

        val contacts = HashMap<String,Int>()

        for(i in 0 until n){

            val name = input.next()
            val phoneNumber = input.nextInt()

            contacts[name] = phoneNumber
        }

        while(input.hasNext()){     //hasNext Scanner sınıfında alınan String değerin altında veri olup olmadığına bakar 

            val name = input.next()

            if(name in contacts){
                val phoneNumber = contacts[name]
                println("$name=$phoneNumber")
            }else{
                println("Not found")
            }
        }

        input.close()

    }
}