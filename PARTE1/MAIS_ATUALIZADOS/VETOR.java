
public class VETOR {

  //AEROPORTOS:

  public static Aeroporto[] add(Aeroporto vet[], Aeroporto IN, int tamanhoVET) {

    if(VETOR.contem(vet, IN, tamanhoVET)) return vet;
    Aeroporto vet2[] = new Aeroporto[tamanhoVET + 1];

    for (int i = 0; i < tamanhoVET; i++)
      vet2[i] = vet[i];

    vet2[tamanhoVET] = IN;

    return vet2;
  }

  public static boolean contem(Aeroporto vet[], Aeroporto IN, int tamanhoVET) {

    int i=0;
    while (i < tamanhoVET) {

      if (vet[i].getCodigo() == IN.getCodigo()) return true;
      else i++;

    }
    return false;
  }
  //TRECHOS:

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


      if (vet[i].getDestino().equals(IN.getDestino())){
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

    int i=0;
    while (i < tamanhoVET) {

      if (vet[i].getDestino().getCodigo() == IN.getDestino().getCodigo()) return true;
      else i++;

    }
    return false;
  }
  //public static boolean contem(Trecho vet[], Trecho IN) {return false;}


  //DATAS:
  
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