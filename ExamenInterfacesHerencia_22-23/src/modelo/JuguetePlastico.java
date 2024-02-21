package modelo;

import excepciones.JugueteException;

public abstract class JuguetePlastico extends Juguete{

    private TPlastico tipoPlastico;


    public JuguetePlastico(String nombre, String marca, double precio, TPlastico tipoPlastico ) throws JugueteException {
        super(nombre, marca, precio);
        this.tipoPlastico = tipoPlastico;

    }

    public TPlastico getTipoPlastico() {
        return tipoPlastico;
    }
}
