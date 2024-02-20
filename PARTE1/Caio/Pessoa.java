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
		
		//verificando se o CPF está no formato "###########" ou "###.###.###-##" usando regexes;
		if(!(input.matches("([0-9]{3}\\.){2}([0-9]{3}-[0-9]{2})") || input.matches("[0-9]{11}")))
			return false;



		j = 0;
		for(i = 0; i < untreatedcharray.length; i++) {
			if(untreatedcharray[i] > 47 && (untreatedcharray[i] < 58)) {
				bytearray[j] = (byte) (untreatedcharray[i] - 48);
				j++;
			}
			//com isso, o bytearray[] segura todos os números do CPF, se este for válido;
		}
		
		//testando se todos os dígitos são iguais (CPFs inválidos conhecidos);
		if(bytearray[0] == bytearray[1] && bytearray[1] == bytearray[2] && bytearray[2] == bytearray[3] && bytearray[3] == bytearray[4] && bytearray[4] == bytearray[5] && bytearray[5] == bytearray[6] && bytearray[6] == bytearray[7] && bytearray[7] == bytearray[8] && bytearray[8] == bytearray[9] && bytearray[9] == bytearray[10])
			return false;

		if(j != 11)
			return false;
		
		//validação do CPF: primeiro dígito;
		prod = 0;
		for(i = 0; i < 9; i++) {
			prod += bytearray[i] * (10-i);
		}
		
		rem = (prod * 10) % 11;
		if(rem == 10)
			rem = 0;
		
		if(rem != bytearray[9])
			return false;
		
		//segundo dígito;
		prod = 0;
		for(i = 0; i < 10; i++) {
			prod += bytearray[i] * (11-i);
		}

		rem = (prod * 10) % 11;
		if(rem == 10)
			rem = 0;
			
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
