package modelo;

import excepciones.JugueteException;

public abstract class Juguete {

    private String nombre;
    private String marca;
    private double precio;

    public Juguete(String nombre, String marca,double precio) throws JugueteException {
        this.nombre = nombre;
        this.marca = marca;
        setPrecio(precio);

    }

    public String getNombre() {
        return nombre;
    }

    public String getMarca() {
        return marca;
    }

    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) throws JugueteException {

        if (precio < 1){

            throw new JugueteException("El precio debe ser postivo");
        }
        this.precio = precio;
    }
}
