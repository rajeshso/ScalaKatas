package com.rajesh.kata.fizzbuzz

/**
  * Created by Rajesh on 13-May-17.
  */
object FizzBuzz {
  def fizzbuzzSeries(i: Int): List[String] = 1 until i map fizzbuzz toList

  def fizzbuzz(i: Int): String = (i%15, i%3, i%5 ) match {
    case (0, 0, 0) => "fizzbuzz"
    case (_,0,_) => "fizz"
    case (_,_,0) => "buzz"
    case (_,_,_) => i toString
  }

  def fizzbuzzRange(i: Int, j: Int) : List[String] = i to j map(fizzbuzz(_)) toList

 def main(args: Array[String]) : Unit = {
    println(fizzbuzz(10))
    println(fizzbuzzRange(1,10))
  }
}
