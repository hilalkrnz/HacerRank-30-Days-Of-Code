package com.info.hackerrank30daysofcode

class Day4Person(initialAge : Int) {

    var age = 0

    init {
        when{
            initialAge < 0 -> println("Age is not valid, setting age to 0.")

            else -> {
                age = initialAge
            }
        }
    }

    fun amIOld(){

        when{
            age < 13 -> println("You are young.")
            age < 18 -> println("You are a teenager.")

            else -> {
                println("You are old.")
            }
        }
    }

    fun yearPasses(){
        age++
    }

    fun main(args: Array<String>) {
        val T = readLine()!!.toInt()
        for (i in 0 until T) {
            val age = readLine()!!.toInt()
            val p = Day4Person(age)
            p.amIOld()
            for (j in 0..2) {
                p.yearPasses()
            }
            p.amIOld()
            println()
        }
    }
}