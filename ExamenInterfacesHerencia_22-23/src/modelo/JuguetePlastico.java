package modelo;

import excepciones.JugueteException;

public abstract class JuguetePlastico extends Juguete{

    private TPlastico tPlastico;


    public JuguetePlastico(String nombre, String marca, double precio, TPlastico tPlastico) throws JugueteException {
        super(nombre, marca, precio);
    }


}
