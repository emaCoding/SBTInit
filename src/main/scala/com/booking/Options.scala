package com.booking

object Options {

  def main(args: Array[String]): Unit = {

    /** Simple usage **/
    val result : Option[Int] = Urn.draw(4)
    if (result.isDefined) {
      println("Yey: " + result.get)
    }
    else {
      println("aw...")
    }

    /** getOrElse - Cheating! **/
    val anotherResult : Int = Urn.draw(1) getOrElse 5
    println("Yey: " + anotherResult)
    //getOrElse returns the VALUE of the option expression if Some, otherwise the function specified (5)

  }

  private object Urn {

    val content : Array[Int] = Array(1, 4, 7)

    def draw(guess: Int): Option[Int] = {
      if (content.contains(guess)) Some(guess) else None
    }

  }
}
