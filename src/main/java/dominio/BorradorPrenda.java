package dominio;

import java.awt.Color;

public class BorradorPrenda {
  TipoPrenda tipoPrenda ;
  MaterialPrenda materialPrenda;
  TramaPrenda tramaPrenda = TramaPrenda.LISA;
  Color colorPrimario;
  Color colorSecundario;

  public void setTipoPrenda(TipoPrenda tipoPrenda) {
    this.tipoPrenda = tipoPrenda;
  }

  public void setMaterialPrenda(MaterialPrenda materialPrenda) {
    this.materialPrenda = materialPrenda;
  }

  public void setTramaPrenda(TramaPrenda tramaPrenda) {
    if(tramaPrenda==null){
      return;
    }
    this.tramaPrenda = tramaPrenda;
  }

  public void setColorPrimario(Color colorPrimario) {
    this.colorPrimario = colorPrimario;
  }

  public void setColorSecundario(Color colorSecundario) {
    this.colorSecundario = colorSecundario;
  }

  public Prenda crearPrenda(){
    if(this.tipoPrenda==null) { throw new PrendaInvalidaException("No se puede crear prenda sin tipo");}
    if(this.materialPrenda==null) { throw new PrendaInvalidaException("No se puede crear prenda sin material");}
    if(this.colorPrimario==null) { throw new PrendaInvalidaException("No se puede crear prenda sin colorPrimario");}
    return new Prenda(this.tipoPrenda, this.materialPrenda, this.tramaPrenda, this.colorPrimario, this.colorSecundario);
  }
}
