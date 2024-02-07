import java.time.LocalDateTime;

public class FicheroTextoPlano extends FicheroTexto implements Representable{


    public FicheroTextoPlano(String nombre, long tamano, LocalDateTime fechaCreacion) {
        super(nombre, tamano, fechaCreacion);

    }



    @Override
    public void convertir() {

    }

    @Override
    public void representar() {

    }
}
