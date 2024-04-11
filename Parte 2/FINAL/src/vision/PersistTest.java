package vision;
import java.util.ArrayList;

public class PersistTest {
    public static void main(String args[]) {
        ArrayList<Cliente> Clarr = new ArrayList<Cliente>();
	Clarr.add(new Cliente());
	Clarr.add(new Cliente("Carlos", "109.778.226-30", "Rua T", null, null, "carlos@email.com"));

	Persist.write(Clarr, "Cliente.dat");
	System.out.println("Arquivo escrito.");

	ArrayList<Cliente> retorno = (ArrayList<Cliente>) Persist.read("Cliente.dat");
	for(int i = 0; i < retorno.size(); i++) {
	    System.out.println(retorno.get(i).getNome() + " - " + retorno.get(i).getCPF());
	}
    }
}
