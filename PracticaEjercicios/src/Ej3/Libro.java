package Ej3;

public class Libro implements IMaterialBibiliografico,IDescuento{

    private int numPag;

    public int getNumPag() {
        return numPag;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }

    public Libro(int numPag) {
        this.numPag = numPag;


    }

    @Override
    public void prestar() {

    }

    @Override
    public void devolver() {

    }

    @Override
    public void obtenerInformacion() {

    }

    @Override
    public void calcularDescuento() {


    }
}
