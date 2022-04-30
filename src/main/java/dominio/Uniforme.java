package dominio;

import java.util.ArrayList;
import java.util.List;

public class Uniforme {
  Prenda prendaSuperior;
  Prenda prendaInferior;
  Prenda calzado;
  List<Sugerencia> sugerencias = new ArrayList<>();

  public Uniforme(Prenda prendaSuperior, Prenda prendaInferior, Prenda calzado) {
    if (prendaSuperior == null || prendaInferior == null || calzado == null) {
      throw new UniformeInvalidoException(
          "No se puede crear un Uniforme sin prenda superior, prenda inferiror o calzado");
    }

    //idem para los demas tipos de prenda. ¿Programacion defensiva?
    if (prendaSuperior.getTipo().getCategoria() != CategoriaPrenda.PARTE_SUPERIOR) {
      throw new UniformeInvalidoException(
          "Se Debe ingresar una prenda Superior");
    }

    this.prendaSuperior = prendaSuperior;
    this.prendaInferior = prendaInferior;
    this.calzado = calzado;
  }

  public void recibirSugerencia(Sugerencia sugerencia) {
    this.sugerencias.add(sugerencia);
  }

  public Integer obtenerCantidadSugerencia() {
    return Math.toIntExact(this.sugerencias.stream().count());
  }
}
