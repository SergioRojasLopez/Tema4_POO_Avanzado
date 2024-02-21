package Ej4Chape.Modelo;

import Ej4Chape.Excepciones.ProductoElectronicoException;

public abstract class ProductoElectronico {

    private String modelo;
    private String marca;
    private double precio;
    private CategoriaProducto categoriaProducto;

    public ProductoElectronico(String modelo, String marca, double precio,CategoriaProducto categoriaProducto) throws ProductoElectronicoException {
        this.modelo = modelo;
        this.marca = marca;
        setPrecio(precio);
        this.categoriaProducto = categoriaProducto;

    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public double getPrecio() {
        return precio;
    }

    public CategoriaProducto getcategoriaProducto(){

        return categoriaProducto;
    }

    public void setPrecio(double precio)throws ProductoElectronicoException {

        if (precio < 0 ) {

            throw new ProductoElectronicoException("El precio tiene que ser mayor que 0");

        }

        this.precio = precio;

    }
}
