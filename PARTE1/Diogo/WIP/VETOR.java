
public class VETOR {

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
