package Basics

/**
  * Created by aeron on 31/08/17.
  */
object Array extends App{
  println("Digite o tamanho do vetor: ")
  var b = Console.readInt()

  var vetor = new Array[Int](b)

  vetor(2) =  32
  for (i <- 0 until b){
    println("Vetor[" + i + "] = " + vetor(i))
  }
}
