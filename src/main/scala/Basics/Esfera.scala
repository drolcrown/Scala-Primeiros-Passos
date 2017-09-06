package Basics

/**
  * Created by aeron on 05/09/17.
  */
object Esfera extends App{

  var pot = new Potencia
  var volume = (4 / 3) * 3.14159265359 * pot.Potenciacao(0.5, 3)
  var volumeM = volume * 60 * 2.5
  var probabilidade = (volume / volumeM) * 100

  println( BigDecimal(volumeM).setScale(0, BigDecimal.RoundingMode.HALF_UP))

  println(probabilidade)

  //println("Teste = " + pot.Potenciacao(2, 5))
}