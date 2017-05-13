package com.rajesh.kata.fizzbuzz

/**
  * Created by Rajesh on 13-May-17.
  */
object FizzBuzz {
  def fizzbuzz(i: Int) : String = (i%15, i%3, i%5) match {
    case(0,0,0) => "fizzbuzz"
    case(_,0,_) => "fizz"
    case(_,_,0) => "buzz"
    case(_,_,_) => i.toString
  }
}