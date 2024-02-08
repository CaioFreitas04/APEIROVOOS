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
	
	public Cliente(String nomein, String CPFin, String addrin, Data nascin, Data hoje) {
		this.setNome(nomein);
		
		//essa parte é temporária;
		if(this.setCPF(CPFin)) {
			//TODO: sistema de validação de CPF;
			System.out.println("eh jogo");
			this.validCPF = true;
		}
		else {
			System.out.println("naum eh jogo");
			this.validCPF = false;
		}
		//end_temporário;
		
		this.setAddr(addrin);
		
		this.setNasc(nascin);
		
		this.cadastro = hoje;
		
		this.compras = 0;
		
		this.VIP = false;
	}
	
	public void resetCPF(String CPFin) {
		if(this.validCPF) {
			return;
		}
		else {
			if(this.setCPF(CPFin)) {
				//TODO: sistema de validação de CPF;
				System.out.println("agora eh jogo");
				this.validCPF = true;
			}
			else {
				System.out.println("ainda naum eh jogo");
				this.validCPF = false;
			}
		}
	}
	
	public void comprar() {
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
}