public class Linea extends Forma{


    @Override
    void calcularArea() throws LineaException{

        throw new LineaException("Esta clase no sabe como representar el area");

    }
}
