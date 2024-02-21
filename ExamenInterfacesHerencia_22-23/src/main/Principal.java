package main;

import Utils.UserDataCollector;
import excepciones.JugueteException;
import interfaces.IApilable;
import modelo.*;


public class Principal {

    public static final int MAX_JUGUETES = 10;
    public static Juguete[] juguetes = new Juguete[MAX_JUGUETES];
    public static int numJuguetes = 0;

    public static void main(String[] args) {
        boolean salir = false;

        try {
            FiguraMadera j1 = new FiguraMadera("Cubo", "Cubemax", 5, "España", 2020, "Rojo", 6);
            FiguraMadera j2 = new FiguraMadera("Dodecaedro", "Cubemax", 10, "Camerún", 2022, "Amarillo", 12);
            InstrumentoMadera j3 = new InstrumentoMadera("Xilófono", "Matel", 10, "Brasil", 1999, 2);
            VehiculoPlastico j4 = new VehiculoPlastico("Ferrari F11", "Ferrari", 5, 4);
            VehiculoPlastico j5 = new VehiculoPlastico("Camión Pegaso", "Juguematic", 7, 8);
            PiezaLego j6 = new PiezaLego("Bloque de lego", "Lego", 5, 4, "Azul");
            PiezaLego j7 = new PiezaLego("Bloque de lego", "Lego", 3, 4, "Verde");

            addJuguete(j1);
            addJuguete(j2);
            addJuguete(j3);
            addJuguete(j4);
            addJuguete(j5);
            addJuguete(j6);
            addJuguete(j7);

        } catch (JugueteException e1) {


        }

        do {
            System.out.println(menu());
            int opcion = UserDataCollector.getEnteroMinMax("Selecciona una opción", 1, 7);

            switch (opcion) {
                case 1:
                    String nombre = UserDataCollector.getString("Introduce el nombre");
                    String marca = UserDataCollector.getString("Introduce la marca");
                    int precio = UserDataCollector.getEntero("Introduce el precio");
                    String origenMadera = UserDataCollector.getString("Introduce el origen de la madera");
                    int annoTala = UserDataCollector.getEntero("Introduce el año de tala de la madera");
                    String color = UserDataCollector.getString("Introduce el color de la figura");
                    int numLados = UserDataCollector.getEntero("Introduce el número de lados de la figura");

                    try {
                        FiguraMadera f = new FiguraMadera(nombre, marca, precio, origenMadera, annoTala, color, numLados);
                        addJuguete(f);
                    } catch (JugueteException e) {

                        System.out.println(e.getMessage());
                    }


                    break;

                case 2:
                    String nombre_c2 = UserDataCollector.getString("Introduce el nombre");
                    String marca_c2 = UserDataCollector.getString("Introduce la marca");
                    int precio_c2 = UserDataCollector.getEntero("Introduce el precio");
                    String origen_c2 = UserDataCollector.getString("Introduce el origen de la madera");
                    int anoTala_c2 = UserDataCollector.getEntero("Introduce el año de tala de la madera");
                    int edadMin_c2 = UserDataCollector.getEntero("Introduce la edad mínima");

                    try {

                        InstrumentoMadera im = new InstrumentoMadera(nombre_c2, marca_c2, precio_c2, origen_c2, anoTala_c2, edadMin_c2);
                        addJuguete(im);
                    } catch (JugueteException e) {

                        System.out.println(e.getMessage());
                    }

                    break;

                case 3:
                    String nombre_c3 = UserDataCollector.getString("Introduce el nombre");
                    String marca_c3 = UserDataCollector.getString("Introduce la marca");
                    int precio_c3 = UserDataCollector.getEntero("Introduce el precio");
                    int numRuedas_c3 = UserDataCollector.getEntero("Introduce el número de ruedas");

                    try {
                        VehiculoPlastico vp = new VehiculoPlastico(nombre_c3, marca_c3, precio_c3, numRuedas_c3);
                        addJuguete(vp);

                    } catch (JugueteException e) {

                        System.out.println(e.getMessage());
                    }


                    break;

                case 4:
                    String nombre_c4 = UserDataCollector.getString("Introduce el nombre");
                    String marca_c4 = UserDataCollector.getString("Introduce la marca");
                    int precio_c4 = UserDataCollector.getEntero("Introduce el precio");
                    int unidades_c4 = UserDataCollector.getEntero("Introduce la medida, en unidades");
                    String color_c4 = UserDataCollector.getString("Introduce el color");

                    try {
                        PiezaLego pl = new PiezaLego(nombre_c4, marca_c4, precio_c4, unidades_c4, color_c4);
                        addJuguete(pl);
                    } catch (JugueteException e) {

                        System.out.println(e.getMessage());
                    }

                    break;

                case 5:
                    mostrarJuguetes();
                    int opcion1_c5 = UserDataCollector.getEnteroMinMax("Selecciona un juguete", 1, numJuguetes);
                    Juguete j1_c5 = juguetes[opcion1_c5 - 1];

                    if (!(j1_c5 instanceof IApilable)) {
                        System.out.println("El juguete " + j1_c5.getNombre() + " no es apilable.");
                        continue;
                    }

                    System.out.println("Selecciona ahora el juguete que quieres apilar");
                    mostrarJuguetes();
                    int opcion2_c5 = UserDataCollector.getEnteroMinMax("Selecciona un juguete", 1, numJuguetes);
                    Juguete j2_c5 = juguetes[opcion2_c5 - 1];

                    try {
                        ((IApilable)j2_c5).apilar(j2_c5);

                    } catch (JugueteException e) {

                        System.out.println(e.getMessage());
                    }

                    break;

                case 6:
                    for (Juguete j : juguetes) {
                        if (j != null) {
                            System.out.println(j);
                        }
                    }
                    break;

                case 7:
                    salir = true;
            }
        } while (!salir);

        System.out.println("Adiós");

    }

    private static String menu() {
        StringBuilder sb = new StringBuilder("Menú\n");
        sb.append("1. Crear una figura de madera\n");
        sb.append("2. Crear un instrumento musical\n");
        sb.append("3. Crear un vehículo de plástico\n");
        sb.append("4. Crear una pieza de lego\n");
        sb.append("5. Apilar un juguete\n");
        sb.append("6. Mostrar todos los juguetes\n");
        sb.append("7. Salir\n");

        return sb.toString();
    }

    private static void mostrarJuguetes() {
        for (int i = 0; i < juguetes.length; i++) {
            if (juguetes[i] != null) {
                System.out.println((i + 1) + ": " + juguetes[i]);
            }
        }
    }

    private static void addJuguete(Juguete j) throws JugueteException {
        if (numJuguetes < juguetes.length) {
            juguetes[numJuguetes++] = j;
        } else {
            throw new JugueteException("Ya no caben más juguetes");
        }
    }


}



