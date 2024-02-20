package modelo;

import excepciones.JugueteException;
import interfaces.IApilable;

public class PiezaLego extends JuguetePlastico implements IApilable {

private int longitud;
private String color;

    public PiezaLego(String nombre, String marca, double precio, TPlastico PVC,int longitud,String color) throws JugueteException {
        super(nombre, marca, precio, TPlastico.ABS);
        setLongitud(longitud);
        this.color = color;

    }
    public String getColor() {
        return color;

    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud)throws JugueteException {

        if (longitud < 1){

            throw new JugueteException("Valor invalido");
        }
        this.longitud = longitud;
    }



    @Override
    public void apilar(Juguete juguete) throws JugueteException {
        IApilable.super.apilar(juguete);
        System.out.println("Se han apilado los juguetes " + juguete.getNombre() + " sobre el juguete " + this.getNombre() );
    }
}
