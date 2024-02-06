public class InstrumentoMadera extends JugueteMadera  {

    private int edadMinima;

    public InstrumentoMadera(String nombre, String marca, String origenMadera, int añoTala) {
        super(nombre, marca, origenMadera, añoTala);
    }

    public int getEdadMinima() {
        return edadMinima;
    }
}
