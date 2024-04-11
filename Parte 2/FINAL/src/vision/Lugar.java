package vision;

import java.io.Serializable;

public class Lugar implements Serializable {
  protected String Continente;
  protected int FusoHorarioD;
  protected int FusoHorarioH;


  public int getFuso() {return FusoHorarioH + (FusoHorarioD*24);}  
  public void setFuso(int X) {
    int Dia = 0, Fuso = 0;

    if (X == 24) {
      Dia = 1;
    } else if (X > 24) {
      Dia = X / 24;
      Fuso = X % 24;
    } else {
      Fuso = X;
    }
    FusoHorarioD = Dia;
    FusoHorarioH = Fuso;
  }

  public void setCont(String X) {
    Continente = X;
  }
}
