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
	private ArrayList compraArray;

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

		compraArray = new ArrayList();
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
		this.compraArray.add(in);
	}

	public void adicionarAoCarrinho(Passagem in) {	//para passagens;
		if(!validCPF)
			return;
		this.compraArray.add(in);
	}

	public void comprar() {
		if(!this.validCPF)
			return;
		
		compraArray.clear();
		this.compras++;	
	}
		
	public void makeVIP(Data hoje) {
		if(this.compras >= 10 && !(this.VIP)) {
			this.VIP = true;
			VIPData = hoje;
		}
	}
	
	public float getVIPDesc() {
		return VIPDesc;
	}
	
	public void setVIPDesc(float in) {
		VIPDesc = in;
	}
	

	public String getEmail() {
		return this.email;
	}

	/*public Hotel pesquisarHotel(ArrayList<Hotel> hotelList, Hotel hotelIn) {
		if(!hotelList.contains(hotelIn)) {
			return null;
		}
		else 
			return hotelList.get(hotelIn);
	}*/
}
