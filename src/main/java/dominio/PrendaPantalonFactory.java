package dominio;

import java.awt.*;

import static dominio.CategoriaPrenda.PARTE_INFERIOR;

public class PrendaPantalonFactory extends PrendaFactory{
  @Override
   public Prenda crearPrenda(Color color, MaterialPrenda material) {
    this.setTipo(new TipoPrenda(PARTE_INFERIOR));

    Prenda prenda = super.crearPrenda(color, material);
    return prenda;
  }
}
