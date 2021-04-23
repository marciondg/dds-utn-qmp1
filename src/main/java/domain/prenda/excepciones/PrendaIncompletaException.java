package domain.prenda.excepciones;

public class PrendaIncompletaException extends RuntimeException{
  public PrendaIncompletaException() {
    super("La prenda debe tener un tipo, tela, categoria y color primario!");
  }
}
