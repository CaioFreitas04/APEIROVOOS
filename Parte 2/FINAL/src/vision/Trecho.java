package vision;

import java.util.ArrayList;
import java.io.Serializable;


public class Trecho implements Serializable {

  private Aeroporto destino;
  private Aeroporto origem;
  private Hora tempo;
  private voo voos[];
  private int qtdVoos;
  private String cod;

  
  public Trecho(Aeroporto destinoIN, Hora tempoIN, Aeroporto saida, String codIN){
    destino = destinoIN;
    tempo = new Hora(tempoIN);

    saida.addConexao(this);
    qtdVoos = 0;
    cod = codIN;
  }

  public String getCod(){
    return cod;
  }

  public Aeroporto getDestino() {return destino;}
  public Aeroporto getOrigem() {return origem;}
  public Hora getTempo() {return tempo;}

  public void AddVoo(voo vooIN){
    if(VETOR.contem(voos, vooIN, qtdVoos)) return;

    vooIN.getComp().addVoo(vooIN);
    voos = VETOR.add(voos, vooIN, qtdVoos);
    qtdVoos++;
  }
  
  public boolean RemoveVoo(voo vooIN){
    if(VETOR.contem(voos, vooIN, qtdVoos)) return false;


    vooIN.getComp().removeVoo(vooIN);
    voos = VETOR.remove(voos, vooIN, qtdVoos);
    qtdVoos--;
    return true;
  }

  public ArrayList<voo> getVoos(){
    ArrayList retorno = new ArrayList();
    VETOR.toArrayList(voos, qtdVoos, retorno);
    return retorno;
  }

}
