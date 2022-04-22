package dominio;

import java.util.ArrayList;
import java.util.List;

public class Atuendo {
  List<Prenda> prendas = new ArrayList<>();

  public void cargarPrenda(Prenda prenda){
    prendas.add(prenda);
  }
}