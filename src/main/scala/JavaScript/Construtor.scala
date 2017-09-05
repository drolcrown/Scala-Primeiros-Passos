package JavaScript

/**
  * Created by aeron on 04/09/17.
  */
abstract class Construtor(){
  var name: String
  var value: Int

  def Construtor(nome : String, valor : Int) {
    name = nome
    value = valor
  }

  def Construtor() {
    name = "Nome Padrão"
    value = 0
  }

  def Construtor(nome : String) {
    name = nome
    value = 0
  }




}