public class Reserva {
  private Quarto quarto_escolhido;
  private Data diaCheckin;
  private Data diaCheckout;
  float preco;

  public Reserva(Quarto quarto_escolhidoIN, Data diaCheckinIN, Data diaCheckoutIN) {
    quarto_escolhido = quarto_escolhidoIN;
    diaCheckin = new Data(diaCheckinIN);
    diaCheckout = new Data(diaCheckoutIN);

    preco = quarto_escolhido.getValorDiaria() * Data.distDatas(diaCheckin, diaCheckout);
    ;
  }

  public Data getDiaCheckin() {
    return diaCheckin;
  }

  public Data getDiaCheckout() {
    return diaCheckout;
  }

  public Quarto getQuarto() {
    return quarto_escolhido;
  }

  public float getPreco() {
    return preco;
  }

}
