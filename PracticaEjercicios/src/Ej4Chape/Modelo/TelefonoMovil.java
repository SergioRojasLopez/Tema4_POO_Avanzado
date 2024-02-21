package Ej4Chape.Modelo;

import Ej4Chape.Interfaces.IConexionInalambrica;
import Ej4Chape.Excepciones.ProductoElectronicoException;

public class TelefonoMovil extends ProductoElectronico implements IConexionInalambrica {

    private String sistemaOpe;


    public TelefonoMovil(String modelo, String marca, double precio, CategoriaProducto categoriaProducto,String sistemaOpe) throws ProductoElectronicoException {
        super(modelo, marca, precio, categoriaProducto);
        this.sistemaOpe = sistemaOpe;

    }

    public String getSistemaOpe() {
        return sistemaOpe;

    }

    @Override
    public void conectarWifi(TelefonoMovil movil) throws ProductoElectronicoException {
        IConexionInalambrica.super.conectarWifi(movil);
    }

    @Override
    public String toString() {
        return this.getModelo() + " con el sistema operativo " + sistemaOpe;
    }
}

