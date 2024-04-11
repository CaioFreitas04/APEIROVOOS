package vision;

import java.io.Serializable;

public class Hora implements Serializable {

  private int h, m, s;

  public Hora(Hora IN) {
    h = IN.getHora('h');
    m = IN.getHora('m');
    s = IN.getHora('s');
  }

  public Hora(int hi, int mi, int si) {
    // checando se o tempo é valido;
    if (hi > 23 || hi < 0)
      h = 0;
    else
      h = hi;

    if (mi > 59 || mi < 0)
      m = 0;
    else
      m = mi;

    if (si > 59 || si < 0)
      s = 0;
    else
      s = si;
  }

  public void setHora(int hi, int mi, int si) {
    // checando se o tempo é valido;
    if (hi > 23 || hi < 0)
      h = h;
    else
      h = hi;

    if (mi > 59 || mi < 0)
      m = m;
    else
      m = mi;

    if (si > 59 || si < 0)
      s = s;
    else
      s = si;
  }

  public static int somaHoras(Hora h1, Hora h2, Hora retorno) {
    int hx = h1.getHora('h') + h2.getHora('h');
    int mx = h1.getHora('m') + h2.getHora('m');
    int sx = h1.getHora('s') + h2.getHora('s');
    int flag = 0;

    mx += (sx - sx % 60) / 60;
    hx += (mx - mx % 60) / 60;
    flag = (hx - hx % 24) / 24;

    sx %= 60;
    mx %= 60;
    hx %= 24;

    retorno.setHora(hx, mx, sx);
    return flag;
  }

  public static int calcHoraH(Hora h1, int h, Hora retorno) {
    int flag;
    Hora x;

    if (h > 0) {
      x = new Hora(h, 0, 0);
      flag = somaHoras(h1, x, retorno);
    } else {
      x = new Hora((h * (-1)), 0, 0);
      flag = subHoras(h1, x, retorno);
    }
    return flag;
  }

  public static int subHoras(Hora h1, Hora h2, Hora retorno) {
    int hx = h1.getHora('h') - h2.getHora('h');
    int mx = h1.getHora('m') - h2.getHora('m');
    int sx = h1.getHora('s') - h2.getHora('s');
    int flag = 0;

    while (sx < 0) {
      sx += 60;
      mx--;
    }
    while (mx < 0) {
      mx += 60;
      hx--;
    }
    while (hx < 0) {
      hx += 24;
      flag--;
    }

    retorno.setHora(hx, mx, sx);
    return flag;
  }

  public int getHora(char MODE) {
    switch (MODE) {
      case 'h':
        return h;
      case 'm':
        return m;
      case 's':
        return s;
      default:
        return -1;
    }
  }
}
