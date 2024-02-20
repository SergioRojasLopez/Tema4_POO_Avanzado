package Ej1;

public class Rectangulo extends Figura{

    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;

    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public void imprimirInformacion() {
        System.out.println("La base y altura del rectangulo son " + base + " y " + " " + altura);
    }
}
