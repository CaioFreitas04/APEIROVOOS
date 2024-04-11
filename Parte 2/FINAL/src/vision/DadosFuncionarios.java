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


public class DadosFuncionarios{


  private static ArrayList<Funcionario> Funcionarios = new ArrayList<Funcionario>();








  public static int add(Funcionario X) {
    if (DadosFuncionarios.search(X.getCPF())!=null) return -1;
    Funcionarios.add(X);
    return 0;
  }

  public static int rem(Funcionario X) {
	 if (DadosFuncionarios.search(X.getCPF())==null)return -1;
	 Funcionarios.remove(X);
     return 0;
  }

  public static Funcionario search(String CNPJ_IN){

    for(int i = 0; i < Funcionarios.size(); i++){
      if(Funcionarios.get(i).getCPF().compareToIgnoreCase(CNPJ_IN)==0) return Funcionarios.get(i);
    }
    return null;
  }

  private static ArrayList<Funcionario> getArray(){return Funcionarios;}







  public static void commit() {
	  Persist.write(Funcionarios, "func.dat");
  }

  public static boolean pull() {
	  ArrayList<Funcionario> temp = (ArrayList<Funcionario>) Persist.read("func.dat");
	  if(temp == null) {
		  return false;
	  }
	  else {
		  Funcionarios = temp;
		  return true;
	  }
  } 
}