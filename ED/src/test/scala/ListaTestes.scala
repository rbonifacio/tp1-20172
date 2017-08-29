import java.util.concurrent.RecursiveTask

import br.unb.cic.tp1.ed.{ListaComoArray, ListaInt}
import br.unb.cic.tp1.fg.{Circulo, FiguraGeometrica, Retangulo}

object ListaTestes extends App {
  val figuras = new ListaComoArray[FiguraGeometrica]
  val circulos = new ListaComoArray[Circulo]

  figuras.inserir(new Circulo(3))
  figuras.inserir(new Retangulo(3, 4))

  circulos.inserir(new Circulo(5))

  figuras.combinar(circulos)

}
