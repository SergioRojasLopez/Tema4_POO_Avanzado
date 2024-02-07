import java.time.LocalDateTime;

public class FicheroTextoPlano extends FicheroTexto implements Representable{


    public FicheroTextoPlano(String nombre, long tamano, LocalDateTime fechaCreacion, String[] parrafo) {
        super(nombre, tamano, fechaCreacion, parrafo);
    }

    @Override
    public void convertir() {

    }

    @Override
    public void representar() {

    }
}
