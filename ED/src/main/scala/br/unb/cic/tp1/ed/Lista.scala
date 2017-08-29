package br.unb.cic.tp1.ed

trait Lista[T] {
  def inserir(v : T) : Unit
  def excluir(idx : Int) : Unit
  def pesquisar(v : T) : Int
  def elementoPosicao(idx : Int) : T
  def tamanho : Int
}
