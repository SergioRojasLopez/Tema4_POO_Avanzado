import java.util.Arrays;

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
        boolean encontrado = false;
        int posicionVacia = -1;

        for (int i = 0; i < hechizos.length && !encontrado; i++) {
            if (hechizo.equals(hechizos[i])) {
                encontrado = true;
            }

            if (hechizos[i] == null && posicionVacia == -1) {
                posicionVacia = i;
            }
        }

        if (encontrado) {
            throw new PersonajeException("El mago no puede aprender dos veces el mismo hechizo.");
        }

        if (posicionVacia == -1) {
            throw new PersonajeException("El mago no tiene mas slots para aprender un hechizo nuevo.");
        }

        hechizos[posicionVacia] = hechizo;


    }
    public void lanzarHechizo (String hechizo, Personaje personaje) throws PersonajeException{


        int posHechizo = -1;

        for(int i = 0; i < hechizo.length() && posHechizo == -1; i++){

            if (hechizo.equals(hechizos[i])) {
                posHechizo = i;
            }

            if (posHechizo == -1) {
                throw new PersonajeException("El mago no conoce el hechizo");
            }

            if (this == personaje) {
                throw new PersonajeException("No puedes lanzar un hechizo a tu mismo personaje");
            }

            if (personaje.getVidaActual() == 0) {
                throw new PersonajeException("El personaje al que quieres atacar esta muerto");
            }


            personaje.setVidaActual(personaje.getVidaActual()-DAÑO_HECHIZO);
            hechizos[posHechizo] = null;

        }


    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Mago{");
        sb.append("hechizos=").append(Arrays.toString(hechizos));
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
