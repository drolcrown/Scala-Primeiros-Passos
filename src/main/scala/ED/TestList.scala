package ED

/**
  * Created by aeron on 24/08/17.
  */
object TestList extends ArrayList with App{
  inserir(1)
  inserir(2)
  inserir(31)
  inserir(7)
  inserir(21)
  imprime()
  println("Tamanho = " + tamanho())
  println("--------------")
  excluir(2)
  imprime()
  println("Tamanho = " + tamanho())
  println("--------------")
  println("Posicao do valor 1 = " + pesquisar(1))
  println("Elemento da posicao 3 = " + elementoPosicao(3))

}
