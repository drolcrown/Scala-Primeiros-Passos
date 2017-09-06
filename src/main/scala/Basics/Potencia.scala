package Basics

/**
  * Created by aeron on 05/09/17.
  */
class Potencia{

  def Potenciacao(valor : Double, pot : Int) : Double = {
    var resultado = 1.0

    for (i <- 1 to pot) {
      resultado = valor * resultado
    }
    resultado
  }
}

