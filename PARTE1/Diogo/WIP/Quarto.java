import java.util.ArrayList;

public class Quarto {

  private float valorDiaria;
  private float valorDesconto;
  private float valorDiariacomDesconto;
  private int qtdPessoas;
  private static ArrayList diasCheckin = new ArrayList();
  private static ArrayList diasCheckout = new ArrayList();

  public Quarto(float valorDiariaIN, int qtdPessoasIN) {
    valorDiaria = valorDiariaIN;
    qtdPessoas = qtdPessoasIN;
    valorDesconto = 0;
    valorDesconto = valorDiaria;
  }
  public float getValorDiaria() {return valorDiaria;}
  public float getValorDesconto() {return valorDesconto;}
  public float getValorDiariacomDesconto() {return valorDiariacomDesconto;}
  public int getQtdPessoas() {return qtdPessoas;}


  

  public static boolean estaLivreEmTalDia(Data dia) {
    Data p = new Data(dia);

    if (diasCheckin.contains(p) || diasCheckout.contains(p))
      return false;

    int max = empresa.limite();
    for (int i = 0; i < max; i++) {

      if (diasCheckin.contains(p))
        return true;
      if (diasCheckout.contains(p))
        return false;

      p.incrData();

    }
    return true;
  }

  public int addReserva(reserva IN) {

    if (estaLivreEmTalDia(IN.getDiaCheckin()) && estaLivreEmTalDia(IN.getDiaCheckout())) {
      diasCheckin.add(IN.getDiaCheckin());
      diasCheckout.add(IN.getDiaCheckout());
      return 0;
    }
    return 1;
  }

  public void removeReserva(reserva IN) {

    diasCheckin.remove(IN.getDiaCheckin());
    diasCheckout.remove(IN.getDiaCheckout());
  }

  public void criar_Promocao(float valorDescontoIN) {
    valorDesconto = valorDescontoIN;
    valorDiariacomDesconto = valorDiaria * valorDescontoIN;
  }
}
