package br.unb.cic.tp1.fg

class Retangulo(val base : Double, altura : Double) extends FiguraGeometrica{
  override def area(): Double = base * altura
}
