import java.time.LocalDateTime;

public class FicheroAudio extends FicheroBinario implements Reproducible{

    private int segundos;

    public FicheroAudio(String nombre, long tamano, LocalDateTime fechaCreacion, Byte[] arrayBytes) {
        super(nombre, tamano, fechaCreacion, arrayBytes);
    }

    @Override
    public void reproducir() {

        System.out.println("Reproduciendo el audio" + getNombre());

    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }
}
