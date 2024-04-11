package vision;
import java.io.Serializable;

public class Pesquisa implements Serializable{

  private Hotel HotelBuscado;
  private Cidade DestinoBuscado;
  private Data DataChegadaBuscada;
  private Data DataPartidaBuscada;
  private int cod;

  
  public Pesquisa(Hotel IN, Data DataChegadaBuscadaIN, Data DataPartidaBuscadaIN){
    HotelBuscado = IN;
    DataChegadaBuscada = DataChegadaBuscadaIN;
    DataPartidaBuscada = DataPartidaBuscadaIN;
    cod = DadosPesquisas.getQtdPesquisasTotais();;
    DadosPesquisas.addQtdPesquisas(1);
  }
  public Pesquisa(Cidade IN, Data DataChegadaBuscadaIN, Data DataPartidaBuscadaIN){
    DestinoBuscado = IN;
    DataChegadaBuscada = DataChegadaBuscadaIN;
    DataPartidaBuscada = DataPartidaBuscadaIN;
    cod = DadosPesquisas.getQtdPesquisasTotais();;
    DadosPesquisas.addQtdPesquisas(1);
  }



  

  public Hotel getHotelBuscado() {return HotelBuscado;}
  public Cidade getCidadeBuscada() {return DestinoBuscado;}
  public Data getDataChegadaBuscada() {return DataChegadaBuscada;}
  public Data getDataPartidaBuscada() {return DataPartidaBuscada;}
  public int getCod() {return cod;}

}
