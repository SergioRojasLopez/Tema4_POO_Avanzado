package Ej4Chape.Modelo;

import Ej4Chape.Excepciones.ProductoElectronicoException;

public class Camara extends ProductoElectronico {

    private int resolucion;

    public Camara(String modelo, String marca, double precio, CategoriaProducto categoriaProducto,int resolucion) throws ProductoElectronicoException {
        super(modelo, marca, precio, categoriaProducto);
        setResolucion(resolucion);

    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion)throws ProductoElectronicoException {

        if (resolucion < 0){

           throw new ProductoElectronicoException("La resolucion no puede ser menor que 0");
        }
        this.resolucion = resolucion;
    }

    @Override
    public String toString() {
        return this.getModelo() + " con resolucion de " + resolucion;
    }
}
