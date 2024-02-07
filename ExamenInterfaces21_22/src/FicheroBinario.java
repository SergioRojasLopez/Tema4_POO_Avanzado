import java.time.LocalDateTime;

public class FicheroBinario extends Fichero{

    private Byte[] arrayBytes;

    public FicheroBinario(String nombre, long tamano, LocalDateTime fechaCreacion) {
        super(nombre, tamano, fechaCreacion);

    }
}
