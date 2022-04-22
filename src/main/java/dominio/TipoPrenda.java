package dominio;

public class TipoPrenda {
  CategoriaPrenda categoria;
  public TipoPrenda(CategoriaPrenda categoria){
    this.categoria = categoria;
  }
  public CategoriaPrenda getCategoria() {
    return categoria;
  }
}
