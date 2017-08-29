package br.unb.cic.tp1.fg

class Circulo(private val raio : Double) extends FiguraGeometrica {
  override def area(): Double = 3.14 * raio * raio
}
