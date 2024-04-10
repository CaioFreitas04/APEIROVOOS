import java.util.ArrayList;
public class VETOR {

  // GENERICO:

  public static void toArrayList(Object[] vet, int max, ArrayList lista){
    for(int i = 0; i < max; i++)  lista.add(vet[i]);
    
  }











  // CIDADES:

  public static Cidade[] add(Cidade vet[], Cidade IN, int tamanhoVET) {

    if (VETOR.contem(vet, IN, tamanhoVET))
      return vet;
    Cidade vet2[] = new Cidade[tamanhoVET + 1];

    for (int i = 0; i < tamanhoVET; i++)
      vet2[i] = vet[i];

    vet2[tamanhoVET] = IN;

    return vet2;
  }

  public static Cidade[] remove(Cidade vet[], Cidade IN, int tamanhoVET) {

    Cidade vet2[] = new Cidade[tamanhoVET - 1];
    boolean achou = false;

    int i = 0;
    int j = 0;

    while (i < tamanhoVET) {

      if (vet[i].getCid() == IN.getCid()){
        i++;
        achou = true;
      }

      vet2[j] = vet[i];

      i++;
      j++;
    }

    if (achou)
      return vet2;
    else
      return vet;

  }
  public static boolean contem(Cidade vet[], Cidade IN, int tamanhoVET) {

    int i = 0;
    while (i < tamanhoVET) {

      if (vet[i].getCid() == IN.getCid())
        return true;
      else
        i++;

    }
    return false;
  }












  // CLIENTES:

  public static Cliente[] add(Cliente vet[], Cliente IN, int tamanhoVET) {

    if (VETOR.contem(vet, IN, tamanhoVET))
      return vet;
    Cliente vet2[] = new Cliente[tamanhoVET + 1];

    for (int i = 0; i < tamanhoVET; i++)
      vet2[i] = vet[i];

    vet2[tamanhoVET] = IN;

    return vet2;
  }

  public static Cliente[] remove(Cliente vet[], Cliente IN, int tamanhoVET) {

    Cliente vet2[] = new Cliente[tamanhoVET - 1];
    boolean achou = false;

    int i = 0;
    int j = 0;

    while (i < tamanhoVET) {

      if (vet[i].getCPF() == IN.getCPF()){
        i++;
        achou = true;
      }

      vet2[j] = vet[i];

      i++;
      j++;
    }

    if (achou)
      return vet2;
    else
      return vet;

  }
  public static boolean contem(Cliente vet[], Cliente IN, int tamanhoVET) {

    int i = 0;
    while (i < tamanhoVET) {

      if (vet[i].getCPF() == IN.getCPF())
        return true;
      else
        i++;

    }
    return false;
  }












  // Funcionarios:

  public static Funcionario[] add(Funcionario vet[], Funcionario IN, int tamanhoVET) {

    if (VETOR.contem(vet, IN, tamanhoVET))
      return vet;
    Funcionario vet2[] = new Funcionario[tamanhoVET + 1];

    for (int i = 0; i < tamanhoVET; i++)
      vet2[i] = vet[i];

    vet2[tamanhoVET] = IN;

    return vet2;
  }

  public static Funcionario[] remove(Funcionario vet[], Funcionario IN, int tamanhoVET) {

    Funcionario vet2[] = new Funcionario[tamanhoVET - 1];
    boolean achou = false;

    int i = 0;
    int j = 0;

    while (i < tamanhoVET) {

      if (vet[i].getCPF() == IN.getCPF()){
        i++;
        achou = true;
      }

      vet2[j] = vet[i];

      i++;
      j++;
    }

    if (achou)
      return vet2;
    else
      return vet;

  }
  public static boolean contem(Funcionario vet[], Funcionario IN, int tamanhoVET) {

    int i = 0;
    while (i < tamanhoVET) {

      if (vet[i].getCPF() == IN.getCPF())
        return true;
      else
        i++;

    }
    return false;
  }















