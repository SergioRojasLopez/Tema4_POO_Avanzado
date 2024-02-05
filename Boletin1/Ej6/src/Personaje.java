public class Personaje {

    public static final int FUERZA_MAXIMA = 20;
    public static final int FUERZA_MINIMA = 0;

    public static final int INTELIGENCIA_MAXIMA = 20;
    public static final int INTELIGENCIA_MINIMA = 0;

    public static final int VIDA_MAXIMA = 100;
    public static final int VIDA_MINIMA = 0;


    private TipoRaza raza;
    private String nombre;
    private int fuerza;
    private int inteligencia;
    private int vidaMaxima;
    private int vidaActual;

    public Personaje(TipoRaza raza, String nombre, int fuerza, int inteligencia, int vidaMaxima) throws PersonajeException {
        this.raza = raza;
        this.nombre = nombre;
        this.fuerza = fuerza;
        this.inteligencia = inteligencia;
        this.vidaMaxima = vidaMaxima;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) throws PersonajeException {
        if (fuerza < FUERZA_MINIMA || fuerza > FUERZA_MAXIMA) {
            throw new PersonajeException("La fuerza tiene que estar comprendida entre 0 y 20");
        }
        this.fuerza = fuerza;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) throws PersonajeException {
        if (inteligencia < INTELIGENCIA_MINIMA || inteligencia > INTELIGENCIA_MAXIMA) {
            throw new PersonajeException("La inteligencia tiene que estar comprendida entre 0 y 20");
        }
        this.inteligencia = inteligencia;
    }

    public int getVidaMaxima() {
        return vidaMaxima;
    }

    public void setVidaMaxima(int vidaMaxima) throws PersonajeException {
        if (vidaMaxima < VIDA_MINIMA || vidaMaxima > VIDA_MAXIMA) {
            throw new PersonajeException("La vida tiene que estar comprendida entre 0 y 100");
        }
        this.vidaMaxima = vidaMaxima;
    }

    public int getVidaActual() throws PersonajeException {
        return vidaActual;
    }

    public void setVidaActual(int vidaActual) {
        if (vidaActual < VIDA_MINIMA) {
            this.vidaActual = VIDA_MAXIMA;

        } else if (vidaActual > vidaMaxima) {
            this.vidaActual = vidaMaxima;

        } else
            this.vidaActual = vidaActual;
    }

    @Override
    public String toString() {
        return "Personaje{" +
                "raza=" + raza +
                ", nombre='" + nombre + '\'' +
                ", fuerza=" + fuerza +
                ", inteligencia=" + inteligencia +
                ", vidaMaxima=" + vidaMaxima +
                ", vidaActual=" + vidaActual +
                '}';
    }
}
