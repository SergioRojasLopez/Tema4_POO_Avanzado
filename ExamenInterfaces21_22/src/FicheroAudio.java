import java.time.LocalDateTime;

public class FicheroAudio extends FicheroBinario implements Reproducible{

    private int segundos;

    public FicheroAudio(String nombre, long tamano, LocalDateTime fechaCreacion, Byte[] arrayBytes) {
        super(nombre, tamano, fechaCreacion, arrayBytes);
    }

    @Override
    public String reproducir() {

       return "Reproducienco" + getNombre();

    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }
}
