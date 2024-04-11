package vision;
public class Funcionario extends Pessoa {
	
	/*
	private String nome;
	private String CPF;
	private String addr;
	private Data nasc;
	*/
	protected String numCarteira;
  protected double sal;
  protected static double salMin;
  protected boolean validCPF;
	
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
	
	public static double getSalMin() {
		return salMin;
	}
	
	public static void setSalMin(double in) {
		salMin = in;
	}
	
	public String getNumCart() {
		return this.numCarteira;
	}
	
	public double getSal() {
		return this.sal;
	}
	
	public void setSal(double salMult) {
		this.sal = salMult * Funcionario.getSalMin();
	}
	
}
