package Ejercicio_1;

public class EmpleadoPorHora extends Empleado {
    protected double horas;

    public EmpleadoPorHora(String nombre, double salario, double horas) {
        super(nombre, salario);
        this.horas = horas;
    }

    public double calcularPago(){
        return salario * horas;
    }
}
