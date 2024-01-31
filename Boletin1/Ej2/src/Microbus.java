public class Microbus extends Vehiculo {

    private static final double PRECIO_PLAZAS = 5;
    private int numPlazas;


    public Microbus(String matricula, Gama gama, int numPlazas) throws VehiculoException {
        super(matricula, gama);
        this.numPlazas = numPlazas;
        setNumPlazas(numPlazas);

    }

    public void setNumPlazas(int numPlazas) throws VehiculoException {
        this.numPlazas = numPlazas;

        if (numPlazas < 1){

            throw new VehiculoException("Numero de plazas incorrecto")
        }

        this.numPlazas = numPlazas;

    }
}
