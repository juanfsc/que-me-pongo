package dominio;

public class UniformeInvalidoException extends RuntimeException {
  public UniformeInvalidoException(String descripcion) {
    super(descripcion);
  }
}
