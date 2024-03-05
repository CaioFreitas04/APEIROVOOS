public class Pesquisa{

  private Hotel HotelBuscado;
  private Cidade DestinoBuscado;
  private Data DataChegadaBuscada;
  private Data DataPartidaBuscada;
  private int cod;
  private static int qtdPesquisasGlobal = 0;

  
  public Pesquisa(Hotel IN, Data DataChegadaBuscadaIN, Data DataPartidaBuscadaIN){
    HotelBuscado = IN;
    DataChegadaBuscada = DataChegadaBuscadaIN;
    DataPartidaBuscada = DataPartidaBuscadaIN;
  }
  public Pesquisa(Cidade IN, Data DataChegadaBuscadaIN, Data DataPartidaBuscadaIN){
    DestinoBuscado = IN;
    DataChegadaBuscada = DataChegadaBuscadaIN;
    DataPartidaBuscada = DataPartidaBuscadaIN;
  }



  

  public Hotel getHotelBuscado() {return HotelBuscado;}
  public Cidade getCidadeBuscada() {return DestinoBuscado;}
  public Data getDataChegadaBuscada() {return DataChegadaBuscada;}
  public Data getDataPartidaBuscada() {return DataPartidaBuscada;}
  public int getCod() {return cod;}
  public static int getQtdPesquisas() {return qtdPesquisasGlobal;}

}