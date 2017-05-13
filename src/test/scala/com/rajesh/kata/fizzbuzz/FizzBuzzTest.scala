package com.rajesh.kata.fizzbuzz

import com.rajesh.kata.UnitSpec
/**
  * Created by Rajesh on 13-May-17.
  */
class FizzBuzzTest extends UnitSpec {
  val fizzBuzz = FizzBuzz
  "The Fizz Buzz object" should " return fizzbuzz for a 15" in {
      fizzBuzz.fizzbuzz(15) shouldBe "fizzbuzz"
  }
  "The Fizz Buzz object" should "return fizz for a 3" in {
    fizzBuzz.fizzbuzz(3) shouldBe "fizz"
  }
  "The Fizz Buzz object" should "return buzz for a 5" in {
    fizzBuzz.fizzbuzz(5) shouldBe "buzz"
  }
  "The Fizz Buzz object" should "return 7 for a 7" in {
    fizzBuzz.fizzbuzz(7) shouldBe "7"
  }
}
