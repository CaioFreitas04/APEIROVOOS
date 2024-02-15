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
		byte bytearray[] = {127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127};
		char untreatedcharray[] = input.toCharArray();
		int i, j, prod, rem;
		
		j = 0;
		for(i = 0; i < untreatedcharray.length; i++) {
			if(untreatedcharray[i] > 47 && (untreatedcharray[i] < 58)) {
				bytearray[j] = (byte) (untreatedcharray[i] - 48);
				j++;
			}
			//com isso, o bytearray[] segura todos os números do CPF, se este for válido;
		}
		
		if(j != 11)
			return false;
		
		//validação do CPF: primeiro dígito;
		prod = 0;
		for(i = 0; i < 9; i++) {
			prod += bytearray[i] * (10-i);
		}
		rem = prod % 11;
		if((rem < 2) && bytearray[9] != 0)
			return false;
		
		rem = 11 - rem;
		if(rem != bytearray[9])
			return false;
		
		//segundo dígito;
		prod = 0;
		for(i = 0; i < 10; i++) {
			prod += bytearray[i] * (11-i);
		}
		
		rem = prod % 11;
		if((rem < 2) && bytearray[10] != 0)
			return false;
		
		rem = 11 - rem;
		if(rem != bytearray[10])
			return false;
		
		return true;
	}
	
	public void setAddr(String input) {
		addr = input;
	}
	
	public void setNasc(Data input) {
		nasc = input;
	}
	
}
