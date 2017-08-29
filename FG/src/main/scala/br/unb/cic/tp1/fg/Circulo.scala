package br.unb.cic.tp1.fg

class Circulo(private val raio : Double) extends FiguraGeometrica{

  val pi : Double = 3.14

  override def area() : Double = pi * raio * raio

  override def comprimento() : Double = 2 * pi * raio
}
