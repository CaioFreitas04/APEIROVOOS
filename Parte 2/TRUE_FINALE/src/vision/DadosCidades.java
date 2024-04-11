package vision;

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


  private static ArrayList<Cidade> Cidades = new ArrayList<Cidade>();








  public static int add(Cidade X) {
    if (DadosCidades.search(X.getCid())!=null) return -1;
    Cidades.add(X);
    return 0;
  }

  public static int rem(Cidade X) {
	 if (DadosCidades.search(X.getCid())==null) return -1;
	 Cidades.remove(X);
     return 0;
  }

  public static Cidade search(String IN){

    for(int i = 0; i < Cidades.size(); i++){
      if(Cidades.get(i).getCid().compareToIgnoreCase(IN)==0) return Cidades.get(i);
    }
    return null;
  }








  
  public static Hotel buscarHotel(String IN, Data DataChegadaIN, Data DataPartidaIN){

    int i = 0;
    Hotel x = null;
    while (i < Cidades.size()) {
      x = Cidades.get(i).buscarHotel(IN);
      if(x == null) i++;
      else{
        DadosPesquisas.addPesquisas(x, DataChegadaIN, DataPartidaIN);
        return x;}
    }
    return null;
  }



  public static void commit() {
	  Persist.write(Cidades, "cidd.dat");
  }

  public static boolean pull() {
	  ArrayList<Cidade> temp = (ArrayList<Cidade>) Persist.read("cidd.dat");
	  if(temp == null) {
		  return false;
	  }
	  else {
		  Cidades = temp;
		  return true;
	  }
  }



}

