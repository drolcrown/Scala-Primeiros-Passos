package TP1.test

import TP1.main.User

/**
  * Created by aeron on 05/09/17.
  */
object Gastos extends App{

  var user1 = new User

  user1.setNome("Rafael")
  println(user1.getNome())
  user1.setRenda(200)
  println("Renda = " + BigDecimal(user1.getRenda()).setScale(2, BigDecimal.RoundingMode.HALF_UP))
  user1.gastos.setLeisure(100.60)
  println("Leisure = " + user1.gastos.getLeisure())
  printf("Gastos = " + BigDecimal(user1.getGastos()).setScale(2, BigDecimal.RoundingMode.HALF_UP))

  //TODO : O comando abaixo serve para limitar o numero de casas depois da virgula
  // BigDecimal().setScale(2, BigDecimal.RoundingMode.HALF_UP))

}
