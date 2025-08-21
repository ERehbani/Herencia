package Ejercicio_4;

import java.text.DecimalFormat;

public class Cilindro extends Circulo{
    protected double altura = 1.0;
    protected double area;
    protected double volumen = Math.PI * Math.pow(radio, 2) * altura;
    DecimalFormat df = new DecimalFormat("#.##");



    public Cilindro(double radio, String color, double altura) {
        super(radio, color);
        this.altura = altura;
    }

     public double calcularArea(){
        double aux = 2 * volumen + 2 * (Math.PI * radio * altura);
        this.area = aux;
        return area;
    }

    public double calcularVolumen(){
        return volumen;
    }


    @Override
    public String toString() {
        return "Ejercicio_4.Cilindro{" +
                "radio=" + radio +
                ", volumen=" + df.format(volumen) +
                ", area=" + df.format(area) +
                ", altura=" + altura +
                '}';
    }
}
