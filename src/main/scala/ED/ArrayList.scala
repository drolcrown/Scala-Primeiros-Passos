package ED

/**
  * Created by aeron on 24/08/17.
  */
class ArrayList extends TraitList{
  val max = 10

  var elements = new Array[Int](max)
  var idx = 0

  override def imprime(): Unit = {
    for (i <- 0 until tamanho()){
      println("Elemento(" + i + ") = " + elements(i))
    }
  }

  override def inserir(value: Int): Unit = {
    if (idx < max){
      elements(idx) = value
      idx += 1
    }
  }

  override def excluir(id: Int): Unit = {
    var aux = 0;
    var i = 0

    if (id >= 0 && id < idx){
      while (i < idx) {
        if (id == i) {
          while (elements(i + 1) != 0) {
            elements(i) = elements(i + 1)
            i += 1
          }
        }
        i += 1
      }
    idx -= 1
    }
  }

  override def pesquisar(value: Int): Int = {
    var encontrado = -1
    for (i <- 0 until idx){
      if(value == elements(i)){
        encontrado = i
      }
    }
    encontrado
  }

  override def tamanho(): Int = idx

  override def elementoPosicao(id: Int): Int = {
    var encontrado = -1
    for (i <- 0 until idx){
      if(id == i){
        encontrado = elements(i)
      }
    }
    encontrado
  }

}
