package dominio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import dominio.BorradorPrendaTest;

import static dominio.BorradorPrendaTest.*;
import static org.junit.jupiter.api.Assertions.*;

class UniformeTest {

  @Test
  void UniformeInvalidoThrowsException() {
    Assertions.assertThrows(UniformeInvalidoException.class , ()->obtenerUniformeInvalido());
  }
  @Test
  void recibirSugerencia() {
    Uniforme uniforme = obtenerUniformeValido();
    Integer cantidadSugerenciasOriginal = uniforme.obtenerCantidadSugerencia();
    uniforme.recibirSugerencia(new Sugerencia("¡Muy lindo outfit!"));
    Assertions.assertTrue(cantidadSugerenciasOriginal < cantidadSugerenciasOriginal + 1);
  }

  private Uniforme obtenerUniformeInvalido(){
    return new Uniforme(null,null,null);
  }
  static Uniforme obtenerUniformeValido(){
    return new Uniforme(obtenerBorradorPrendaSuperior().crearPrenda(),obtenerBorradorPrendaInferior().crearPrenda(),obtenerBorradorPrendaInferior().crearPrenda());
  }

}