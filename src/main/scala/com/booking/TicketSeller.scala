package com.booking

import akka.actor.{Actor, Props}

object TicketSeller {

  def adderComposable(x : Int)(y : Int) : Int = x + y

  def addThree(x : Int) : Int = adderComposable(3)(x)

  def main(args: Array[String]): Unit = {
    val job = new Job("Gogo")
    println("Order a Ticket: " + job.title)
  }

  private case class Job(title: String) {

    println("I'm executed with the main constructor")

    //secondary constructor
    def this() {
      this("Hello")
    }
  }

}
