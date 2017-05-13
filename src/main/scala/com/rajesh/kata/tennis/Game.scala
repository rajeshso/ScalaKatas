package com.rajesh.kata.tennis
import java.lang.Math._
/**
  * Created by Rajesh on 13-May-17.
  */
class Game(player1: Player, player2: Player) {
  def score: String = {
    val won = isWon
    val advantage = isAdvantage
    val isDeuce = ( player1.scoreInt>=3 || (player1.scoreInt>=3) ) && player1.scoreInt == player2.scoreInt
    if (won._1) "won "+ won._2 else if (isDeuce) "deuce" else if (advantage._1) "advantage "+advantage._2 else player1.score + "," + player2.score
  }
  def isAdvantage: (Boolean, String) = (player1.scoreInt + player2.scoreInt == 7) match
    {
    case true => (true, leadPlayer.name)
    case false => (false, "")
  }
  def isWon : (Boolean, String) = {
    val won = ( player1.scoreInt>=4 || (player1.scoreInt>=4) ) && (abs(player1.scoreInt - player2.scoreInt)==2)
    if (won) (true, leadPlayer.name) else (false,"")
  }
  def leadPlayer : Player = if (player1.scoreInt > player2.scoreInt) player1 else player2

}
object Game {
  def apply(player1: Player, player2: Player): Game = new Game(player1, player2)
}
