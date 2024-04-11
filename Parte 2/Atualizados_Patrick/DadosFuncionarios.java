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


  private static Funcionario Funcionarios[] = new Funcionario[0];
  private static int qtd = 0;








  public int add(Funcionario X) {
    if (VETOR.contem(Funcionarios, X, qtd))
      return -1;
      Funcionarios = VETOR.add(Funcionarios, X, qtd);
    qtd++;
    return 0;
  }

  public int rem(Funcionario X) {
    if(VETOR.contem(Funcionarios, X, qtd)){
      Funcionarios = VETOR.remove(Funcionarios, X, qtd);
      qtd--;
      return 0;
    }
    else return -1;
  }

  public Funcionario search(String CPF_IN){

    for(int i = 0; i < qtd; i++){
      if(Funcionarios[i].getCPF() == CPF_IN) return Funcionarios[i];
    }
    return null;
  }

  public Funcionario[] getArray(){return Funcionarios;}







  public static void commit() {
    return;
  } //TODO: função que coloca dados no banco;

  public static boolean pull() {
    return false;
  } //TODO: função que puxa dados no banco;


}