  public static CompAerea[] add(CompAerea vet[], CompAerea IN, int tamanhoVET) {

    if (VETOR.contem(vet, IN, tamanhoVET))
      return vet;
    CompAerea vet2[] = new CompAerea[tamanhoVET + 1];

    for (int i = 0; i < tamanhoVET; i++)
      vet2[i] = vet[i];

    vet2[tamanhoVET] = IN;

    return vet2;
  }

  public static CompAerea[] remove(CompAerea vet[], CompAerea IN, int tamanhoVET) {

    CompAerea vet2[] = new CompAerea[tamanhoVET - 1];
    boolean achou = false;

    int i = 0;
    int j = 0;

    while (i < tamanhoVET) {

      if (vet[i].getCNPJ() == IN.getCNPJ()){
        i++;
        achou = true;
      }

      vet2[j] = vet[i];

      i++;
      j++;
    }

    if (achou)
      return vet2;
    else
      return vet;

  }
  public static boolean contem(CompAerea vet[], CompAerea IN, int tamanhoVET) {

    int i = 0;
    while (i < tamanhoVET) {

      if (vet[i].getCNPJ() == IN.getCNPJ())
        return true;
      else
        i++;

    }
    return false;
  }













  // PESQUISAS:

  public static Pesquisa[] add(Pesquisa vet[], Pesquisa IN, int tamanhoVET) {

    Pesquisa vet2[] = new Pesquisa[tamanhoVET + 1];

    for (int i = 0; i < tamanhoVET; i++)
      vet2[i] = vet[i];

    vet2[tamanhoVET] = IN;

    return vet2;
  }

  public static Pesquisa[] remove(Pesquisa vet[], Pesquisa IN, int tamanhoVET) {

    Pesquisa vet2[] = new Pesquisa[tamanhoVET - 1];
    boolean achou = false;

    int i = 0;
    int j = 0;

    while (i < tamanhoVET) {

      if (vet[i].getCod() == IN.getCod()){
        i++;
        achou = true;
      }

      vet2[j] = vet[i];

      i++;
      j++;
    }

    if (achou)
      return vet2;
    else
      return vet;

  }
  public static boolean contem(Pesquisa vet[], Pesquisa IN, int tamanhoVET) {

    int i = 0;
    while (i < tamanhoVET) {

      if (vet[i].getCod() == IN.getCod())
        return true;
      else
        i++;

    }
    return false;
  }












  // AEROPORTOS:

  public static Aeroporto[] add(Aeroporto vet[], Aeroporto IN, int tamanhoVET) {

    if (VETOR.contem(vet, IN, tamanhoVET))
      return vet;
    Aeroporto vet2[] = new Aeroporto[tamanhoVET + 1];

    for (int i = 0; i < tamanhoVET; i++)
      vet2[i] = vet[i];

    vet2[tamanhoVET] = IN;

    return vet2;
  }

  public static Aeroporto[] remove(Aeroporto vet[], Aeroporto IN, int tamanhoVET) {

    Aeroporto vet2[] = new Aeroporto[tamanhoVET - 1];
    boolean achou = false;

    int i = 0;
    int j = 0;

    while (i < tamanhoVET) {

      if (vet[i].getCodigo() == IN.getCodigo()){
        i++;
        achou = true;
      }

      vet2[j] = vet[i];

      i++;
      j++;
    }

    if (achou)
      return vet2;
    else
      return vet;

  }
  public static boolean contem(Aeroporto vet[], Aeroporto IN, int tamanhoVET) {

    int i = 0;
    while (i < tamanhoVET) {

      if (vet[i].getCodigo() == IN.getCodigo())
        return true;
      else
        i++;

    }
    return false;
  }











  // HOTEIS:

  public static Hotel[] add(Hotel vet[], Hotel IN, int tamanhoVET) {

    if (VETOR.contem(vet, IN, tamanhoVET))
      return vet;
    Hotel vet2[] = new Hotel[tamanhoVET + 1];

    for (int i = 0; i < tamanhoVET; i++)
      vet2[i] = vet[i];

    vet2[tamanhoVET] = IN;

    return vet2;
  }

