import java.time.LocalDateTime;

public abstract class Fichero {

    private String nombre;
    private long tamano;
    private LocalDateTime fechaCreacion;

    public Fichero(String nombre, long tamano, LocalDateTime fechaCreacion) {
        this.nombre = nombre;
        this.tamano = tamano;
        this.fechaCreacion = fechaCreacion;


    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getTamano() {
        return tamano;
    }

    public void setTamano(long tamano) {
        this.tamano = tamano;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
}
