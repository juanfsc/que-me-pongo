package dominio;

import java.util.List;

public class Uniforme {
  Prenda prendaSuperior;
  Prenda prendaInferior;
  Prenda calzado;
  List<Sugerencia> sugerencias;

  public Uniforme(Prenda prendaSuperior, Prenda prendaInferior, Prenda calzado){
    this.prendaSuperior = prendaSuperior;
    this.prendaInferior = prendaInferior;
    this.calzado=calzado;
  }

  public void recibirSugerencia(Sugerencia sugerencia){
    this.sugerencias.add(sugerencia);
  }
}
