package Ej4Chape.Interfaces;

import Ej4Chape.Excepciones.ProductoElectronicoException;
import Ej4Chape.Modelo.TelefonoMovil;

public interface IConexionInalambrica {

    default void conectarWifi(TelefonoMovil movil) throws ProductoElectronicoException {

        if (movil == null){

            throw new ProductoElectronicoException("El telefono movil no tiene conexion wifi");

        }

    }
}
