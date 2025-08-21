package Ejercicio_1;

public class EmpleadoContratista extends EmpleadoPorHora{
    protected double tarifa;

    public EmpleadoContratista(String nombre, double salario, double tarifa, double horas) {
        super(nombre, salario, horas);
        this.tarifa = tarifa;
    }

    public double calcularPago(){
        return (salario * horas) + tarifa;
    }
}
