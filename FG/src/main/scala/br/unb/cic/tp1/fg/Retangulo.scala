package br.unb.cic.tp1.fg

class Retangulo(private val base: Double, private val altura : Double) extends FiguraGeometrica {

  override def area = base * altura
  override def comprimento = 2 * base + 2 * altura

}
