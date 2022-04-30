package dominio;

public class PrendaInvalidaException extends RuntimeException {
  public PrendaInvalidaException(String descripcion) {
    super(descripcion);
  }
}
