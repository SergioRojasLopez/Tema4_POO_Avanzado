package Ej1;

public class Main {
    public static void main(String[] args) {

        Circulo circulo = new Circulo(5);
        Rectangulo rectangulo = new Rectangulo(2,4);

        circulo.imprimirInformacion();
        rectangulo.imprimirInformacion();

        System.out.println("El area del circulo es de " + circulo.calcularArea());
        System.out.println("El area del rectangulo es de " + rectangulo.calcularArea());
    }
}
