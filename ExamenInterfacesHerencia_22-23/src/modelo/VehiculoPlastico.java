package modelo;

import excepciones.JugueteException;

public class VehiculoPlastico extends JuguetePlastico{

    private int numRuedas;

    public VehiculoPlastico(String nombre, String marca, double precio, int numRuedas) throws JugueteException {
        super(nombre, marca, precio,TPlastico.PVC);
        setNumRuedas(numRuedas);

    }
    public int getNumRuedas() {
        return numRuedas;
    }

    public void setNumRuedas(int numRuedas) throws JugueteException{

        if (numRuedas > 4 || numRuedas < 1 ){

            throw new JugueteException("numero ineficiente de ruedas");
        }
        this.numRuedas = numRuedas;

    }


}
