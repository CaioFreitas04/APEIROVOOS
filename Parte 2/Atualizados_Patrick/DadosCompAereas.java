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


  private static CompAerea CompAereas[] = new CompAerea[0];
  private static int qtd = 0;








  public static int add(CompAerea X) {
    if (VETOR.contem(CompAereas, X, qtd))
      return -1;
      CompAereas = VETOR.add(CompAereas, X, qtd);
    qtd++;
    return 0;
  }

  public int rem(CompAerea X) {
    if(VETOR.contem(CompAereas, X, qtd)){
      CompAereas = VETOR.remove(CompAereas, X, qtd);
      qtd--;
      return 0;
    }
    else return -1;
  }

  public CompAerea search(String CNPJ_IN){

    for(int i = 0; i < qtd; i++){
      if(CompAereas[i].getCNPJ() == CNPJ_IN) return CompAereas[i];
    }
    return null;
  }

  public CompAerea[] getArray(){return CompAereas;}







  public static void commit() {
    return;
  } //TODO: função que coloca dados no banco;

  public static boolean pull() {
    return false;
  } //TODO: função que puxa dados no banco;


}