import java.util.ArrayList;

public class Empresa {

  private static Data today;
  private static float comissao_por_passagem_global;
  private static float comissao_por_reserva_global;
  private static Cidade cidades[];
  private static Pesquisa pesquisas[];
  private static int qtdCidades;

  public Empresa(int dia, int mes, int ano) {
    today = new Data(dia, mes, ano);

    qtdCidades = 0;
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

  
  public int addCidade(Cidade X) {
    if (VETOR.contem(cidades, X, qtdCidades))
      return -1;
      cidades = VETOR.add(cidades, X, qtdCidades);
    qtdCidades++;
    return 0;
  }
  public void removeCidade(Cidade X) {
      cidades = VETOR.remove(cidades, X, qtdCidades);
  }
  public ArrayList<Cidade> geCidades(){
    ArrayList<Cidade> ret = new ArrayList();
    for(int i=0; i<qtdCidades; i++) {ret.add(cidades[i]);}
    return ret;
  }


  public static Cidade buscarCidade(String IN, Data DataChegadaIN, Data DataPartidaIN){

    int i = 0;
    while (i < qtdCidades) {
      if (cidades[i].getCid() == IN){
        Empresa.addPesquisas(cidades[i], DataChegadaIN, DataPartidaIN);
        return cidades[i];
      }
      else
        i++;
    }
    return null;
  }
  
  public static Hotel buscarHotel(String IN, Data DataChegadaIN, Data DataPartidaIN){

    int i = 0;
    Hotel x = null;
    while (i < qtdCidades) {
      x = cidades[i].buscarHotel(IN);
      if(x == null) i++;
      else{
        Empresa.addPesquisas(x, DataChegadaIN, DataPartidaIN);
        return x;}
    }
    return null;
  }

  public static void addPesquisas(Cidade Destino, Data DataChegadaBuscadaIN, Data DataPartidaBuscadaIN){
    pesquisas = VETOR.add(pesquisas, new Pesquisa(Destino, DataChegadaBuscadaIN, DataPartidaBuscadaIN), Pesquisa.getQtdPesquisas());
  }
  public static void addPesquisas(Hotel Destino, Data DataChegadaBuscadaIN, Data DataPartidaBuscadaIN){
    pesquisas = VETOR.add(pesquisas, new Pesquisa(Destino, DataChegadaBuscadaIN, DataPartidaBuscadaIN), Pesquisa.getQtdPesquisas());
  }
}