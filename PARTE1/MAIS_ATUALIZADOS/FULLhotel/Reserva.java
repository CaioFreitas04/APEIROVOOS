public class Reserva {
  private Quarto quarto_escolhido;
  private Data diaCheckin;
  private Data diaCheckout;
  private double preco;
  private int NumeroQuarto;
  
  public Reserva(Data diaCheckinIN, Data diaCheckoutIN) {
    diaCheckin = new Data(diaCheckinIN);
    diaCheckout = new Data(diaCheckoutIN);

    preco = quarto_escolhido.getValorDiaria() * Data.distDatas(diaCheckin, diaCheckout);
  }
  public void setQuarto(Quarto quarto_escolhidoIN) {
    quarto_escolhido = quarto_escolhidoIN;
    NumeroQuarto = quarto_escolhido.getNumero();
  }
  public void setPreco(Quarto quarto_escolhidoIN) {
    preco = quarto_escolhido.getValorDiariacomDesconto() * Data.distDatas(diaCheckin, diaCheckout);
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

  public double getPreco() {
    return preco;
  }

  public int getNumeroQuarto() {
    return NumeroQuarto;
  }

}