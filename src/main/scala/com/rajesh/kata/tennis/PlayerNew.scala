package com.rajesh.kata.tennis
import scala.collection.immutable.List

class Player(val name: String) {
  val pointString = List("love", "fifteen", "thirty", "forty", "endofpoints")
  var scoreInt = 0

  def winBall : Unit = if (scoreInt+1 < pointString.length) scoreInt+=1

  def score : String = pointString(scoreInt)
}
object Player {
  def apply(name: String): Player = new Player(name)
}
