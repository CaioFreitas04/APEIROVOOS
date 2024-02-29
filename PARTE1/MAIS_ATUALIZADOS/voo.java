public class voo {

  private final Trecho rota;
  private final Aeroporto origem;
  private Aeroporto destino;
  private final String codigo;

  private Hora tempoDeVoo;
  private Hora HoraDePartida;
  private Hora HoraDeChegada;
  private Data diaPartida;
  private Data diaChegada;

  private int qtdEconAssentos;
  private int qtdFirstClassAssentos;
  private int EconOcupados;
  private int FirstClassOcupados;

  private double precoEcon;
  private double precoFirstClass;

  public voo(String codigoIN, Aeroporto origemIN, Trecho rotaIN, Hora tempoVooIN, Hora PartidaIN, Data diaPartidaIN) {

    int signal = 0;
    Hora controle = new Hora(0, 0, 0);

    codigo = codigoIN;

    origem = origemIN;
    destino = rotaIN.getDestino();
    rota = rotaIN;

    tempoDeVoo = new Hora(tempoVooIN);
    HoraDePartida = new Hora(PartidaIN);
    HoraDeChegada = new Hora(0, 0, 0);
    signal = Hora.calcHoraH(HoraDePartida, (destino.getFuso() - origemIN.getFuso()), HoraDeChegada);

    signal += Hora.somaHoras(HoraDeChegada, tempoVooIN, HoraDeChegada);

    diaPartida = new Data(diaPartidaIN);
    diaChegada = new Data(diaPartidaIN);
    while (signal > 0) {
      diaChegada.incrData();
      signal--;
    }
    while (signal < 0) {
      diaChegada.decrData();
      signal++;
    }
  }

  public void setAssentos(int qtdEconAssentosIN, int qtdFirstClassAssentosIN, double precoEconIN,
      double precoFirstClassIN) {

    qtdEconAssentos = qtdEconAssentosIN;
    qtdFirstClassAssentos = qtdFirstClassAssentosIN;
    precoEcon = precoEconIN;
    precoFirstClass = precoFirstClassIN;
    FirstClassOcupados = 0;
    EconOcupados = 0;

  }

  public String getCodigo() {
    return codigo;
  }

  public Aeroporto getOrigem() {
    return origem;
  }

  public Aeroporto getDestino() {
    return destino;
  }

  public Trecho getRota() {
    return rota;
  }

  public Hora getTempoDeVoo() {
    return tempoDeVoo;
  }

  public Hora getHoraDePartida() {
    return HoraDePartida;
  }

  public Hora getHoraDeChegada() {
    return HoraDeChegada;
  }

  public Data getDiaPartida() {
    return diaPartida;
  }

  public Data getDiaChegada() {
    return diaChegada;
  }

  public int getQtdEconAssentos() {
    return qtdEconAssentos;
  }

  public int getQtdFirstClassAssentos() {
    return qtdFirstClassAssentos;
  }

  public int getEconOcupados() {
    return EconOcupados;
  }

  public int getFirstClassOcupados() {
    return FirstClassOcupados;
  }

  public double getPrecoEcon() {
    return precoEcon;
  }

  public double getPrecoFirstClass() {
    return precoFirstClass;
  }

  public int qtdEconLivres() {
    return qtdEconAssentos - EconOcupados;
  }

  public int qtdFirstClassLivres() {
    return qtdFirstClassAssentos - FirstClassOcupados;
  }

}