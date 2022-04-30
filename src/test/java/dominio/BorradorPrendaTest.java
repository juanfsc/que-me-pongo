package dominio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.awt.Color;

import static org.junit.jupiter.api.Assertions.*;

class BorradorPrendaTest {

  @Test
  void crearPrendaSinTipoPrendaThrowsException() {
    Assertions.assertThrows(PrendaInvalidaException.class,()->obtenerBorradorSinTipoPrenda().crearPrenda());
  }

  @Test
  void crearPrendaSinMaterialPrendaThrowsException() {
    Assertions.assertThrows(PrendaInvalidaException.class,()->obtenerBorradorSinMaterialPrenda().crearPrenda());
  }

  @Test
  void crearPrendaSinColorPrimarioThrowsException() {
    Assertions.assertThrows(PrendaInvalidaException.class,()->obtenerBorradorSinColorPrimario().crearPrenda());
  }
  @Test
  void crearPrendaCompletaDoesNotThrowException() {
    Assertions.assertDoesNotThrow(()->obtenerBorradorCompleto().crearPrenda());
  }

  private BorradorPrenda obtenerBorradorSinTipoPrenda() {
    BorradorPrenda borrador = new BorradorPrenda();
    borrador.setMaterialPrenda(MaterialPrenda.CUERO);
    borrador.setColorPrimario(new Color(0,0,0));
    return borrador;
  }

  private BorradorPrenda obtenerBorradorSinMaterialPrenda() {
    BorradorPrenda borrador = new BorradorPrenda();
    borrador.setTipoPrenda(TipoPrenda.CAMISA_MANGA_CORTA);
    borrador.setColorPrimario(new Color(0,0,0));
    return borrador;
  }

  private BorradorPrenda obtenerBorradorSinColorPrimario() {
    BorradorPrenda borrador = new BorradorPrenda();
    borrador.setTipoPrenda(TipoPrenda.CAMISA_MANGA_CORTA);
    borrador.setMaterialPrenda(MaterialPrenda.CUERO);
    return borrador;
  }

  private BorradorPrenda obtenerBorradorCompleto() {
    BorradorPrenda borrador = new BorradorPrenda();
    borrador.setTipoPrenda(TipoPrenda.CAMISA_MANGA_CORTA);
    borrador.setMaterialPrenda(MaterialPrenda.CUERO);
    borrador.setColorPrimario(new Color(0,0,0));
    borrador.setColorSecundario(new Color(255,255,255));
    borrador.setTramaPrenda(TramaPrenda.LISA);
    return borrador;
  }
  static BorradorPrenda obtenerBorradorPrendaSuperior() {
    BorradorPrenda borrador = new BorradorPrenda();
    borrador.setTipoPrenda(TipoPrenda.CAMISA_MANGA_CORTA);
    borrador.setMaterialPrenda(MaterialPrenda.JEAN);
    borrador.setColorPrimario(new Color(0,0,0));
    borrador.setColorSecundario(new Color(255,255,255));
    borrador.setTramaPrenda(TramaPrenda.LISA);
    return borrador;
  }
  static BorradorPrenda obtenerBorradorPrendaInferior() {
    BorradorPrenda borrador = new BorradorPrenda();
    borrador.setTipoPrenda(TipoPrenda.PANTALON);
    borrador.setMaterialPrenda(MaterialPrenda.JEAN);
    borrador.setColorPrimario(new Color(0,0,0));
    borrador.setColorSecundario(new Color(255,255,255));
    borrador.setTramaPrenda(TramaPrenda.LISA);
    return borrador;
  }
  static BorradorPrenda obtenerBorradorCalzado() {
    BorradorPrenda borrador = new BorradorPrenda();
    borrador.setTipoPrenda(TipoPrenda.ZAPATO);
    borrador.setMaterialPrenda(MaterialPrenda.CUERO);
    borrador.setColorPrimario(new Color(0,0,0));
    borrador.setColorSecundario(new Color(255,255,255));
    borrador.setTramaPrenda(TramaPrenda.LISA);
    return borrador;
  }
}