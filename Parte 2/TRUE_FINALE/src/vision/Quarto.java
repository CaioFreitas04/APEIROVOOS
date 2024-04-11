package vision;
import java.util.ArrayList;

public class Quarto {

  private double valorDiaria;
  private double valorDesconto;
  private double valorDiariacomDesconto;
  private int qtdPessoas;
  private Data diasCheckin[];
  private Data diasCheckout[];
  private int numero;
  private Hotel HotelZ;

  public Quarto(double valorDiariaIN, int qtdPessoasIN, Hotel meuHotel) {
    valorDiaria = valorDiariaIN;
    qtdPessoas = qtdPessoasIN;
    valorDesconto = 1;
    valorDiariacomDesconto = valorDiaria;
    HotelZ = meuHotel;

  diasCheckin = new Data[0];
  diasCheckout = new Data[0];
}

  public int getNumero() {
    return numero;
  }

  public double getValorDiaria() {
    return valorDiaria;
  }

  public double getValorDesconto() {
    return valorDesconto;
  }

  public double getValorDiariacomDesconto() {
    return valorDiariacomDesconto;
  }

  public int getQtdPessoas() {
    return qtdPessoas;
  }
  public Data[] getDiasCheckin() {return diasCheckin;}
  public Data[] getDiasCheckout() {return diasCheckout;}

  public void setValorDiaria(double valorDiariaIN) {
    valorDiaria = valorDiariaIN;
  }
  public void setNumero(int numeroIN) {
    numero = numeroIN;
  }

  public boolean ehPossivelReservar(Reserva IN) {

    Data p = new Data(IN.getDiaCheckin());

    int cont = Data.distDatas(p, IN.getDiaCheckout());
    int max = Empresa.limite();

    for (int i = 0; i < cont; i++) {

      if (VETOR.contem(diasCheckin, p))
        return false;
      if (VETOR.contem(diasCheckout, p))
        return false;

      p.incrData();

    }

    p.setData(IN.getDiaCheckout());
    for (int i = 0; i < 100; i++) {

      if (VETOR.contem(diasCheckin, p))
        return true;
      if (VETOR.contem(diasCheckout, p))
        return false;

      p.incrData();

    }
    return true;
  }

  public int addReserva(Reserva IN) {

    if (ehPossivelReservar(IN)) {
      diasCheckin = VETOR.add(diasCheckin, IN.getDiaCheckin());
      diasCheckout = VETOR.add(diasCheckout, IN.getDiaCheckout());
      return 0;
    } else
      return 1;
  }

  public void removeReserva(Reserva IN) {

    diasCheckin = VETOR.remove(diasCheckin, IN.getDiaCheckin());
    diasCheckout = VETOR.remove(diasCheckout, IN.getDiaCheckout());
  }

  public void criarPromocao(double valorDescontoIN) {
    valorDesconto = valorDescontoIN;
    valorDiariacomDesconto = valorDiaria * valorDescontoIN;
  }
  public Hotel getHotel() {
	  return HotelZ;
  }
}
