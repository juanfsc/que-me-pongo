package dominio;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class Prenda {
  private TipoPrenda tipo;
  private MaterialPrenda material;
  private List<Color> colores = new ArrayList<>();
  private Integer cantidadColores = 2;

  public Prenda(TipoPrenda tipo, MaterialPrenda material){
    this.tipo = tipo;
    this.material = material;
  }
  public boolean agregarColor(Color color){
    boolean agregar = this.colores.size()<cantidadColores;
    if(agregar){
      this.colores.add(color);
    }
    return agregar;
  }

}
