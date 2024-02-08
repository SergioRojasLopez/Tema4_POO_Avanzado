package modelo;

import excepciones.JugueteException;

public class PiezaLego extends JuguetePlastico{

private int longitud;
private String color;

    public PiezaLego(String nombre, String marca, double precio, TPlastico tPlastico,String color,int longitud) throws JugueteException {
        super(nombre, marca, precio, TPlastico.ABS);
        this.color=color;
        setLongitud(longitud);

    }

    public int setLongitud(int longitud)throws JugueteException {

        if (longitud < 1){

            throw new JugueteException("Valor invalido");
        }
        this.longitud = longitud;
        return longitud;
    }

    public String getColor() {
        return color;
    }
}
