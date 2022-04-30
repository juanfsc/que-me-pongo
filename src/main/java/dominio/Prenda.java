package dominio;

import java.awt.Color;

public class Prenda {
  private TipoPrenda tipo;
  private MaterialPrenda material;
  private TramaPrenda trama;
  private Color colorPrimario;
  private Color colorSecundario;

  public Prenda(TipoPrenda tipo, MaterialPrenda material, TramaPrenda trama,
                Color colorPrimario, Color colorSecundario) {
    this.tipo = tipo;
    this.material = material;
    this.trama = trama;
    this.colorPrimario = colorPrimario;
    this.colorSecundario = colorSecundario;
  }

  public TipoPrenda getTipo() {
    return this.tipo;
  }
}
