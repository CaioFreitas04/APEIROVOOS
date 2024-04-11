package vision;
 import java.util.ArrayList;
 import java.io.*;

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
	    	if(test.getCPF().compareToIgnoreCase(CPF_IN)==0) {
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
	  Persist.write(Clientes, "clnt.dat");
	  BancoCliente.connectToBank();
	  if(BancoCliente.clearDB()) {
	  	  for(int i = 0; i < Clientes.size(); i++) {
			  BancoCliente.writeCliente(Clientes.get(i));
		  }
	  }
  }

  public static boolean pull() {
	  ArrayList<Cliente> temp = (ArrayList<Cliente>) Persist.read("clnt.dat");
	  if(temp == null) {
		  return false;
	  }
	  else {
		  Clientes = temp;
		  return true;
	  }
  }
  
  public static void generateDBReport() {
	  //pegando clientes do banco de dados;
	  ArrayList<Cliente> temp = BancoCliente.fetchClientes();
	  //preparando para escrita;
	  BufferedWriter fp = null;
	  try {
		  fp = new BufferedWriter(new FileWriter(new File("relatorio.txt")));
		  for(int i = 0; i < temp.size(); i++) {
			  String tnome = temp.get(i).getNome();
			  String tcpf  = temp.get(i).getCPF();
			  String taddr = temp.get(i).getAddr();
			  boolean tvip = temp.get(i).isVIP();
			  int tcompras = temp.get(i).getCompras();
			  String tmail = temp.get(i).getEmail();
			  
			  fp.write(tnome + "\t-\t" + tcpf + "\tEMAIL: " + tmail + "\tEND:" + taddr + "\tVIP?: " + tvip + "\tCOMPRAS: " + tcompras);
			  fp.newLine();
		  }
		  fp.flush();
		  fp.close();
	  }
	  catch(IOException e) {
		  BancoCliente.logError(e.getMessage());
	  }
  }

}