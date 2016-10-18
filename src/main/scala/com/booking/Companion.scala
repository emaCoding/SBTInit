package com.booking

object Companion {

  //def adderComposable(x : Int)(y : Int) : Int = x + y
  //def addThree(x : Int) : Int = adderComposable(3)(x)

  def main(args: Array[String]): Unit = {

    println("Default name applied by the factory: " + PuppetFactory.DefaultName)

    //Factory
    val defaultPuppet : Puppet = PuppetFactory()
    println("Default puppet name: " + defaultPuppet.name)

    val myPuppet : Puppet = PuppetFactory("Simon")
    println("Custom puppet name: " + myPuppet.name)

    //Functions
    println("Multiply 4 by ten: " + Tenfolder(4))
    println("Multiply 5 by ten: " + Tenfolder(5))

    //Utility
    println("50 to binary: " + Utilities.toBinary(50, 4))
    println("Uppercasing john: " + Utilities.toUpperCase("john"))
  }

  /** Factory class - Singleton **/
  object PuppetFactory {

    val defName : String = "Nemo"

    def apply() = new Puppet(defName) //default name
    def apply(name : String) = new Puppet(name)

    def DefaultName : String = defName
  }

  /**
    * Puppet class might be private and PuppetFactory
    * the only object which can create his instances
    */
  class Puppet(val name : String) {

    var kilos : Int = 2

    //secondary constructor not used
    def this(name : String, kilos : Int) {
      this(name)
      this.kilos = kilos
    }
  }

  object Tenfolder {
    def apply(i : Int) = i * 10
  }

  /** Utility class **/
  object Utilities {
    def toBinary(i: Int, digits: Int = 8) : String = "010111"
    def toUpperCase(s: String) : String = s.toUpperCase
  }
}
