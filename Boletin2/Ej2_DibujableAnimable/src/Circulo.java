public class Circulo extends Forma implements Dibujable{
    @Override
    public void dibujar() {

        System.out.println("Dibujando circulo");

    }

    @Override
    void calcularArea() throws LineaException {

        System.out.println("Calculando area del circulo");

    }
}
