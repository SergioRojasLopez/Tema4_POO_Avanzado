import EntradaSalida.Lectora;

import java.util.Scanner;

public class MenuVehiculo {

    private static final int MAX_VEHICULOS = 200;
    private static final Vehiculo[] listaVehiculos = new Vehiculo[MAX_VEHICULOS];



    public static void main(String[] args) {
        int opcion;
        Scanner sc = new Scanner(System.in);

        do {
            imprimirMenu();
            opcion = sc.nextInt();

            switch (opcion){

                case 1:
                    darAlta
                    break;

            }

        } while (opcion !=4);
    }

    public static void imprimirMenu (){

        System.out.println("Elige una opcion:");
        System.out.println("1. Alta de vehiculo");
        System.out.println("2. Calculo de precio de alquiler");
        System.out.println("3. Imprimir lista de vehiculos");
        System.out.println("4. Salir");
    }

    public static void darAltaVehiculo(){
        int seleccionUsuario;
        System.out.println("Estos son los vehiculos disponibles");
        int opcion = 0;

        for (TipoVehiculo tipoVehiculo : TipoVehiculo.values()){
            System.out.println(" "+ ++opcion + ". " + String.valueOf(tipoVehiculo).toLowerCase());

        }

        seleccionUsuario = Lectora.leerEnteroDeRango("Seleccion: ",TipoVehiculo.values().length,1);

        switch (seleccionUsuario){

            case 1:


                break;
            case 2:


                break;
            case 3:


                break;
        }

    }
}
