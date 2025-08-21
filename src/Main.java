import Ejercicio_1.EmpleadoContratista;
import Ejercicio_1.EmpleadoPorHora;
import Ejercicio_1.EmpleadoTiempoCompleto;
import Ejercicio_2.Autor;
import Ejercicio_2.Libro;
import Ejercicio_3.Cliente;
import Ejercicio_3.Factura;
import Ejercicio_4.Cilindro;
import Ejercicio_4.Circulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un ejercicio");
        int num = scanner.nextInt();
        scanner.nextLine();

        switch (num) {
            case 1:
                System.out.println("Ingrese el nombre del empleado: ");
                String nombre = scanner.nextLine();
                System.out.println("Cuanto cobra " + nombre + "?");
                double salario = scanner.nextDouble();
                EmpleadoTiempoCompleto empleado = new EmpleadoTiempoCompleto(nombre, salario);
                System.out.println("El salario mensual de jorge es de: " + empleado.calcularPago());

                System.out.println("Supongamos que " + nombre + " ahora es freelancer");
                System.out.println("¿Cuantas horas trabajó?");
                double horas = scanner.nextDouble();
                EmpleadoPorHora freelancer = new EmpleadoPorHora(nombre, salario, horas);
                System.out.println("Ahora su salario fue de " + freelancer.calcularPago());

                System.out.println("Pero ahora se le da el tupe de cobrar tarifa...");
                System.out.println("¿Cual es la tarifa de " + nombre);
                double tarifa = scanner.nextDouble();
                EmpleadoContratista contratista = new EmpleadoContratista(nombre, salario, tarifa, horas);

                System.out.println("El salario de " + nombre + " ahora es de " + contratista.calcularPago() + " soles");
                break;
            case 2:
                Autor autor = new Autor("Joshua", "Bloch", "joshua @email.com", "M");
                System.out.println(autor.toString());

                Libro libro = new Libro("Effective Java", 450, 150, autor );
                System.out.println(libro.toString());

                System.out.println("Modificación del precio y stock");
                System.out.println("Nuevo precio: ");
                double precio = scanner.nextDouble();
                libro.setPrecio(precio);

                System.out.println("Nuevo stock: ");
                int stock = scanner.nextInt();
                libro.setStock(stock);

                System.out.println("EL libro luego de las modificaciones:   ");
                System.out.println(libro.toString());


                System.out.println("Nombre del autor invocado automaticamente desde LIBRO");
                System.out.println(libro.getAutorName());
                break;
            case 3:
                System.out.println("Ingrese el descuento a aplicar");
                double descuento = scanner.nextDouble();
                Cliente cliente = new Cliente("Pepe", "argento@gmail.com", descuento);
                Factura factura = new Factura(100, cliente);
                System.out.println(cliente.toString());
                System.out.println("Monto total: " + factura.getMontoTotal());
                System.out.println("Monto luego del descuento: " + factura.getMontoTotalDescuento(descuento));

                System.out.println("::::::::Ejercicio_3.Factura::::::::");
                System.out.println(factura.toString());

            case 4:
                System.out.println("::::: Ejercicio_4.Cilindro ::::::");
                Cilindro cilindro = new Cilindro(4, "verde", 10);
                cilindro.calcularArea();
                cilindro.calcularVolumen();
                System.out.println(cilindro.toString());

                System.out.println("::::: Ejercicio_4.Circulo ::::::");
                Circulo circulo = new Circulo(4, "rojo");
                System.out.println("Area del circulo: " + circulo.calcularArea());
        }
    }
}