import java.time.LocalDateTime;

public class FicheroEjecutable extends FicheroBinario implements Analizable{

    private int permisos;


    public FicheroEjecutable(String nombre, long tamano, LocalDateTime fechaCreacion, Byte[] arrayBytes, int permisos) {
        super(nombre, tamano, fechaCreacion, arrayBytes);
        this.permisos = permisos;
    }

    @Override
    public void analizar() {

    }
}
