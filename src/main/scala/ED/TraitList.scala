package ED

/**
  * Created by aeron on 24/08/17.
  */
trait TraitList {
  def inserir(value : Int) : Unit

  def excluir(id : Int) : Unit

  def pesquisar(value : Int) : Int

  def elementoPosicao(id : Int) : Int

  def tamanho() : Int

  def imprime() : Unit

}
