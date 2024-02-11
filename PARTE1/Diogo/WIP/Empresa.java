public class Empresa {

  private static Data today;

  public Empresa(int dia, int mes, int ano) {
    today = new Data(dia, mes, ano);
  }

  public static Data getToday() {
    return today;
  }

  public static int limite() {
    return ((3 * 365) + 366) * 100; // 400 anos de limite
  }

}
