package Basics

/**
  * Created by aeron on 05/09/17.
  */
object GeradorAleatorio extends App{
  val max = 26
  var vetor = new Array[Int](max);
  //var vetorVencedor = new Array[Int](15)
  val numberRandom = scala.util.Random
  var inteiro = 0; var maior = 0; var j = 0
  var marcador = 0

  for(i <- 0 to 1000000){
    inteiro = numberRandom.nextInt(max)
    vetor(inteiro) += 1
  }


  //println("Vetor[" + i + "] = " + vetor(i))

  for (j <- 0 until 15){
    maior = 0
    for (i <- 1 until max-1){
      if (maior < vetor(i)) {
        maior = vetor(i)
        marcador = i
      }
    }
    vetor(marcador) = 0
    //vetorVencedor(j) = maior
    print("(" + marcador + ") ")
  }
}
