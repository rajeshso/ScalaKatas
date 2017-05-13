package com.rajesh.kata.tennis

/**
  * Created by Rajesh on 13-May-17.
  */
class Player(val name: String) {
  val pointString = List("love", "fifteen", "thirty", "forty" , "endOfPoints")
  var scoreInt = 0

  def winBall: Unit = if (scoreInt + 1 < pointString.length) scoreInt +=1

  def score: String = pointString(scoreInt)
}

object Player {
  def apply(name: String): Player = new Player(name)
}