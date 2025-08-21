package Ejercicio_3;

import java.time.LocalDateTime;
import java.util.UUID;

public class Factura {
    protected UUID id;
    protected double montoTotal;
    protected LocalDateTime fecha;
    protected Cliente cliente;

    public Factura(double montoTotal, Cliente cliente) {
        this.id = UUID.randomUUID();
        this.montoTotal = montoTotal;
        this.fecha = LocalDateTime.now();
        this.cliente = cliente;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public double getMontoTotalDescuento(double descuento) {
        double aux = (descuento * montoTotal) / 100;
        return montoTotal - aux;
    }

    @Override
    public String toString() {
        return "Ejercicio_3.Factura{" +
                "id=" + id +
                ", montoTotal=" + montoTotal +
                ", fecha=" + fecha +
                ",\ncliente=" + cliente +
                '}';
    }
}
