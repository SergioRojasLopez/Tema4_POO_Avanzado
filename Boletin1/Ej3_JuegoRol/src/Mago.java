public class Mago extends Personaje {

    private static final int FUERZA_MAXIMA = 15;
    private static final int INTELIGENCIA_MINIMA = 17;
    private static final int DAÑO_HECHIZO = 10;
    private static final int HECHIZOS_MAXIMOS = 4;

    private String[] hechizos;


    public Mago(TipoRaza raza, String nombre, int fuerza, int inteligencia, int vidaMaxima) throws PersonajeException {
        super(raza, nombre, fuerza, inteligencia, vidaMaxima);
        hechizos = new String[HECHIZOS_MAXIMOS];

    }

    @Override
    public void setFuerza(int fuerza) throws PersonajeException {
        if (fuerza > FUERZA_MAXIMA){
            throw new PersonajeException("La fuerza del mago no puede exceder el limite maximo");
        }
        super.setFuerza(fuerza);
    }

    @Override
    public void setInteligencia(int inteligencia) throws PersonajeException {
        if (inteligencia < INTELIGENCIA_MINIMA){
            throw new PersonajeException("La inteligencia del mago no puede bajar del limite maximo ");
        }
        super.setInteligencia(inteligencia);
    }

    public void aprenderHechizo (String hechizo) throws PersonajeException {




    }
}
