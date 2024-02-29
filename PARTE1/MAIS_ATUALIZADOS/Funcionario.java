public class Funcionario extends Pessoa {
	
	/*
	private String nome;
	private String CPF;
	private String addr;
	private Data nasc;
	*/
	private String numCarteira;
	private float sal;
	private static float salMin;
	private boolean validCPF;
	
	public Funcionario(String nomein, String CPFin, String addrin, Data nascin, String numCartin) {
		this.setNome(nomein);
		
		if(this.setCPF(CPFin)) {
			this.validCPF = true;
		}
		else {
			this.validCPF = false;
		}
		
		this.setAddr(addrin);
		
		this.setNasc(nascin);
		
		this.numCarteira = numCartin;
		
		this.sal = salMin;
	}
	
	public static float getSalMin() {
		return salMin;
	}
	
	public static void setSalMin(float in) {
		salMin = in;
	}
	
	public String getNumCart() {
		return this.numCarteira;
	}
	
	public float getSal() {
		return this.sal;
	}
	
	public void setSal(float salMult) {
		this.sal = salMult * Funcionario.getSalMin();
	}
	
}
