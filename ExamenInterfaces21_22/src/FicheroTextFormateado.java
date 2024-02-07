import java.time.LocalDateTime;

public class FicheroTextFormateado extends FicheroTexto implements Representable{

    private String tipoFuente;
    private int tamFuente;
    private String colorFuente;

    public FicheroTextFormateado(String nombre, long tamano, LocalDateTime fechaCreacion) {
        super(nombre, tamano, fechaCreacion);
    }

    @Override
    public void convertir() {

    }

    @Override
    public void representar() {

    }
}