  public static Hotel[] remove(Hotel vet[], Hotel IN, int tamanhoVET) {

    Hotel vet2[] = new Hotel[tamanhoVET - 1];
    boolean achou = false;

    int i = 0;
    int j = 0;

    while (i < tamanhoVET) {

      if (vet[i].getCNPJ() == IN.getCNPJ()){
        i++;
        achou = true;
      }

      vet2[j] = vet[i];

      i++;
      j++;
    }

    if (achou)
      return vet2;
    else
      return vet;

  }
  public static boolean contem(Hotel vet[], Hotel IN, int tamanhoVET) {

    int i = 0;
    while (i < tamanhoVET) {

      if (vet[i].getCNPJ() == IN.getCNPJ())
        return true;
      else
        i++;

    }
    return false;
  }






  



// VOOS:

  public static voo[] add(voo vet[], voo IN, int tamanhoVET) {
    voo vet2[] = new voo[tamanhoVET + 1];
    for (int i = 0; i < tamanhoVET; i++)
      vet2[i] = vet[i];

    vet2[tamanhoVET] = IN;

    return vet2;
  }

  public static voo[] remove(voo vet[], voo IN, int tamanhoVET){

    voo vet2[] = new voo[tamanhoVET - 1];
    boolean achou = false;

    int i = 0;
    int j = 0;

    while (i < vet.length) {

      if (vet[i].getCodigo() == IN.getCodigo()) {
        i++;
        achou = true;
      }

      vet2[j] = vet[i];

      i++;
      j++;
    }

    if (achou)
      return vet2;
    else
      return vet;

  }

  public static boolean contem(voo vet[], voo IN, int tamanhoVET) {

    int i = 0;
    while (i < tamanhoVET) {

      if (vet[i].getCodigo() == IN.getCodigo())
        return true;
      else
        i++;

    }
    return false;
  }













  
  // TRECHOS:

  public static Trecho[] add(Trecho vet[], Trecho IN, int tamanhoVET) {
    Trecho vet2[] = new Trecho[tamanhoVET + 1];
    for (int i = 0; i < tamanhoVET; i++)
      vet2[i] = vet[i];

    vet2[tamanhoVET] = IN;

    return vet2;
  }

  public static Trecho[] remove(Trecho vet[], Trecho IN, int tamanhoVET) {

    Trecho vet2[] = new Trecho[tamanhoVET - 1];
    boolean achou = false;

    int i = 0;
    int j = 0;

    while (i < vet.length) {

      if (vet[i].getDestino().equals(IN.getDestino())) {
        i++;
        achou = true;
      }

      vet2[j] = vet[i];

      i++;
      j++;
    }

    if (achou)
      return vet2;
    else
      return vet;

  }

  public static boolean contem(Trecho vet[], Trecho IN, int tamanhoVET) {

    int i = 0;
    while (i < tamanhoVET) {

      if (vet[i].getDestino().getCodigo() == IN.getDestino().getCodigo())
        return true;
      else
        i++;

    }
    return false;
  }
  // public static boolean contem(Trecho vet[], Trecho IN) {return false;}









  
  // DATAS:

  public static boolean contem(Data vet[], Data IN) {

    int size = vet.length;
    for (int i = 0; i < size; i++) {
      if (vet[i].getData('d') == IN.getData('d') && vet[i].getData('m') == IN.getData('m')
          && vet[i].getData('a') == IN.getData('a'))
        return true;
    }
    return false;
  }

  public static Data[] add(Data vet[], Data IN) {
    Data vet2[] = new Data[vet.length + 1];

    for (int i = 0; i < vet.length; i++)
      vet2[i] = vet[i];

    vet2[vet.length] = IN;

    return vet2;
  }

  public static Data[] remove(Data vet[], Data IN) {

    Data vet2[] = new Data[vet.length - 1];
    boolean achou = false;

    int i = 0;
    int j = 0;

    while (i < vet.length) {

      if (vet[i].getData('d') == IN.getData('d') && vet[i].getData('m') == IN.getData('m')
          && vet[i].getData('a') == IN.getData('a')) {
        i++;
        achou = true;
      }

      vet2[j] = vet[i];

      i++;
      j++;
    }

    if (achou)
      return vet2;
    else
      return vet;

  }
}