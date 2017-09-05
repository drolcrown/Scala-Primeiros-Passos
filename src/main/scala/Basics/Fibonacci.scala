package Basics

/**
  * Created by aeron on 31/08/17.
  */
object Fibonacci extends App {
  def fib (a : Int) : Int = {
    a match {
      case (1 | 0) => 1
      case _ => (a-2 + a-1) + fib(a-1)

    }
  }


  println("Digite um valor: ")
  var a = Console.readInt()
    println(fib(a))


}
