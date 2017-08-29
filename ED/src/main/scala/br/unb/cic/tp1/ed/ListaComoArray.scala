package br.unb.cic.tp1.ed

class ListaComoArray[T: Manifest](val max : Int = 10) extends Lista[T] with Combinar[T]  {

  val elementos = new Array[T](max)
  var idx = 0

  //o mesmo que override def tamanho { return idx }
  override def tamanho = idx

  override def inserir(v: T): Unit = {
    elementos(idx) = v
    idx += 1
  }

  override def excluir(idx: Int): Unit = {
    throw new Exception("ainda nao implementado")
  }

  override def pesquisar(v: T): Int = {
    for(e <- 0 until idx) {
      if(elementos(e) == v) {
        return e
      }
    }
    return -1
  }

  override def elementoPosicao(idx: Int): T = elementos(idx)

  override def combinar[U <: T](lista: Lista[U]): Lista[T] = {
    val tamanhoFinal = this.tamanho + lista.tamanho
    val res = new ListaComoArray[T](tamanhoFinal)

    for(idx <- 0 until this.tamanho) {
      res.inserir(elementoPosicao(idx))
    }

    for(idx <- 0 until lista.tamanho) {
      res.inserir(lista.elementoPosicao(idx))
    }

    return res
  }
}
