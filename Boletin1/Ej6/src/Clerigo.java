public class Clerigo extends Personaje {

    public static final int FUERZA_MINIMA = 18;
    public static final int INTELIGENCIA_MINIMA = 12;
    public static final int INTELIGENCIA_MAXIMA = 16;
    public static final int CURAR_VIDA = 10;

    private final String dios;


    public Clerigo(TipoRaza raza, String nombre, int fuerza, int inteligencia, int vidaMaxima, String dios) throws PersonajeException {
        super(raza, nombre, fuerza, inteligencia, vidaMaxima);
        this.dios = dios;
    }

    public String getDios() {
        return dios;
    }

    public void curar (Personaje personaje) throws PersonajeException {

        if (this == personaje) {
            throw new RuntimeException("No puedes curarte a ti mismo");
        }
        if (personaje.getVidaActual() == 0){
            throw new RuntimeException("Esta muerto, no se puede curar un muerto");
        }

        personaje.setVidaActual(personaje.getVidaActual()+CURAR_VIDA);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Clerigo{");
        sb.append("dios='").append(dios).append('\'');
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
