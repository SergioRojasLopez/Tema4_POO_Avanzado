package Ej2;

public class Main {

    public static void main(String[] args) {

        EmpleadoAsalariado empleadoAsalariado = new EmpleadoAsalariado("Pepe",30,2000);
        EmpleadosPorHoras empleadosPorHoras = new EmpleadosPorHoras("Pablo",34,10,160);

        System.out.println("El empleado asalariado cobra un total de " + empleadoAsalariado.getSueldo());
        System.out.println("El empleado por horas cobra un total de " + empleadosPorHoras.calcularSueldo());
    }
}
