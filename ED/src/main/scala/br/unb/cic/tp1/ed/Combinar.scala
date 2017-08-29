package br.unb.cic.tp1.ed

trait Combinar[T] {
  def combinar[U <: T](lista: Lista[U]) : Lista[T]
}
