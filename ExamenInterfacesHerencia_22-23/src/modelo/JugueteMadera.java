package modelo;

import excepciones.JugueteException;
import modelo.Juguete;

public abstract class JugueteMadera extends Juguete {

    private String origenMadera;
    private int annoTala;


    public JugueteMadera(String nombre, String marca,double precio, String origenMadera, int annoTala)throws JugueteException {
        super(nombre, marca,precio);
        this.origenMadera = origenMadera;
        this.annoTala = annoTala;
        setAnoTala(annoTala);
    }

    public String getOrigenMadera() {
        return origenMadera;
    }

    public int getAnoTala() {
        return annoTala;
    }

    public void setAnoTala(int annoTala) throws JugueteException{
        if (annoTala < 1){

            throw new JugueteException("Fecha incorrecta");
        }
        this.annoTala = annoTala;
    }
}
