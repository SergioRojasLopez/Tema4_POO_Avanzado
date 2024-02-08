import java.time.LocalDateTime;

public abstract class FicheroTexto extends Fichero implements Coversor{

    private String [] parrafo;

    public FicheroTexto(String nombre, long tamano, LocalDateTime fechaCreacion,String[]parrafo) {
        super(nombre, tamano, fechaCreacion);
        this.parrafo = parrafo;
    }


}
