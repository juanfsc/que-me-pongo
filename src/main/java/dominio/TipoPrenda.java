package dominio;

public enum TipoPrenda {
  ZAPATO(CategoriaPrenda.CALZADO),
  CAMISA_MANGA_CORTA(CategoriaPrenda.PARTE_SUPERIOR),
  PANTALON(CategoriaPrenda.PARTE_INFERIOR),
  PULSERA(CategoriaPrenda.ACCESORIOS);

  private CategoriaPrenda categoria;

  TipoPrenda(CategoriaPrenda categoria) {
    this.categoria = categoria;
  }

  public CategoriaPrenda getCategoria() {
    return this.categoria;
  }
}
