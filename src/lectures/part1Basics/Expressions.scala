package lectures.part1Basics

object Expressions extends App {

  val x = 1 + 2 // this is an expression, most basic ones are math

  println(x)
  println(2 + 3 + 4)

  // operators + - * / & | ^ << >> >>>(right shift with zero extension)
  // expressions always evaluate to something, there are many types of them

  //RELATIONAL EXPRESSIONS (== != > >- < <=
  println(1 == x) // false

  // BOOLEAN OPERATORS
  println(!(1 == x)) // logical negation, if false true and vise versa

  var aVariable = 2
  aVariable += 3 // add to previous var (-= *= /=)

  //expressions are side effects

  // INSTRUCTIONS VS EXPRESSION
  /*
  An Instruction is something that you tell the computer to do, but an
  expression is something that has a value and/or a type.
  */

  // IF EXPRESSION is an expression and not an instruction!
  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3 // if true print 5 else print 3
  println(aConditionedValue)

  //  There are loops in Scala, but they're discourages because they don't return anything meaningful and should be DEAD
  var i = 0
  while(i < 10){
    println(i)
    i += 1
  }

  // NEVER WRITE THIS AGAIN, IMPERATIVE LANGUAGES USE IT, SCALA IS NOT ABOUT THAT

  // EVERYTHING IS SCALA IS AN EXPRESSION...
  val aWeirdValue: Unit = aVariable = 3 // This is a unit (), which is a void... it's not meaningful
  println(aWeirdValue)

  // side effects: println(), whiles, reassigning of vars - expressions returning units
  // side effects are reminiscent of imperative languages

  // Code blocks - a special kind of expression with special props
  val aCodeBlock = {
    val a = 1
    val b = a + 2
    if (b > 2) "hello" else "goodbye"
  }
  /*
   code block is an expression like everything else in scala, the value of block is the value
   of the last expression because it occurs last...if you hover over the above codeblock it will
   be identified as a string, because that is the type of the value of the last expression.
   NOTE: codeblocks have local scope, only visible to code inside the block... like JS functions
   */
}

