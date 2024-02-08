public class Pessoa {
	
	private String nome;
	private String CPF;
	private String addr;
	private Data nasc;
	
	public String getNome() {
		return nome;
	}
	
	public String getCPF() {
		return CPF;
	}
	
	public String getAddr() {
		return addr;
	}
	
	public Data getNasc() {
		return nasc;
	}
	
	public void setNome(String input) {
		nome = input;
	}
	
	public boolean setCPF(String input) {
		//TODO: colocar sistema de validação de CPF;
		CPF = input;
		return true;
	}
	
	public void setAddr(String input) {
		addr = input;
	}
	
	public void setNasc(Data input) {
		nasc = input;
	}
	
}