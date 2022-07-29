package com.info.hackerrank30daysofcode
import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.math.roundToInt
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

class Day2 {

    fun solve(meal_cost: Double, tip_percent: Int, tax_percent: Int): Unit {

        val tip = (meal_cost * tip_percent / 100).toDouble()
        val tax = (meal_cost * tax_percent / 100).toDouble()
        val total_cost = (meal_cost + tip + tax).roundToInt()

        println(total_cost)
    }



}