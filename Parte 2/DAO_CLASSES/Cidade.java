import java.util.ArrayList;

public class Cidade extends Lugar {
  private String NCidade;
  private Aeroporto Aeroportos[];
  private Hotel Hoteis[];
  private int qtdAeroportos;
  private int qtdHoteis;

  public Cidade(String X, String ContinenteIN, int fusoIN) {
    setCid(X);
    super.setCont(ContinenteIN);
    super.setFuso(fusoIN);

    qtdAeroportos = 0;
    qtdHoteis = 0;
  }


  public String getCid() {
    return NCidade;
  }
  public void setCid(String X) {
    NCidade = X;
  }

  public int addAeroporto(Aeroporto X) {
    if (VETOR.contem(Aeroportos, X, qtdAeroportos))
      return -1;
    Aeroportos = VETOR.add(Aeroportos, X, qtdAeroportos);
    qtdAeroportos++;
    return 0;
  }
  public void removeAeroporto(Aeroporto X) {
    Aeroportos = VETOR.remove(Aeroportos, X, qtdAeroportos);
  }
  public ArrayList<Aeroporto> getAeroportos(){
    ArrayList<Aeroporto> ret = new ArrayList();
    for(int i=0; i<qtdAeroportos; i++) {ret.add(Aeroportos[i]);}
    return ret;
  }


  
  public int addHotel(Hotel X) {
    if (VETOR.contem(Hoteis, X, qtdHoteis))
      return -1;
      Hoteis = VETOR.add(Hoteis, X, qtdHoteis);
    qtdHoteis++;
    return 0;
  }
  public void removeHotel(Hotel X) {
    Hoteis = VETOR.remove(Hoteis, X, qtdHoteis);
  }
  public ArrayList<Hotel> getHoteis(){
    ArrayList<Hotel> ret = new ArrayList();
    for(int i=0; i<qtdHoteis; i++) {ret.add(Hoteis[i]);}
    return ret;
  }
  
  public Hotel buscarHotel(String IN){

    int i = 0;
    while (i < qtdHoteis) {
      if (Hoteis[i].getNomeOficial() == IN)
        return Hoteis[i];
      else
        i++;
    }
    return null;
  }

  
}