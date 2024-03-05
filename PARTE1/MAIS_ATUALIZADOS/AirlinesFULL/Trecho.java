
import java.util.ArrayList;


public class Trecho{

  private Aeroporto destino;
  private Aeroporto origem;
  private Hora tempo;
  private ArrayList<voo> voos;

  private String cod;
  public Trecho(Aeroporto destinoIN, Hora tempoIN, Aeroporto saida, String codIN){
    destino = destinoIN;
    tempo = new Hora(tempoIN);

    saida.addConexao(this);
    voos = new ArrayList<voo>();
    cod = codIN;
  }

  public String getCod(){
    return cod;
  }

  public Aeroporto getDestino() {return destino;}
  public Aeroporto getOrigem() {return origem;}
  public Hora getTempo() {return tempo;}

  public void AddVoo(voo vooIN){
    voos.add(vooIN);
  }
  public boolean RemoveVoo(voo vooIN){
    return voos.remove(vooIN);
  }

  public ArrayList<voo> getVoos(){
    return voos;
  }

}