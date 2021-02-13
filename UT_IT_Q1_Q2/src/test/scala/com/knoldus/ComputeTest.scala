package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class ComputeTest extends AnyFlatSpec {

  val compute = new Compute

  "Divide" should "have 2 numbers" in {

    val result: Double= compute.divide(20,10)
    assert(result == 2.0)
  }

  it should "through ArithmeticException if attempted to divided by 0" in {

    assertThrows[ArithmeticException] {
      compute.divide(10,0)
    }
  }

  "Fibonacci" should "have a positive or zero number" in {

    val result: List[Int]= compute.fibonacci(10)
    assert(result==List(0, 1, 1, 2, 3, 5, 8))
  }

  it should "through IllegalArgumentException if negative number provided" in {

    assertThrows[IllegalArgumentException] {
      compute.fibonacci(-2)
    }
  }

  it should "return 0 if 0 is provided" in {

    val result: List[Int]= compute.fibonacci(0)
    assert(result == List(0))
  }
}
