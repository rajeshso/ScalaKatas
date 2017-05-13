package com.rajesh.kata.tennis

import com.rajesh.kata.UnitSpec

/**
  * Created by Rajesh on 13-May-17.
  */
class Play extends UnitSpec {
  "Points" can "be added to each Player" in {
    val nimalan = Player("Nimalan")
    val nithilan = Player("Nithilan")
    nimalan.winBall
    nithilan.winBall
    nimalan.scoreInt should be(1)
    nithilan.scoreInt should be(1)
  }
  "Love" should "be description for score 0" in {
    val nimalan = Player("Nimalan")
    val nithilan = Player("Nithilan")
    nimalan.score should be("love")
    nithilan.score should be("love")
  }
  "Points" should "not be added after 4" in {
    val nimalan = Player("Nimalan")
    val nithilan = Player("Nithilan")
    (0 to 6).foreach(x=> nimalan.winBall)
    nimalan.scoreInt should be(4)
    nimalan.score should be("endOfPoints")
  }
  "Players" should "be able to join the game" in {
    val nimalan = Player("Nimalan")
    val nithilan = Player("Nithilan")
    val game = Game(nimalan, nithilan)
    game.score should be("love,love")
  }
  "Advantage" should "describe when least three points have been scored by each side and a player has one more point than his opponent" in {
    val nimalan = Player("nimalan")
    val nithilan = Player("nithilan")
    val game = Game(nimalan, nithilan)
    (0 to 3).foreach(x => nimalan.winBall)
    (0 to 2).foreach(x => nithilan.winBall)
    game.score should be("advantage nimalan")
  }
  "Deuce" should "mean both the players have same points" in {
    val nimalan = Player("nimalan")
    val nithilan = Player("nithilan")
    val game = Game(nimalan, nithilan)
    (0 to 3).foreach(x => nimalan.winBall)
    (0 to 4).foreach(x => nithilan.winBall)
    game.score should be("deuce")
  }
}
