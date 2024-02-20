package Ej2;

public class EmpleadosPorHoras extends Empleado{

    private double horasTrabajadas;


    public EmpleadosPorHoras(String nombre, int edad, double sueldo,double horasTrabajadas) {
        super(nombre, edad, sueldo);
        this.horasTrabajadas = horasTrabajadas;

    }

    @Override
    public double calcularSueldo() {
    return getSueldo() * horasTrabajadas;

    }
}
