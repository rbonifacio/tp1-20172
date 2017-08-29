package br.unb.cic.tp1.fg

import org.scalatest.FunSuite

class FGTeste extends FunSuite {

  test("testar a area de um Circulo") {
    val fg1 : FiguraGeometrica = new Circulo(3)

    val area1 = fg1.area()
    val eps = 0.00001

    assert(area1 < 28.26 + eps && area1 > 28.26 - eps)
  }

  test("testar a area de um Retangulo") {
    val fg1 : FiguraGeometrica = new Retangulo(3, 5)
    val area1 = fg1.area()
    assert(area1 === 15)
  }

}
