package com.rajesh.kata.courseraWorksheet

object Week1 {

  //Sum of all ints
  def sumInts(a: Int, b: Int): Int = {
    if (a > b) 0 else a+ sumInts(a+1, b)
  }

  //sum of cubes
  def cube(a: Int): Int = a*a*a

  def sumCubes(a: Int, b: Int) : Int = {
    if (a > b) 0 else cube(a) + sumCubes(a+1,b)
  }

  //sum of factorials
  def factorial(a: Int) :Int = {
    if (a == 0) 1 else factorial(a-1) * a
  }

  def sumFactorial(a: Int, b: Int) : Int = {
    if (a > b) 0 else factorial(a) + sumFactorial(a+1, b)
  }

  //Easier way
  def sum(f: Int => Int, a: Int, b: Int) : Int = {
    if (a > b) 0 else f(a) + sum(f, a+1, b)
  }

  //Annonymous functions or functions as literals (literals mean println("literal") )
  def annonymousExample : Unit = {
    //Notice the function is annonymously declared
    printf("Annonymous example is %d \n", sum( (x:Int) => x*x*x, 1, 5))
  }

  //Tail recursive function
  def sumTC(f: Int => Int) (a: Int, b:Int) : Int = {
    def loop(a:Int, acc: Int) : Int = {
      if (a>b) acc
      else loop(a+1, acc+f(a))
    }
    loop(a, 0)
  }

  //Product function that calculates the product of the values of a function for the points on a given interval
  def product(f: Int => Int) (a: Int, b: Int) : Int = {
    if (a>b) 1
    else f(a) * product(f)(a+1,b)
  }

  //TODO
/*  def mapReduce(f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b: Int): Int = {
    if (a>b) zero
    else combine( f(a), mapReduce(f, combine, zero))(a+1, b)
  }*/

  //Technique 1 = Use datastructure and have functions outside the data structure
  class Rational (x: Int, y: Int) {
    def numer = x
    def denom = y
  }
  //Rational is the datastructure and addRational and makeString are functions
  def addRational(r: Rational, s: Rational) : Rational = {
    new Rational(r.numer * s.denom + s.numer * r.denom, r.denom+ s.denom)
  }

  def makeString(r: Rational) : String = r.numer + "/" + r.denom

  //Technique 2 = data and methods are inside a class = Object oriented
  class RationalOOAD(x: Int, y: Int) {
    require(y!=0,"Denominator should not be zer0")
    def numer = x
    def denom = y
    def add(that: RationalOOAD) : RationalOOAD = {
      new RationalOOAD(numer * that.denom + that.numer * denom, denom+ that.denom)
    }
    override def toString = numer + "/" + denom
  }
  def main(args: Array[String]): Unit = {
    printf("Sum of ints from %d to %d is %d \n",1,3, sumInts(1, 5))
    printf("Sum of cubes from %d to %d is %d \n",1,3, sumCubes(1, 3))
    printf("Sum of factorials from %d to %d is %d \n",1,3, sumFactorial(1,5))


    printf("Sum of ints from %d to %d is %d \n",1,3, sum( (a:Int) => a, 1, 5))
    printf("Sum of cubes from %d to %d is %d \n",1,3, sum(cube,1, 3))
    printf("Sum of factorials from %d to %d is %d \n",1,3, sum(factorial, 1,5))

    annonymousExample

    printf("Tail Recursive: sumInts is %d \n", sumTC(( (x: Int) => x ))( 1, 5))
    printf("Tail Recursive: sumCubes is %d \n", sumTC(( (x: Int) => x*x*x ))( 1, 5))

    //currying
    def curryCube = sumTC(x => x*x*x)_
    printf("1. Curried Sum is %d \n", curryCube(1,5))
    printf("2. Curried Sum is %d \n", sumTC(cube)(1,5))

    //product
    printf("Product of ints from %d to %d is %d \n",1,3, product((a:Int) => a)(1, 3))
    printf("Produc of cubes from %d to %d is %d \n",1,3, product(x=>x*x*x)(1, 3))
    printf("Product of factorials from %d to %d is %d \n",1,3, product(factorial)(1,3))

    //curried factorial
    def curriedProductFactorial(n: Int) =product(factorial)(1,n)
    printf("Product of curriedProductfactorials for %d is %d \n",3, curriedProductFactorial(3))

    //generic function for product and sum
//    def genericProduct(x:Int, y: Int) = mapReduce(product(x=>x)(x,y), ((a,b) => a*b), 1)()
//    printf("Product of ints from %d to %d is %d \n",1,3, mapReduce(x=>x, ( (x,y) => x*y ), 1)(1, 3) )

    //Work with Rationals
    printf("Rational addition is %s \n", makeString(addRational(new Rational(1,2), new Rational(2,3))))

    val thatRational = new RationalOOAD(2,3)
    val thisRational = new RationalOOAD(1,2)
    thisRational.add(thatRational)
    //infix notation is thisRational.add(thatRational)
    printf("Rational addition is %s \n", thisRational add thatRational)
  }
}