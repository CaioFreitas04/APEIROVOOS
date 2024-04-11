import java.io.*;

public class Persist {
    
    public static boolean write(Object input, String file) {
        try {
            //abrindo arquivo;
            FileOutputStream filePointer = new FileOutputStream(file);
            ObjectOutputStream objPointer = new ObjectOutputStream(filePointer);

            //gravando;
            objPointer.writeObject(input);
            objPointer.flush();
            objPointer.close();

            filePointer.flush();
            filePointer.close();

            return true;
        }
        catch(Exception e) {
            return false;
        }
    }

    public static Object read(String file) {
        //instanciando objetos de leitura;
        Object out = null;
        FileInputStream filePointer = null;
        ObjectInputStream objPointer = null;

        try {
            //abrindo arquivo e preparando para leitura;
            filePointer = new FileInputStream(file);
            objPointer = new ObjectInputStream(filePointer);

            //leitura e fechamento;
            out = objPointer.readObject();
            objPointer.close();
            filePointer.close();
        }
        catch(Exception e) {
            return null;
        }

        return out;
    }
}
