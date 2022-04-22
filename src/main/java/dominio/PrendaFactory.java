package dominio;

import java.awt.Color;

public abstract class PrendaFactory {
  TipoPrenda tipo;


  public void setTipo(TipoPrenda tipo){
    this.tipo = tipo;
  }
  public Prenda crearPrenda(Color color, MaterialPrenda material){
    Prenda prenda = new Prenda(tipo, material);
    prenda.agregarColor(color);
    return prenda;
  }
}
