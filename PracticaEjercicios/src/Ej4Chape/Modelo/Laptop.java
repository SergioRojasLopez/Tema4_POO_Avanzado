package Ej4Chape.Modelo;

import Ej4Chape.Excepciones.ProductoElectronicoException;

public class Laptop extends ProductoElectronico {

    private int almacenamiento;


    public Laptop(String modelo, String marca, double precio, CategoriaProducto categoriaProducto,int almacenamiento) throws ProductoElectronicoException {
        super(modelo, marca, precio, categoriaProducto);
        this.almacenamiento = almacenamiento;

    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) throws ProductoElectronicoException {

        if (almacenamiento < 0){

            throw new ProductoElectronicoException("El almacenamiento no puede ser menor a 0");
        }
        this.almacenamiento = almacenamiento;
    }

    @Override
    public String toString() {
        return this.getModelo() + " de " + almacenamiento + " GB de almacenamiento";
    }
}
