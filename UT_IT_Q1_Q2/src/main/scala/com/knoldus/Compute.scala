package com.knoldus

trait Calculation{            //interface with two methods divide and fibonacci

  def divide(divident: Int,divisor: Int): Double
  def fibonacci(upto:Int):List[Int]
}

class Compute extends Calculation
{

  def divide(divident: Int,divisor: Int) :Double = {      // Return divide

    if(divisor == 0){

      throw new ArithmeticException("Not divisible by zero")
    }
    divident/divisor
  }

  def fibonacci(upto:Int):List[Int]={         // Return Fibonacci Sequence Up to a Certain Number

    if(upto<0)
      throw new IllegalArgumentException("Negative number not allowed")
    var FibonacciSeries = List.empty[Int]
    var firstTerm = 0
    var secondTerm = 1
    var nextTerm=0

    while(nextTerm<=upto){

      FibonacciSeries=FibonacciSeries:+nextTerm       // Append next term in the list
      firstTerm=secondTerm
      secondTerm=nextTerm
      nextTerm=firstTerm+secondTerm
    }
    FibonacciSeries
  }
}