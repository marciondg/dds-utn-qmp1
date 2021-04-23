package domain;

import domain.prenda.Color;
import domain.prenda.MaterialPrenda;
import domain.prenda.Prenda;
import domain.prenda.TipoPrenda;

import java.util.List;

public class Atuendo {
  private List<Prenda> prendas;

  public Atuendo(List<Prenda> prendas) {
    this.prendas = prendas;
  }
}

