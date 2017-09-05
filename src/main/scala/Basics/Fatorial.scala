package Basics

/**
  * Created by aeron on 31/08/17.
  */
object Fatorial extends App{
  def fat (a : Int) : Int ={
    a match {
      case 0 => 1
      case _ => a *  fat(a-1)
    }
  }
  println("Digite um valor: ")
  var a = Console.readInt()
  println("Fatorial de " + a + " é = " + fat(a))
}
