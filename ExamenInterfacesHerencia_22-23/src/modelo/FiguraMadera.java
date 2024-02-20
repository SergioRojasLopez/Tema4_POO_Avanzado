package modelo;

import excepciones.JugueteException;
import interfaces.IApilable;


public class FiguraMadera extends JugueteMadera implements IApilable  {

    private String color;
    private int numLados;

    public FiguraMadera(String nombre, String marca, double precio, String origenMadera, int annoTala,String color,int numLados) throws JugueteException {
        super(nombre, marca, precio, origenMadera, annoTala);
        this.color = color;
        setNumLados(numLados);

    }


    public void setNumLados(int numLados) throws JugueteException{

        if (numLados < 2){
            throw new JugueteException("El numero de lados es bajo");

        }
        this.numLados = numLados;
    }

    @Override
    public void apilar( Juguete juguete) throws JugueteException {
        IApilable.super.apilar(juguete);

        System.out.println("Se han apilado los juguetes " + juguete.getNombre()+ " sobre el juguete " + this.getNombre());
    }
}



