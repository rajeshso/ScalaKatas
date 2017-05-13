package com.rajesh.kata.tennis

/**
  * Created by Rajesh on 13-May-17.
  */
class Game(player1: Player, player2: Player) {
  def score: String = player1.score + "," + player2.score
}
object Game {
  def apply(player1: Player, player2: Player): Game = new Game(player1, player2)
}
