package br.unb.cic.tp1.ed

class ListaInt(tamanho : Int = 10)
  extends ListaComoArray[Int](tamanho) with Totaliza with Combinar {
  override def totaliza: Int = {
    var total = 0
    for(e <- elementos) {
      total += e
    }
    return total
  }


}
