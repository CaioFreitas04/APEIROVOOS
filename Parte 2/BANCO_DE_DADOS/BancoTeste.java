import java.util.*;

public class BancoTeste {
    public static void main(String args[]) {
        Cliente c1 = new Cliente("Cleber", "10977822630", "Rua R", true, 13, "cleberdasilva@email.com");
        Cliente c2 = new Cliente("Joana", "12515385680", "Rua S", false, 7, "joanacunha@email.com");

        //conectando ao banco;
        BancoCliente.connectToBank();
        
        if(!writeCliente(c1))
            System.out.println("Algo de errado");
        if(!writeCliente(c2))
            System.out.println("naum estah certo!");

        ArrayList<Cliente> Clarr = fetchClientes();

        for(int i = 0; i < Clarr.size(); i++) {
            System.out.println(Clarr.get(i).getNome() + " - " + Clarr.get(i).getCPF());
        }
    }
}
