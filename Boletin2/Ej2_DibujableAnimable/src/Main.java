public class Main {

    public static void main(String[] args) {

        Forma rectangulo = new Rectangulo();
        Forma circulo = new Circulo();
        Forma circuloMovible = new CirculoMovible();
        Forma linea = new Linea();

        Forma[] formas = {rectangulo,circuloMovible,circulo,linea};

        Canvas canvas = new Canvas();
        canvas.dibujaYAnimaFormas(formas);
    }

}
