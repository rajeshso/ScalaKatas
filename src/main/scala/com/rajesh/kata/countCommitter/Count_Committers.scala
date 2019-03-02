package com.rajesh.kata.countCommitter

object Count_Committers {
  def main(args: Array[String]): Unit = {
    println("There are "+ io.Source.fromFile(args(0)).getLines().size + " Spark committers")
    val myList = List[String]("Raj" , "Rajesh")
    val myMap = Map[String, String] ("Raj" -> "Director", "so" -> "Director")
    val myTuple = ("Raj", "Somasundaram")
    val f1 = (x: Int) => x+1
    println(f1.getClass)
    println(f1(2))
    val x = 9
    val resultX = if ( x < 10 ) "Less" else "More"
    println(resultX)
    for ( i <- 0 to 10) print(i +" , ")
    var y = 0
    while( y < 9) {
      print(y + ",")
      y = y+ 2
    }
    // => means passing parameter by name. means expression will be evaluated when parameter is accessed.
    val z = Seq(1,2,3,4,5).map(x => x + 1)
    print(z)
  }
}



