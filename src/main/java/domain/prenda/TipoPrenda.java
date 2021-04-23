package domain.prenda;

public enum TipoPrenda {

  ZAPATOS(CategoriaPrenda.CALZADO),
  CAMISA_MANGA_CORTA(CategoriaPrenda.PARTE_SUPERIOR),
  PANTALON(CategoriaPrenda.PARTE_INFERIOR),
  ANTEOJOS_SOL(CategoriaPrenda.ACCESORIOS),
  REMERA_MANGA_CORTA(CategoriaPrenda.PARTE_SUPERIOR),
  ZAPATILLAS(CategoriaPrenda.CALZADO),
  PANUELO(CategoriaPrenda.ACCESORIOS),
  REMERA_MANGA_LARGA(CategoriaPrenda.PARTE_SUPERIOR),
  BOTAS(CategoriaPrenda.CALZADO),
  MUSCULOSA(CategoriaPrenda.PARTE_SUPERIOR),
  POLLERA(CategoriaPrenda.PARTE_INFERIOR),
  CROCS(CategoriaPrenda.CALZADO);

  private CategoriaPrenda categoria;

  TipoPrenda(CategoriaPrenda categoria) {
    this.categoria = categoria;
  }

  public CategoriaPrenda getCategoria() {
    return categoria;
  }
}
