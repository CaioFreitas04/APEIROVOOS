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


  private static Cliente Clientes[] = new Cliente[0];
  private static int qtd = 0;








  public int add(Cliente X) {
    if (VETOR.contem(Clientes, X, qtd))
      return -1;
      Clientes = VETOR.add(Clientes, X, qtd);
    qtd++;
    return 0;
  }
  
  public int rem(Cliente X) {
    if(VETOR.contem(Clientes, X, qtd)){
      Clientes = VETOR.remove(Clientes, X, qtd);
      qtd--;
      return 0;
    }
    else return -1;
  }

  public Cliente search(String CPF_IN){
    
    for(int i = 0; i < qtd; i++){
      if(Clientes[i].getCPF() == CPF_IN) return Clientes[i];
    }
    return null;
  }
  
  public Cliente[] getArray(){return Clientes;}
  

  



  
  public static void commit() {
    return;
  } //TODO: função que coloca dados no banco;

  public static boolean pull() {
    return false;
  } //TODO: função que puxa dados no banco;


}