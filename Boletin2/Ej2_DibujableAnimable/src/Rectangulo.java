public class Rectangulo extends Forma implements Dibujable  {


    @Override
    public void dibujar() {

        System.out.println("Dibujando rectangulo");

    }

    @Override
    void calcularArea() {

        System.out.println("Calculando area del rectangulo");

    }

}
