package Ejercicio_4;

public class Circulo {
    protected double radio = 1.0;
    protected String color = "rojo";

    public Circulo(double radio, String color) {
        this.radio = radio;
        this.color = color;
    }

    public double calcularArea(){
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public String toString() {
        return "Ejercicio_4.Circulo{" +
                "radio=" + radio +
                ", color='" + color + '\'' +
                '}';
    }
}
