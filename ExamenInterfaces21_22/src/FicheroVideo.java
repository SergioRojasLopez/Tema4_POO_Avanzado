import java.time.LocalDateTime;

public class FicheroVideo extends FicheroBinario implements Reproducible{

    private int duracion;

    public FicheroVideo(String nombre, long tamano, LocalDateTime fechaCreacion, Byte[] arrayBytes, int duracion) {
        super(nombre, tamano, fechaCreacion, arrayBytes);
        this.duracion = duracion;
    }


    @Override
    public String reproducir() {
        return null;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
}
