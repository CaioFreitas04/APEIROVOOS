import java.util.*

//essa classe serve de template para todos os DAOs. O resto será
//feito em uma hora mais oportuna;


//NOTA! TODOS OS DAOs SERÃO REESCRITOS POSTERIORMENTE PARA A INTEGRAÇÃO
//COM O BANCO DE DADOS!

public class DadosCliente {

    private static ArrayList<Cliente> dataArray;

    public static void add(Cliente c) {
    	dataArray.add(c);
    }

    public static Cliente search(String CPF) {
        Cliente c = null;

        for(Cliente s : dataArray) {
            if(s.getCPF().equals(CPF)) {
                c = s;
                break;
            }
        }

        return c;
    }

    public static boolean rem(String CPF) {
        Cliente c = search(CPF);
        
        if(f != null) {
            dataArray.remove(c);
            return true;
        }
        else {
            return false;
        }
    }

    public static ArrayList<Cliente> getArray() {
    	return dataArray;
    }

    public static void commit() {
    	return;
    } //TODO: função que coloca dados no banco;

    public static boolean pull() {
    	return false;
    } //TODO: função que puxa dados no banco;

}
