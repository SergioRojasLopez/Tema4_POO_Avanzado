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

    public void setPrecio(double precio) throws JugueteException {


        if (precio < 1){

            throw new JugueteException("El precio ndebe ser postivo");
        }
        this.precio = precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
