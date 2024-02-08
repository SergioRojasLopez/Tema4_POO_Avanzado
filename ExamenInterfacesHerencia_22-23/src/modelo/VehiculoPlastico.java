package modelo;

import excepciones.JugueteException;

public class VehiculoPlastico extends JuguetePlastico{

    private int numRuedas;

    public VehiculoPlastico(String nombre, String marca, double precio, int numRuedas) throws JugueteException {
        super(nombre, marca, precio,TPlastico.PVC);
        this.numRuedas = numRuedas;
    }

    public int getNumRuedas() {
        return numRuedas;
    }

    public void setNumRuedas(int numRuedas) throws JugueteException{

        if (numRuedas > 4 ){

            throw new JugueteException("Necesitas mas ruedas");
        }
        this.numRuedas = numRuedas;
    }
}
