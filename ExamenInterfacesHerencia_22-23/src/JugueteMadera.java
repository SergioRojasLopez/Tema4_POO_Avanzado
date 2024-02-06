public class JugueteMadera extends Juguete {

    private String origenMadera;
    private int añoTala;


    public JugueteMadera(String nombre, String marca, String origenMadera, int añoTala) {
        super(nombre, marca);
        this.origenMadera = origenMadera;
        this.añoTala = añoTala;
    }

    public String getOrigenMadera() {
        return origenMadera;
    }

    public int getAñoTala() {
        return añoTala;
    }
}
