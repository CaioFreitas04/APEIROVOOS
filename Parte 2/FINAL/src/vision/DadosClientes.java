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


public class DadosClientes{


  private static ArrayList<Cliente> Clientes = new ArrayList<Cliente>();




  public static int add(Cliente X) {
	Clientes.add(X);
	return 0;
  }
  
  public int rem(String CPF_IN) {
		Cliente test;
		int max = Clientes.size();
	    for(int i = 0; i < max; i++){
	    	test = Clientes.get(i);
	    	if(test.getCPF() == CPF_IN) {
	    		Clientes.remove(i);
	    		return 0;
	    	}
	    }
	    return 1;
	  }

  public static Cliente search(String CPF_IN){
    
	Cliente test;
	String CPFcomp;
	int max = Clientes.size();
    for(int i = 0; i < max; i++){
    	test = Clientes.get(i);
    	CPFcomp = test.getCPF();
    	if(CPFcomp.compareToIgnoreCase(CPF_IN) == 0) return test;
    }
    return null;
  }
  
  public ArrayList<Cliente> getArray(){return Clientes;}
  

  



  
  public static void commit() {
    return;
  } //TODO: função que coloca dados no banco;

  public static boolean pull() {
    return false;
  } //TODO: função que puxa dados no banco;


}