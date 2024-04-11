package vision;
import java.util.ArrayList;

public class Empresa {

  private static Data today;
  private static float comissao_por_passagem_global;
  private static float comissao_por_reserva_global;

  public Empresa(int dia, int mes, int ano) {
    today = new Data(dia, mes, ano);

  }

  public void setComissaoPorPassagem(float comissaoIN) {comissao_por_passagem_global = comissaoIN;}
  public void setComissaoPorReserva(float comissaoIN) {comissao_por_reserva_global = comissaoIN;}

  public float getComissaoPorPassagem() {return comissao_por_passagem_global;}
  public float getComissaoPorReserva() {return comissao_por_reserva_global;}

  public static Data getToday() {
    return today;
  }

  public static int limite() {
    return ((3 * 365) + 366) * 100; // 400 anos de limite
  }






}