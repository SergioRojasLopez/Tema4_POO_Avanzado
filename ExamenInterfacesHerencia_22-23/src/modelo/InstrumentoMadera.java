package modelo;

import excepciones.JugueteException;
import modelo.JugueteMadera;

public class InstrumentoMadera extends JugueteMadera {

    private int edadMinima;

    public InstrumentoMadera(String nombre, String marca, double precio, String origenMadera, int annoTala) throws JugueteException {
        super(nombre, marca, precio, origenMadera, annoTala);
        setEdadMinima(edadMinima);
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(int edadMinima) throws JugueteException{
        if (edadMinima < 1){
            throw new JugueteException("La edad minima deber ser 1");

        }
        this.edadMinima = edadMinima;
    }
}
