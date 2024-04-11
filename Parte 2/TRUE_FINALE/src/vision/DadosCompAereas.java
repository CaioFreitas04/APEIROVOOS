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


public class DadosCompAereas{


  private static ArrayList<CompAerea> CompAereas = new ArrayList<CompAerea>();








  public static int add(CompAerea X) {
    if (DadosCompAereas.search(X.getCNPJ())!=null) return -1;
    CompAereas.add(X);
    return 0;
  }

  public static int rem(CompAerea X) {
	 if (DadosCompAereas.search(X.getCNPJ())==null)return -1;
	 CompAereas.remove(X);
     return 0;
  }

  public static CompAerea search(String CNPJ_IN){

    for(int i = 0; i < CompAereas.size(); i++){
      if(CompAereas.get(i).getCNPJ().compareToIgnoreCase(CNPJ_IN)==0) return CompAereas.get(i);
    }
    return null;
  }

  private static ArrayList<CompAerea> getArray(){return CompAereas;}







  public static void commit() {
	  Persist.write(CompAereas, "coar.dat");
  }

  public static boolean pull() {
	  ArrayList<CompAerea> temp = (ArrayList<CompAerea>) Persist.read("coar.dat");
	  if(temp == null) {
		  return false;
	  }
	  else {
		  CompAereas = temp;
		  return true;
	  }
  }


}