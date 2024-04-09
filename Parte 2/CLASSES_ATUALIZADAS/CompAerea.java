import java.util.ArrayList;

public class CompAerea {

  private String CNPJ;
  private String Nome_Oficial;
  private String Nome_de_Divulgação;
  private Data Data_de_Fundação;
  private ArrayList<voo> voos;    //Este ArrayList apenas guarda os voos alocados nos trechos

  public CompAerea(String CNPJin, String Nome_Oficialin, String Nome_de_Divulgacaoin, Data Data_de_Fundaçãoin) {
    CNPJ = CNPJin;
    Nome_Oficial = Nome_Oficialin;
    Nome_de_Divulgação = Nome_de_Divulgacaoin;
    Data_de_Fundação = new Data(Data_de_Fundaçãoin);
    voos = new ArrayList<voo>();
  }

  public String getCNPJ() {
    return CNPJ;
  }

  public String getNome_Oficial() {
    return Nome_Oficial;
  }

  public String getNome_de_Divulgação() {
    return Nome_de_Divulgação;
  }
  public void setNome_de_Divulgação(String nomeIN) {
    Nome_de_Divulgação = nomeIN;
  }

  public Data getData_de_Fundação() {
    return Data_de_Fundação;
  }
  public ArrayList<voo> getVoos() {
    return voos;
  }

  public void addVoo(voo vooIN){
    voos.add(vooIN);
  }
  public void removeVoo(voo vooIN){
    voos.remove(vooIN);
  }


}
