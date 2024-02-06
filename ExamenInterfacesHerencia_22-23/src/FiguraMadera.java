public class FiguraMadera extends JugueteMadera implements IApilable  {

    private String color;
    private int numLados;

    public FiguraMadera(String nombre, String marca, String origenMadera, int añoTala,String color,int numLados) {
        super(nombre, marca, origenMadera, añoTala);
        this.color = color;
        this.numLados = numLados;
    }

    public String getColor() {
        return color;
    }

    public int getNumLados() {
        return numLados;
    }

    @Override
    public void apilar() {

    }


}
