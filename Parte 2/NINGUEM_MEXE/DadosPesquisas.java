package test;
 import java.util.ArrayList;

/*

Salvar-se a no arquivo:

  Cidades    -inclui todos os Hoteis e todos os Aeroportos-
  Hoteis
  Aeroportos [com trechos [que incluem seus voos]]

  Companias Aereas [com voos]
  Funcionarios [incluindo Especiais]

  Clientes [com compras]

*/


public class DadosPesquisas{


  private static Pesquisa Pesquisas[] = new Pesquisa[0];
  private static int qtd = 0;


  public static void addPesquisas(Cidade Destino, Data DataChegadaBuscadaIN, Data DataPartidaBuscadaIN){
    Pesquisa X = new Pesquisa(Destino, DataChegadaBuscadaIN, DataPartidaBuscadaIN);
    Pesquisas = VETOR.add(Pesquisas, X, qtd);
  }
  public static void addPesquisas(Hotel Destino, Data DataChegadaBuscadaIN, Data DataPartidaBuscadaIN){
    Pesquisa X = new Pesquisa(Destino, DataChegadaBuscadaIN, DataPartidaBuscadaIN);
    Pesquisas = VETOR.add(Pesquisas, X, qtd);
  }


  public static int getQtdPesquisasTotais(){return qtd;}
  public static void addQtdPesquisas(int IN){qtd += IN;}

  public static Pesquisa[] searchPesquisas_Hotel(Hotel IN){
    String teste = IN.getCNPJ();
    Pesquisa ret[] = new Pesquisa[0];
    int tamanhoRet = 0;
    for(int i = 0; i < qtd; i++){
      if(Pesquisas[i].getHotelBuscado().getCNPJ() == teste){
          ret = VETOR.add(ret, Pesquisas[i], tamanhoRet);
          tamanhoRet++;
        }
    }
    return null;
  }
  public static Pesquisa[] searchPesquisas_Cidade(String teste){
    Pesquisa ret[] = new Pesquisa[0];
    int tamanhoRet = 0;
    for(int i = 0; i < qtd; i++){
      if(Pesquisas[i].getCidadeBuscada().getCid() == teste){
        ret = VETOR.add(ret, Pesquisas[i], tamanhoRet);
        tamanhoRet++;
      }
    }
    return null;
  }
  public static Pesquisa[] searchPesquisas_DataChegada(Data IN){
    Data teste;
    Pesquisa ret[] = new Pesquisa[0];
    int tamanhoRet = 0;
    for(int i = 0; i < qtd; i++){
      teste = Pesquisas[i].getDataChegadaBuscada();
      if (teste == null) return null;
      if(teste.getData('d') == IN.getData('d') && teste.getData('m') == IN.getData('m') && teste.getData('a') == IN.getData('a')){
          ret = VETOR.add(ret, Pesquisas[i], tamanhoRet);
          tamanhoRet++;
        }
    }
    return ret;
  }
  public static Pesquisa[] searchPesquisas_DataPartida(Data IN){
    Data teste;
    Pesquisa ret[] = new Pesquisa[0];
    int tamanhoRet = 0;
    for(int i = 0; i < qtd; i++){
      teste = Pesquisas[i].getDataPartidaBuscada();
      if (teste == null) return null;
      if(teste.getData('d') == IN.getData('d') && teste.getData('m') == IN.getData('m') && teste.getData('a') == IN.getData('a')){
        ret = VETOR.add(ret, Pesquisas[i], tamanhoRet);
        tamanhoRet++;
      }
    }
    return ret;
  }


  public static void commit() {
    return;
  } //TODO: função que coloca dados no banco;

  public static boolean pull() {
    return false;
  } //TODO: função que puxa dados no banco;


}