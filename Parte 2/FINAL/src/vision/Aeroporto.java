package vision;

import java.io.Serializable;
import java.util.ArrayList;

public class Aeroporto implements Serializable {

  private int codigo;
  private String nome;
  private ArrayList <Trecho> conexoes;
  private Cidade local;
  public static int qtdAeroporto = 0;

  public Aeroporto(String nomeIN, Cidade IN){
    nome = nomeIN;
    codigo = qtdAeroporto;
    qtdAeroporto++;
    local = IN;
    local.addAeroporto(this);
    conexoes = new ArrayList<Trecho>();

  }

  public int getCodigo() {return codigo;}
  public String getNome() {return nome;}
  public Trecho getConexao(int i) {return conexoes.get(i);}
  public ArrayList<Trecho> getConexoes() {return conexoes;}
  public Cidade getCidade() {return local;}
  public int getFuso() {return local.getFuso();}
  

  public void addConexao(Trecho t) {
      conexoes.remove(t);
      conexoes.add(t);
  }
  public void newTrechoTo(Aeroporto destino, Hora tempo, String CodIN) {
    Trecho t = new Trecho(destino, tempo, this, CodIN);
    Trecho t2 = new Trecho(this, tempo, destino, CodIN);
  }

}
