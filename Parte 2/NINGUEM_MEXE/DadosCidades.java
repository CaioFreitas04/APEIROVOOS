package test;

 import java.util.ArrayList;

/*

Salvar-se a no arquivo:

  Cidades    -inclui todos os Hoteis e todos os Aeroportos-
  Hoteis
  Aeroportos [com trechos [que incluem seus voos]]

  Companias Aereas [com voos]
  Funcionarios [incluindo Especiais]

  Cliente [com compras]

*/


public class DadosCidades{


  private static Cidade Cidades[] = new Cidade[0];
  private static int qtd = 0;









  public int add(Cidade X) {
    if (VETOR.contem(Cidades, X, qtd)) return -1;
    Cidades = VETOR.add(Cidades, X, qtd);
    qtd++;
    return 0;
  }
  
  public int rem(Cidade X) {
    if (VETOR.contem(Cidades, X, qtd)){
      Cidades = VETOR.remove(Cidades, X, qtd);
      qtd--;
      return 0;
    }
    else return -1;
  }

  public Cidade search(String Cid_IN){

    for(int i = 0; i < qtd; i++){
      if(Cidades[i].getCid() == Cid_IN) return Cidades[i];
    }
    return null;
  }
  
  public Cidade[] getArray(){return Cidades;}






  
  //OPERAÇÕES COMPLEMENTARES COM CidadeS:
  public static Cidade buscarCidade(String IN, Data DataChegadaIN, Data DataPartidaIN){

    int i = 0;
    while (i < qtd) {
      if (Cidades[i].getCid() == IN){
        DadosPesquisas.addPesquisas(Cidades[i], DataChegadaIN, DataPartidaIN);
        return Cidades[i];
      }
      else
        i++;
    }
    return null;
  }
  public static Hotel buscarHotel(String IN, Data DataChegadaIN, Data DataPartidaIN){

    int i = 0;
    Hotel x = null;
    while (i < qtd) {
      x = Cidades[i].buscarHotel(IN);
      if(x == null) i++;
      else{
        DadosPesquisas.addPesquisas(x, DataChegadaIN, DataPartidaIN);
        return x;}
    }
    return null;
  }



  public static void commit() {
    return;
  } //TODO: função que coloca dados no banco;

  public static boolean pull() {
    return false;
  } //TODO: função que puxa dados no banco;



}

