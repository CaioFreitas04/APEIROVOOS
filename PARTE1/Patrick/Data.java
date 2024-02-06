public class Data {

  private int dia;
  private int mes;
  private int ano;

  public Data(int d, int m, int a) {
      if (a == 0) {
        ano = 1;
      } else {
        ano = a;
      }

      if (m < 1 || m > 12) {
        mes = 1;
      } else {
        mes = m;
      }

      if (d < 1) dia = 1;
      else{
        if (d > 30) {
          if (m == 4 || m == 6 || m == 9 || m == 11) dia = 1;
          else{

            if (m == 2) {
              if (d > 29 && a % 4 == 0)
                dia = 1;
              else if (d > 28 && a % 4 != 0)
                dia = 1;
              else
                dia = d;
            } 
            else{
              if (d > 31) dia = 1;
            }
          }
        } else dia = d;
      }

  }

  public void SetData(int d, int m, int a) {
      if (a == 0) {
        ano = 1;
      } else {
        ano = a;
      }

      if (m < 1 || m > 12) {
        mes = 1;
      } else {
        mes = m;
      }

      if (d < 1) dia = 1;
      else{
        if (d > 30) {
          if (m == 4 || m == 6 || m == 9 || m == 11) dia = 1;
          else{
  
            if (m == 2) {
              if (d > 29 && a % 4 == 0)
                dia = 1;
              else if (d > 28 && a % 4 != 0)
                dia = 1;
              else
                dia = d;
            } 
            else{
              if (d > 31) dia = 1;
            }
          }
        } else dia = d;
      }
    
  }

  public int getData(char Horario) {
    switch (Horario) {
      case 'd':
        return dia;
      case 'm':
        return mes;
      case 'a':
        return ano;
      default:
        return -1;
    }

  }

}
