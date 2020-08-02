package lectures.part1Basics

object Functions extends App {
//  Let's talk about FUNctions!!
  // syntax = def name(param: Type, param2: Type): define resultType = {codeblock}
  def aFunction(a: String, b:Int) :String = {
    a + " " + b
  }

  println(aFunction("hello", 3)) // returns: hello 3

  // PARAMETERLESS FUNCTIONS CAN BE DEFINED AND CALLED BY JUST THEIR NAME
  def parameterlessFun: Int = 42
  println(parameterlessFun) // or

  def aRepeatedFunction(aString: String, n: Int): String = {
    if(n == 1) aString
    else aString + aRepeatedFunction(aString, n-1)
  }
  println(aRepeatedFunction("hello", 3))

  // WHEN YOU NEED LOOPS USE RECURSION - IT'S THE FUNDAMENTAL IDEA OF FUNCTIONAL PROGRAMMING

  def aFunctionWSideEffect(aString: String): Unit = {
    println(aString)
  }

  aFunctionWSideEffect("Will this string print out...?")

  def bigFunction(n: Int): Int = {
    def smallFunction(a: Int, b: Int): Int = a + b

    smallFunction(n, n-1)
  }
  println(bigFunction(25)) // return 49

  /*
    Exercises:
    1. :) A greeting fuction name, age => Hi, my name is name and I am age years old.
    2. :) Factorial function that computes product of all number up to given number, 1 * 2 * 3 * .. * n
    3. :( Had to watch video on this A fibonacci function f(1) = 1 f(2) = 1 f(n) = f(n-1) + f(n-2)
    4. :) A function which tests that a number is prime
  */

// 1
  def greetingFunction(name: String, age: Int): Unit = {
    println("Hello, my name is " + name + ". I am " + age.toString + " years old!")
  }

//  FACTORIAL FUNCTION
  greetingFunction("Miguel", 24)

  def FactorialFunction(number: Int): Int = {
    // Use recursion and logic?
    def Factorial(n: Int): Int = {
      if (n == 0) {
        return 1
      }
      n * Factorial(n - 1)
    }
    Factorial(number)
  }
  println(FactorialFunction(5))

//  Check if number is prime!

  def isPrime(n: Int): Boolean = {
    n % 2 == 0;
  }

  println(isPrime(101 - 1))

  def fibonacci(n: Int): Int =
    if( n<=2 ) 1
    else fibonacci(n - 1) + fibonacci(n - 2)

  println(fibonacci(8))

}
