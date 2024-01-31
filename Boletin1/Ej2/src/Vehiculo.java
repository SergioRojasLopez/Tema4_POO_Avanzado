public class Vehiculo {

    private String matricula;
    private Gama gama;
    private double alquiler;

    public Vehiculo(String matricula, Gama gama) {

        this.matricula = matricula;
        this.gama = gama;
    }

    public String getMatricula() {
        return matricula;
    }

    public Gama getGama() {
        return gama;
    }
}
