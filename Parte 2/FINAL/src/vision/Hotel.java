package vision;
import java.util.ArrayList;
import java.io.Serializable;

public class Hotel implements Serializable {

  private String CNPJ;
  private String Nome_Oficial;
  private String Nome_de_Divulgacao;
  private Data Data_de_Fundacao;
  private String Endereco;
  private int Estrelas;
  private int NumeroQuartosStandard;
  private int NumeroQuartosStandard1pessoa;
  private int NumeroQuartosStandard2pessoa;
  private int NumeroQuartosStandard3pessoa;
  private int NumeroQuartosPremium;
  private int NumeroQuartosPremium1pessoa;
  private int NumeroQuartosPremium2pessoa;
  private int NumeroQuartosPremium3pessoa;
  private boolean AceitaPet;
  private boolean AceitaCancelamento;
  private Hora HorarioCheckin;
  private Hora HorarioCheckout;
  private String Slogan;
  private String Descricao;

  private Quarto StdQuartos1pessoa[];
  private Quarto StdQuartos2pessoa[];
  private Quarto StdQuartos3pessoa[];

  private Quarto PremiumQuartos1pessoa[];
  private Quarto PremiumQuartos2pessoa[];
  private Quarto PremiumQuartos3pessoa[];

  private Cidade city;

  public Hotel(String CNPJIN, String Nome_OficialIN, Cidade cityIN) {
    CNPJ = new String(CNPJIN);
    Nome_Oficial = new String(Nome_OficialIN);
    city = cityIN;
  }

  public void setHotel(String Nome_OficialIN, String Nome_de_DivulgacaoIN, Data Data_de_FundacaoIN, String EnderecoIN, int EstrelasIN, boolean AceitaPetIN, boolean AceitaCancelamentoIN, Hora HorarioCheckinIN, Hora HorarioCheckouINt, String SloganIN, String DescricaoIN) {
    Nome_Oficial = Nome_OficialIN;
    Nome_de_Divulgacao = Nome_de_DivulgacaoIN;
    Data_de_Fundacao = Data_de_FundacaoIN;
    Endereco = EnderecoIN;
    Estrelas = EstrelasIN;
    AceitaPet = AceitaPetIN;
    AceitaCancelamento = AceitaCancelamentoIN;
    HorarioCheckin = HorarioCheckinIN;
    HorarioCheckout = HorarioCheckouINt;
    Slogan = SloganIN;
    Descricao = DescricaoIN;

  }

  public void setStdRooms(int qtdQuartos1pessoa, double precoQuartos1pessoa, int qtdQuartos2pessoa,
      double precoQuartos2pessoa, int qtdQuartos3pessoa, double precoQuartos3pessoa) {

    NumeroQuartosStandard = qtdQuartos1pessoa + qtdQuartos2pessoa + qtdQuartos3pessoa;
    NumeroQuartosStandard1pessoa = qtdQuartos1pessoa;
    NumeroQuartosStandard2pessoa = qtdQuartos1pessoa;
    NumeroQuartosStandard3pessoa = qtdQuartos1pessoa;

    StdQuartos1pessoa = new Quarto[qtdQuartos1pessoa];
    StdQuartos2pessoa = new Quarto[qtdQuartos2pessoa];
    StdQuartos3pessoa = new Quarto[qtdQuartos3pessoa];

    int cont = 0;
    for (cont = 0; cont < qtdQuartos1pessoa; cont++) {
      StdQuartos1pessoa[cont] = new Quarto(precoQuartos1pessoa, 1);
    }
    System.out.println("\nsignal1");
    for (cont = 0; cont < qtdQuartos2pessoa; cont++) {
      StdQuartos2pessoa[cont] = new Quarto(precoQuartos2pessoa, 2);
    }
    System.out.println("\nsignal2");
    for (cont = 0; cont < qtdQuartos3pessoa; cont++) {
      StdQuartos3pessoa[cont] = new Quarto(precoQuartos3pessoa, 3);
    }
  }

  public void setPremiumRooms(int qtdQuartos1pessoa, double precoQuartos1pessoa, int qtdQuartos2pessoa,
      double precoQuartos2pessoa, int qtdQuartos3pessoa, double precoQuartos3pessoa) {

    NumeroQuartosPremium = qtdQuartos1pessoa + qtdQuartos2pessoa + qtdQuartos3pessoa;
    NumeroQuartosPremium1pessoa = qtdQuartos1pessoa;
    NumeroQuartosPremium2pessoa = qtdQuartos1pessoa;
    NumeroQuartosPremium3pessoa = qtdQuartos1pessoa;

    PremiumQuartos1pessoa = new Quarto[qtdQuartos1pessoa];
    PremiumQuartos2pessoa = new Quarto[qtdQuartos2pessoa];
    PremiumQuartos3pessoa = new Quarto[qtdQuartos3pessoa];

    int cont = 0;
    for (cont = 0; cont < qtdQuartos1pessoa; cont++) {
      PremiumQuartos1pessoa[cont] = new Quarto(precoQuartos1pessoa, 1);
    }
    for (cont = 0; cont < qtdQuartos2pessoa; cont++) {
      PremiumQuartos2pessoa[cont] = new Quarto(precoQuartos2pessoa, 2);
    }
    for (cont = 0; cont < qtdQuartos3pessoa; cont++) {
      PremiumQuartos3pessoa[cont] = new Quarto(precoQuartos2pessoa, 3);
    }
  }

