package com.rajesh.kata.fizzbuzz

/**
  * Created by Rajesh on 13-May-17.
  */
object FizzBuzz {
  def fizzbuzz(i: Int) : String = {
    if (i%15==0) "fizzbuzz"
    else if (i%3 == 0) "fizz"
    else if (i%5 == 0) "buzz"
    else i.toString
  }
}
