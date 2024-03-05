import java.util.ArrayList;

public class CompAerea {

  private String CNPJ;
  private String Nome_Oficial;
  private String Nome_de_Divulgação;
  private Data Data_de_Fundação;
  private float Comissao_por_passagem;
  private ArrayList<voo> voos;

  public CompAerea(String CNPJin, String Nome_Oficialin, String Nome_de_Divulgacaoin, Data Data_de_Fundaçãoin, float Comisao_por_passagemin) {
    CNPJ = CNPJin;
    Nome_Oficial = Nome_Oficialin;
    Nome_de_Divulgacaoin = Nome_Oficialin;
    Data_de_Fundação = new Data(Data_de_Fundaçãoin);
    voos = new ArrayList<voo>();
  }

  private String getCNPJ() {
    return CNPJ;
  };

  private String getNome_Oficial() {
    return Nome_Oficial;
  }

  private String getNome_de_Divulgação() {
    return Nome_de_Divulgação;
  }

  private Data getData_de_Fundação() {
    return Data_de_Fundação;
  }

  private float getComissao_por_passagem() {
    return Comissao_por_passagem;
  }

  private ArrayList<voo> getVoos() {
    return voos;
  }


}