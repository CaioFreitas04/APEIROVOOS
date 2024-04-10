public class Data {

  private int dia;
  private int mes;
  private int ano;

  public Data(Data dt) {
    dia = dt.getData('d');
    mes = dt.getData('m');
    ano = dt.getData('a');
  }

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

    if (d < 1)
      dia = 1;
    else {
      if (d > 30) {
        if (m == 4 || m == 6 || m == 9 || m == 11)
          dia = 1;
        else {

          if (m == 2) {
            if (d > 29 && a % 4 == 0)
              dia = 1;
            else if (d > 28 && a % 4 != 0)
              dia = 1;
            else
              dia = d;
          } else {
            if (d > 31)
              dia = 1;
          }
        }
      } else
        dia = d;
    }

  }

  public void setData(Data dt) {

    SetData(dt.getData('d'), dt.getData('m'), dt.getData('a'));
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

    if (d < 1)
      dia = 1;
    else {
      if (d > 30) {
        if (m == 4 || m == 6 || m == 9 || m == 11)
          dia = 1;
        else {

          if (m == 2) {
            if (d > 29 && a % 4 == 0)
              dia = 1;
            else if (d > 28 && a % 4 != 0)
              dia = 1;
            else
              dia = d;
          } else {
            if (d > 31)
              dia = 1;
          }
        }
      } else
        dia = d;
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

  public void incrData() {

    int d = dia;
    int m = mes;
    int a = ano;
    d++;

    if ((d > 30) && (m == 4 || m == 6 || m == 9 || m == 11)) {
      m++;
      d = 1;
    } else {

      if (m == 2) {
        if (a % 4 == 0 && d > 29) {
          d = 1;
          m++;
        }
        if (a % 4 != 0 && d > 28) {
          d = 1;
          m++;
        }
      } else {
        if (d > 31) {
          d = 1;
          m++;
        }
      }
    }

    if (m > 12) {
      m = 1;
      a++;
    }
    dia = d;
    mes = m;
    ano = a;
  }

  public void decrData() {

    int d = dia;
    int m = mes;
    int a = ano;
    d--;

    if ((d == 0) && (m == 5 || m == 7 || m == 10 || m == 12)) {
      m--;
      d = 30;
    } else {

      if (m == 3) {
        if (a % 4 == 0 && d == 0) {
          d = 29;
          m--;
        }
        if (a % 4 != 0 && d == 0) {
          d = 28;
          m--;
        }
      } else {
        if (d < 1) {
          d = 31;
          m--;
        }
      }
    }

    if (m < 1) {
      m = 12;
      a--;
    }
    dia = d;
    mes = m;
    ano = a;
  }

  public static int distDatas(Data dt1, Data dt2) {

    Data Dcont = new Data(1, 1, 1);
    Data Dfim = new Data(1, 1, 1);
    int dist = 0;

    if (dt1.equals(dt2))
      return 0;

    if (dt1.getData('a') > dt2.getData('a')) {
      Dcont.setData(dt2);
      Dfim.setData(dt1);
    } else {
      if (dt1.getData('m') > dt2.getData('a')) {
        Dcont.setData(dt2);
        Dfim.setData(dt1);
      } else {
        if (dt1.getData('d') > dt2.getData('d')) {
          Dcont.setData(dt2);
          Dfim.setData(dt1);
        } else {
          Dcont.setData(dt1);
          Dfim.setData(dt2);
        }
      }
    }

    while ((Dcont.getData('d') != Dfim.getData('d')) || (Dcont.getData('m') != Dfim.getData('m'))
        || (Dcont.getData('a') != Dfim.getData('a'))) {
      dist++;
      Dcont.incrData();
      if (dist == Empresa.limite() / 100)
        return -1;
    }
    return dist;
  }

  public static boolean ehCronologico(Data d1, Data d2) {
    Data p = new Data(d1);
    int dp = Data.distDatas(p, d2);
    p.incrData();
    if (Data.distDatas(p, d2) < dp)
      return true;
    else
      return false;
  }
}