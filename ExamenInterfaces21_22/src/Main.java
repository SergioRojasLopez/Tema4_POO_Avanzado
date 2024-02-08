import java.util.Random;

public class Main {

    public static void main(String[] args) {


    }


    public static byte[] generarArrayBytesRandom(int tamano){

        Random r = new Random();

        byte[] arrayDatos = new byte[tamano];

        r.nextBytes(arrayDatos);

        return arrayDatos;
    }




}
