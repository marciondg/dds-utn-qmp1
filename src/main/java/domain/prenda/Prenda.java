package domain.prenda;

import domain.prenda.excepciones.PrendaIncompletaException;

public class Prenda {
/*  private CategoriaPrenda categoria;*/
  private TipoPrenda tipo;
  private MaterialPrenda material;
  private Color colorPrincipal;
  private Color colorSecundario;

  public Prenda(TipoPrenda tipo, MaterialPrenda material, Color colorPrincipal) {
/*    this.categoria = tipo.getCategoria();*/
    this.tipo = tipo;
    this.material = material;
    this.colorPrincipal = colorPrincipal;
    validarPrenda();
  }

  public Prenda(TipoPrenda tipo, MaterialPrenda material, Color colorPrincipal, Color colorSecundario) {
/*    this.categoria = tipo.getCategoria();*/
    this.tipo = tipo;
    this.material = material;
    this.colorPrincipal = colorPrincipal;
    this.colorSecundario = colorSecundario;
    validarPrenda();
  }

  public CategoriaPrenda getCategoria() {
    return tipo.getCategoria();
  }

  public TipoPrenda getTipo() {
    return tipo;
  }

  public void setTipo(TipoPrenda tipo) {
    this.tipo = tipo;
  }

  public MaterialPrenda getMaterial() {
    return material;
  }

  public void setMaterial(MaterialPrenda material) {
    this.material = material;
  }

  public Color getColorPrincipal() {
    return colorPrincipal;
  }

  public void setColorPrincipal(Color colorPrincipal) {
    this.colorPrincipal = colorPrincipal;
  }

  public Color getColorSecundario() {
    return colorSecundario;
  }

  public void setColorSecundario(Color colorSecundario) {
    this.colorSecundario = colorSecundario;
  }

  void validarPrenda(){
    if(tipo==null || material==null || colorPrincipal==null)
      throw new PrendaIncompletaException();
  }
}



