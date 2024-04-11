package vision;
import java.util.ArrayList;

public class Cliente extends Pessoa {
	
	/*
	private String nome;
	private String CPF;
	private String addr;
	private Data nasc;
	*/
	private Data cadastro;
	private boolean VIP;
	private static float VIPDesc;
	private Data VIPData;
	private int compras;
	private boolean validCPF;
	private String email;
	private ArrayList<Reserva> Reservas;
	private ArrayList<Passagem> Passagems;

	public Cliente() {
		this.validCPF = false;
		this.setNome("DEVMODE");
		this.setAddr("DEVMODE");
		this.compras = 74;
		this.VIP = false;
		this.email = "DEVMODE@APEIROVOOS.COM";
	}

	public Cliente(String nomein, String CPFin, String addrin, Data nascin, Data hoje, String emailin) {
		this.setNome(nomein);
		
		if(this.setCPF(CPFin)) {
			this.validCPF = true;
		}
		else {
			this.validCPF = false;
		}
		
		this.setAddr(addrin);
		
		this.setNasc(nascin);
		
		this.cadastro = hoje;
		
		this.compras = 0;
		
		this.VIP = false;

		this.email = emailin;

		Reservas = new ArrayList<Reserva>();
		Passagems = new ArrayList<Passagem>();
	}
	
	//construtor usado exclusivamente pelo banco de dados;
	public Cliente(String nomein, String CPFin, String addrin, boolean VIPin, int comprasin, String emailin) {
		this.setNome(nomein);
		
		this.setCPF(CPFin);
		
		this.setAddr(addrin);
		
		this.VIP = VIPin;
		
		this.compras = comprasin;
		
		this.email = emailin;
	}
	
	public boolean resetCPF(String CPFin) {
		if(this.validCPF) {
			return true;
		}
		else {
			if(this.setCPF(CPFin)) {
				this.validCPF = true;
				return true;
			}
			else {
				this.validCPF = false;
				return false;
			}
		}
	}
	
	public void adicionarAoCarrinho(Reserva in) {	//para reservas;
		if(!validCPF)
			return;
		this.Reservas.add(in);
	}

	public void adicionarAoCarrinho(Passagem in) {	//para passagens;
		if(!validCPF)
			return;
		this.Passagems.add(in);
	}

	public void comprar() {
		if(!this.validCPF) {
			return;
		}
		this.compras++;
		while(!(Reservas.isEmpty())) {
			Reservas.remove(0);
		}
		while(!(Passagems.isEmpty())) {
			Passagems.remove(0);
		}

	}
		
	public boolean makeVIP(Data hoje) {
		if(this.compras >= 10 && !(this.VIP)) {
			this.VIP = true;
			VIPData = hoje;
			return true;
		}
		return false;
	}

	public boolean isVIP() {
		return this.VIP;
	}
	
	public float getVIPDesc() {
		return VIPDesc;
	}
	
	public void setVIPDesc(float in) {
		VIPDesc = in;
	}
	public Data getCadastro() {
		return cadastro;
	}

	public String getEmail() {
		return this.email;
	}
	
	public int getCompras() {
		return this.compras;
	}

	public ArrayList<Reserva>getReservas(){
		return Reservas;
	}
	public ArrayList<Passagem>getPassagens(){
		return Passagems;
	}
	public void RemoverdoCarrinho(Passagem IN) {
		Passagems.remove(IN.getCod());
		
	}
	public void RemoverdoCarrinho(Reserva IN) {
		Reservas.remove(IN.getCod());
		
	}
	

	/*public Hotel pesquisarHotel(ArrayList<Hotel> hotelList, Hotel hotelIn) {
		if(!hotelList.contains(hotelIn)) {
			return null;
		}
		else 
			return hotelList.get(hotelIn);
	}*/
}
