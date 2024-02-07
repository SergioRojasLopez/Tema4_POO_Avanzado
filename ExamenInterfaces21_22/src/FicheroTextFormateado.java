import java.time.LocalDateTime;

public class FicheroTextFormateado extends FicheroTexto implements Analizable{

    private String tipoFuente;
    private int tamFuente;
    private String colorFuente;

    public FicheroTextFormateado(String nombre, long tamano, LocalDateTime fechaCreacion, String[] parrafo,String tipoFuente,int tamFuente,String colorFuente) {
        super(nombre, tamano, fechaCreacion, parrafo);
        this.tipoFuente = tipoFuente;
        this.tamFuente = tamFuente;
        this.colorFuente = colorFuente;
    }

    public String getTipoFuente() {
        return tipoFuente;
    }

    public void setTipoFuente(String tipoFuente) {
        this.tipoFuente = tipoFuente;
    }

    public int getTamFuente() {
        return tamFuente;
    }

    public void setTamFuente(int tamFuente) {
        this.tamFuente = tamFuente;
    }

    public String getColorFuente() {
        return colorFuente;
    }

    public void setColorFuente(String colorFuente) {
        this.colorFuente = colorFuente;
    }

    @Override
    public void analizar() {

    }

    @Override
    public void convertir() {

    }
}
