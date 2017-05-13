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
    nimalan.score should be ("love")
    nithilan.score should be ("love")
  }
  "Points" should "not be added after 3" in {
    val nimalan = Player("Nimalan")
    val nithilan = Player("Nithilan")
    nimalan.winBall
    nimalan.winBall
    nimalan.winBall
    nimalan.winBall
    nimalan.winBall
    nimalan.winBall
    nimalan.scoreInt should be(3)
    nimalan.score should be ("forty")
  }
  "Players" should "be able to join the game" in {
    val nimalan = Player("Nimalan")
    val nithilan = Player("Nithilan")
    val game = Game(nimalan, nithilan)
    game.score should be ("love,love")
  }
}
