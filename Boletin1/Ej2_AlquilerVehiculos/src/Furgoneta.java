public class Furgoneta extends Vehiculo{

    private static final double PRECIO_KILO = 0.5;
    private int pma;
    private double precioDiario;

    public Furgoneta(String matricula, Gama gama, int pma) throws VehiculoException {
        super(matricula, gama);
        this.pma = pma;
        //POSIBLE ERROR
        setPma(pma);

    }

    public void setPma(int pma) throws VehiculoException {

        if (pma < 1){
            throw new VehiculoException("PMA invalido");

        }
        this.pma = pma;


    }

    @Override
    public double getPrecioDiario() {
        return precioDiario;

    }
}
