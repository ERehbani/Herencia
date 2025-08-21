package Ejercicio_1;

public class EmpleadoTiempoCompleto extends Empleado {

    public EmpleadoTiempoCompleto(String nombre, double salario) {
        super(nombre, salario);
    }

    public double calcularPago(){
        return this.salario;
    }
}
