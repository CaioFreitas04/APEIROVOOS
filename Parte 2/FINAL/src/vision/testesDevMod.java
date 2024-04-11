package vision;

import java.util.ArrayList;

public class testesDevMod {

	public static void main(String[] args) {
		

		Data hoje = new Data(10, 4, 2024);
		Data nas = new Data(15, 8, 2004);
		Cliente Diogo = new Cliente("Diogo", "12515385680", "minha casa", nas, hoje, "eu@gmail.com");
		Pessoa Desc = new Pessoa();
		Desc.setCPF("12515385680");
		ArrayList<Cliente> t = new ArrayList<Cliente>();
		t.add(Diogo);
		
		
		
		
		
		DadosClientes.add(Diogo);
		
		String olhaSo = new String();
		olhaSo = Diogo.getCPF();
		
		 
		if(DadosClientes.search(Desc.getCPF()) != null) System.out.println("Ok!");
	}
}
