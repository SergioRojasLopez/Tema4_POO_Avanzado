package Ej2;

public class EmpleadoAsalariado extends Empleado{
    public EmpleadoAsalariado(String nombre, int edad, double sueldo) {
        super(nombre, edad, sueldo);
    }

    @Override
    public double calcularSueldo() {
        return getSueldo();
    }
}
