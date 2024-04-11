package vision;
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


  private static ArrayList<Pesquisa> Pesquisas = new ArrayList<Pesquisa>();


  public static void addPesquisas(Cidade Destino, Data DataChegadaBuscadaIN, Data DataPartidaBuscadaIN){
    Pesquisa X = new Pesquisa(Destino, DataChegadaBuscadaIN, DataPartidaBuscadaIN);
    Pesquisas.add(X);
  }
  public static void addPesquisas(Hotel Destino, Data DataChegadaBuscadaIN, Data DataPartidaBuscadaIN){
    Pesquisa X = new Pesquisa(Destino, DataChegadaBuscadaIN, DataPartidaBuscadaIN);
    Pesquisas.remove(X);
  }


  public static int getQtdPesquisasTotais(){return Pesquisas.size();}

  
  

  public static ArrayList<Pesquisa> searchPesquisas_Hotel(Hotel IN){
    String teste = IN.getCNPJ();
    ArrayList<Pesquisa> ret = new ArrayList<Pesquisa>();
    
    for(int i = 0; i < Pesquisas.size(); i++){
      if(Pesquisas.get(i).getHotelBuscado().getCNPJ().compareToIgnoreCase(teste)==0){
    	  ret.add(Pesquisas.get(i));
        }
    }
    return ret;
  }

  public static ArrayList<Pesquisa> searchPesquisas_Cidade(Cidade IN){
    String teste = IN.getCid();
    ArrayList<Pesquisa> ret = new ArrayList<Pesquisa>();
    
    for(int i = 0; i < Pesquisas.size(); i++){
      if(Pesquisas.get(i).getCidadeBuscada().getCid().compareToIgnoreCase(teste)==0){
    	  ret.add(Pesquisas.get(i));
        }
    }
    return ret;
  }

  public static ArrayList<Pesquisa> searchPesquisas_DataCheg(Data IN){
	  
    ArrayList<Pesquisa> ret = new ArrayList<Pesquisa>();
    Data t;
    
    for(int i = 0; i < Pesquisas.size(); i++){
    	
      t = Pesquisas.get(i).getDataChegadaBuscada();
      if(t.getData('d') == IN.getData('d') && t.getData('m') == IN.getData('m') && t.getData('a') == IN.getData('a')){
    	  ret.add(Pesquisas.get(i));
        }
    }
    return ret;
  }
  public static ArrayList<Pesquisa> searchPesquisas_DataPart(Data IN){
	  
	    ArrayList<Pesquisa> ret = new ArrayList<Pesquisa>();
	    Data t;
	    
	    for(int i = 0; i < Pesquisas.size(); i++){
	    	
	      t = Pesquisas.get(i).getDataPartidaBuscada();
	      if(t.getData('d') == IN.getData('d') && t.getData('m') == IN.getData('m') && t.getData('a') == IN.getData('a')){
	    	  ret.add(Pesquisas.get(i));
	        }
	    }
	    return ret;
	  }


  public static void commit() {
    Persist.write(Pesquisas, "pesq.dat");
  }

  public static boolean pull() {
    ArrayList<Pesquisa> temp = (ArrayList<Pesquisa>) Persist.read("pesq.dat");
    if(temp == null) {
    	return false;
    }
    else {
    	Pesquisas = temp;
    	return true;
    }
  } 


}