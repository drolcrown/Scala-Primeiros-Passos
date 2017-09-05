package Basics

/**
  * Created by aeron on 05/09/17.
  */
class User {
  var nome = ""
  var renda = 0.0

  def getNome() : String = {
    nome
  }

  def setNome(name : String) : Unit = {
    this.nome = name
  }

  def getRenda() : Double = {
    renda
  }

  def setRenda(renda: Double) : Unit = {
    this.renda = renda
  }

}