  public String getCNPJ() {
    return CNPJ;
  }

  public String getNomeOficial() {
    return Nome_Oficial;
  }

  public String getNome_de_Divulgacao() {
    return Nome_de_Divulgacao;
  }

  public Data getData_de_Fundacao() {
    return Data_de_Fundacao;
  }

  public String getEndereco() {
    return Endereco;
  }

  public int getEstrelas() {
    return Estrelas;
  }

  public int getNumeroQuartosStandard() {
    return NumeroQuartosStandard;
  }

  public int getNumeroQuartosStandard1pessoa() {
    return NumeroQuartosStandard1pessoa;
  }

  public int getNumeroQuartosStandard2pessoa() {
    return NumeroQuartosStandard2pessoa;
  }

  public int getNumeroQuartosStandard3pessoa() {
    return NumeroQuartosStandard3pessoa;
  }

  public int getNumeroQuartosPremium() {
    return NumeroQuartosPremium;
  }

  public int getNumeroQuartosPremium1pessoa() {
    return NumeroQuartosPremium1pessoa;
  }

  public int getNumeroQuartosPremium2pessoa() {
    return NumeroQuartosPremium2pessoa;
  }

  public int getNumeroQuartosPremium3pessoa() {
    return NumeroQuartosPremium3pessoa;
  }

  public boolean getAceitaPet() {
    return AceitaPet;
  }

  public boolean getAceitaCancelamento() {
    return AceitaCancelamento;
  }

  public Hora getHorarioCheckin() {
    return HorarioCheckin;
  }

  public Hora getHorarioCheckout() {
    return HorarioCheckout;
  }

  public String getSlogan() {
    return Slogan;
  }

  public String getDescricao() {
    return Descricao;
  }
  
  public Cidade getCity() {
    return city;
  }

  public int qtdQuartosDisponiveisParaReserva(Reserva r, String type, int qtdPessoas) {

    if (type == "Std") {
      switch (qtdPessoas) {
        case 1:
          return ConsultarQuartos(StdQuartos1pessoa, r);
        case 2:
          return ConsultarQuartos(StdQuartos2pessoa, r);
        case 3:
          return ConsultarQuartos(StdQuartos3pessoa, r);
        default:
          return -1;
      }
    }
    if (type == "Premium") {
      switch (qtdPessoas) {
        case 1:
          return ConsultarQuartos(PremiumQuartos1pessoa, r);
        case 2:
          return ConsultarQuartos(PremiumQuartos2pessoa, r);
        case 3:
          return ConsultarQuartos(PremiumQuartos3pessoa, r);
        default:
          return -1;
      }
    }
    return -2;
  }

  public int ConsultarQuartos(Quarto vet[], Reserva IN) {

    int max = vet.length;
    int cont = 0;
    for (int i = 0; i < max; i++) {
      if (vet[i].ehPossivelReservar(IN))
        cont++;
    }
    return cont;
  }

  public int addReserva(Reserva r, String type, int qtdPessoas) {

    if (type == "Std") {
      switch (qtdPessoas) {
        case 1:
          return EncaixarReserva(StdQuartos1pessoa, r);
        case 2:
          return EncaixarReserva(StdQuartos2pessoa, r);
        case 3:
          return EncaixarReserva(StdQuartos3pessoa, r);
        default:
          return -1;
      }
    }
    if (type == "Premium") {
      switch (qtdPessoas) {
        case 1:
          return EncaixarReserva(PremiumQuartos1pessoa, r);
        case 2:
          return EncaixarReserva(PremiumQuartos2pessoa, r);
        case 3:
          return EncaixarReserva(PremiumQuartos3pessoa, r);
        default:
          return -1;
      }
    }
    return -2;
  }

  private int EncaixarReserva(Quarto vet[], Reserva IN) {

    if (vet.length == 0)
      return -2;
    int max = vet.length;
    for (int i = 0; i < max; i++) {
      
      if (vet[i].addReserva(IN) == 0) {
        IN.setQuarto(vet[i]);
        IN.setPreco(vet[i]);
        return vet[i].getNumero();
      }
    }
    return -1;
  }

  private void RemoverReserva(Reserva IN) {
    IN.getQuarto().removeReserva(IN);
  }
}
