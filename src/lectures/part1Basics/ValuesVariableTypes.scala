package lectures.part1Basics

/*
* In this lecture I learned about the basic values, variables, and types available in scala.
* */

object ValuesVariableTypes extends App {

  // VALUES IN SCALA
  // NOTE: val are immutable
  val x: Int = 42

  // VARIABLES IN SCALA
  var aVariable: Int = 1 // vars can be reassigned - are not immutable (var)
  aVariable = 2 // side effects woo!

  /* you don't have to explicitly declare type, compiler can infer, however
  if you do choose to declare, make sure you declare it correctly - e.g do
  not use Int and then declare a string :)
  */

  val y = 42
  println(x, y)

  /* each expression should be written on its own line, so semicolons (;) are
   not required unless you write more than one expression per line, but you
    should NOT do that */
  val aString: String = "Wow, this is a String!?";

  // THE BASIC TYPES
  val aBoolean: Boolean = true //a boolean
  val aChar: Char = 'a' // a character
  val anInt: Int = 34 // an integer
  val aShort: Short = 4613 // a short number compiler will complain if too big
  val aLong: Long = 112312312312312312L // a long number (add L at the end)
  var aFloat: Float = 2.0F // a float, add F at the end
  var aDouble: Double = 3.14 // a double precision floating number, idk wtf



}
