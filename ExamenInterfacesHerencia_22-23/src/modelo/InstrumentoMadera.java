package modelo;

import excepciones.JugueteException;


public class InstrumentoMadera extends JugueteMadera {

    private int edadMinima;
    public static final int EDAD_MINIMA_PERMITIDA = 1;

    public InstrumentoMadera(String nombre, String marca, double precio, String origenMadera, int annoTala,int edadMinima) throws JugueteException {
        super(nombre, marca, precio, origenMadera, annoTala);
        setEdadMinima(edadMinima);
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(int edadMinima) throws JugueteException{
        if (edadMinima < EDAD_MINIMA_PERMITIDA){
            throw new JugueteException("La edad minima deber ser 1");

        }
        this.edadMinima = edadMinima;
    }

    @Override
    public String toString() {
        return " Instrumento de madera [nombre: " + getNombre() + ", marca: " + getMarca() + ", precio: " + getPrecio()+ ", origen madera: "
                + getOrigenMadera() + ", año de tala: " + getAnoTala() + ", edad minima: " + edadMinima;
    }
}
