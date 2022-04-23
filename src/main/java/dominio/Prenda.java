package dominio;

import java.awt.Color;

public class Prenda {
  private TipoPrenda tipo;
  private MaterialPrenda material;
  private Color colorPrimario;
  private Color colorSecundario;

  public Prenda(TipoPrenda tipo, MaterialPrenda material, Color colorPrimario, Color colorSecundario){
    if(tipo==null) { throw new PrendaInvalidaException("No se puede crear prenda sin tipo");}
    this.tipo = tipo;
    if(material==null) { throw new PrendaInvalidaException("No se puede crear prenda sin material");}
    this.material = material;
    if(colorPrimario==null) { throw new PrendaInvalidaException("No se puede crear prenda sin colorPrimario");}
    this.colorPrimario = colorPrimario;
    this.colorSecundario = colorSecundario;
  }

}
