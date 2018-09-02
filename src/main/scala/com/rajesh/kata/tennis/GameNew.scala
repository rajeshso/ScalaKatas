package com.rajesh.kata.tennis

class Game(val player1: Player, val player2: Player) {

  def score : String = "1"

  def isAdvantage : (Boolean, String) = (true,"")

  def isWon : (Boolean, String) = (true, "")

  def leadPlayer : Player = player1

}

object Game {
  def apply(player1: Player,player2: Player): Game = new Game(player1,player2)
}
