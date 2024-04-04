import java.util.*

//essa classe serve de template para todos os DAOs. O resto será
//feito em uma hora mais oportuna;

public class DadosCliente {

    private ArrayList<Cliente> dataArray;

    
    public DadosCliente() {
        dataArray = new ArrayList<Cliente>;
    }

    public void add(Cliente c) {
        this.dataArray.add(c);
    }

    public Cliente search(String CPF) {
        Cliente c = null;

        for(Cliente s : this.dataArray) {
            if(s.getCPF().equals(CPF)) {
                c = s;
                break;
            }
        }

        return c
    }

    public boolean rem(String CPF) {
        Cliente c = this.search(CPF);
        
        if(f != null) {
            this.dataArray.remove(c);
            return true;
        }
        else {
            return false;
        }
    }

    public Cliente access(int num) {
        if(num >= 0 && num < this.dataArray.length())
            return this.dataArray.get(num);
        else
            return null;
    }
}
