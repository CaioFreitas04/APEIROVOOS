public class DBMain {

    public static void main(String args[]) {

        if(!DBTemplate.connectToBank()) {
            System.out.println("CONNECTION FAILED, CHECK ERROR LOG");
            return;
        }
        if(!DBTemplate.addToTeste(5, "Joana"))
            System.out.println("ERRO AO INSERIR!");
        DBTemplate.getTeste();

    }

}
