package Ej4Chape.Main;

import Ej4Chape.Modelo.*;
import Ej4Chape.Excepciones.ProductoElectronicoException;
import Ej4Chape.Utils.UserDataCollector;


public class Main {

    public static final int NUMERO_MAX_APARATOS = 10;
    private static ProductoElectronico[] aparatos = new ProductoElectronico[NUMERO_MAX_APARATOS];
    private static int numAparatos = 0;

    public static void main(String[] args) {
        boolean salir = false;


        try {
            TelefonoMovil movil = new TelefonoMovil("firephone", "apple", 500, CategoriaProducto.TELEFONO, "iOS");
            TelefonoMovil movil1 = new TelefonoMovil("Samsung", "S24", 800, CategoriaProducto.TELEFONO, "Android");
            Laptop laptop = new Laptop("OnePlus", "Lenovo", 600, CategoriaProducto.LAPTOD, 1000);
            Camara camara = new Camara("N200", "Nicon", 1000, CategoriaProducto.CAMARA, 8000000);

            addAparato(movil);
            addAparato(movil1);
            addAparato(laptop);
            addAparato(camara);

        } catch (ProductoElectronicoException e) {


        }

        do {
            System.out.println(menu());
            int opcion = UserDataCollector.getEnteroMinMax("Selecciona una opción", 1, 7);

            switch (opcion) {
                case 1:
                    String modelo = UserDataCollector.getString("Introduce el nombre");
                    String marca = UserDataCollector.getString("Introduce la marca");
                    int precio = UserDataCollector.getEntero("Introduce el precio");
                    String sistemaOpe = UserDataCollector.getString("Introduce el sistema operativo");

                    try {
                        TelefonoMovil m = new TelefonoMovil(modelo, marca, precio, CategoriaProducto.TELEFONO, sistemaOpe);
                        addAparato(m);
                    } catch (ProductoElectronicoException e) {

                        System.out.println(e.getMessage());
                    }

                    System.out.println("Telefono añadido con exito");


                    break;

                case 2:

                    String modelo_c2 = UserDataCollector.getString("Introduce el nombre");
                    String marca_c2 = UserDataCollector.getString("Introduce la marca");
                    int precio_c2 = UserDataCollector.getEntero("Introduce el precio");
                    int almacenamiento = UserDataCollector.getEntero("Introduce el almacenamiento");

                    try {
                        Laptop l = new Laptop(modelo_c2, marca_c2, precio_c2, CategoriaProducto.LAPTOD, almacenamiento);
                        addAparato(l);
                    } catch (ProductoElectronicoException e) {

                        System.out.println(e.getMessage());
                    }

                    System.out.println("Laptop añadido con exito");

                    break;

                case 3:
                    String modelo_c3 = UserDataCollector.getString("Introduce el nombre");
                    String marca_c3 = UserDataCollector.getString("Introduce la marca");
                    int precio_c3 = UserDataCollector.getEntero("Introduce el precio");
                    int resolucion = UserDataCollector.getEntero("Introduce el almacenamiento");

                    try {
                        Camara l = new Camara(modelo_c3, marca_c3, precio_c3, CategoriaProducto.LAPTOD, resolucion);
                        addAparato(l);
                    } catch (ProductoElectronicoException e) {

                        System.out.println(e.getMessage());
                    }

                    System.out.println("Camara añadida con exito");

                    break;

                case 4:
                    for (ProductoElectronico a : aparatos) {
                        if (a != null) {
                            System.out.println(a);
                        }
                    }
                    break;

                case 5:
                    salir = true;

            }
        } while (!salir);

        System.out.println("Adios");
    }

    private static void addAparato(ProductoElectronico a) throws ProductoElectronicoException {
        if (numAparatos < aparatos.length) {
            aparatos[numAparatos++] = a;
        } else {
            throw new ProductoElectronicoException("Ya no caben más juguetes");
        }
    }

    private static String menu() {
        StringBuilder sb = new StringBuilder("Menú\n");
        sb.append("1. Almacenar telefono\n");
        sb.append("2. Almacenar laptop\n");
        sb.append("3. Almacenar camara\n");
        sb.append("4. Mostrar todos los aparatos\n");
        sb.append("5. Salir\n");

        return sb.toString();
    }
    private static void mostrarAparatos() {
        for (int i = 0; i < aparatos.length; i++) {
            if (aparatos[i] != null) {
                System.out.println((i+1) + ": " + aparatos[i]);
            }
        }
    }
}

