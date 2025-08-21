package Ejercicio_3;

import java.util.UUID;

public class Cliente {
    protected UUID id;
    protected String nombre;
    protected String email;
    protected double porcentajeDescuento;

    public Cliente(String nombre, String email, double porcentajeDescuento) {
        this.id = UUID.randomUUID();
        this.nombre = nombre;
        this.email = email;
        this.porcentajeDescuento = porcentajeDescuento;
    }

    @Override
    public String toString() {
        return "Ejercicio_3.Cliente{" +
                "nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", porcentajeDescuento=" + porcentajeDescuento +
                '}';
    }
}
