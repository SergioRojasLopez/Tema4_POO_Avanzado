import java.time.LocalDateTime;

public class FicheroImagen extends FicheroBinario   {

    private String formato;

    public FicheroImagen(String nombre, long tamano, LocalDateTime fechaCreacion, Byte[] arrayBytes, String formato) {
        super(nombre, tamano, fechaCreacion, arrayBytes);
        this.formato = formato;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }
}
