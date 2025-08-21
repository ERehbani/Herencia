package Ejercicio_2;

public class Libro {
    protected String titulo;
    protected double precio;
    protected int stock;
    protected Autor autor;

    public Libro(String titulo, double precio, int stock, Autor autor) {
        this.titulo = titulo;
        this.precio = precio;
        this.stock = stock;
        this.autor = autor;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
        System.out.println("El nuevo precio es de: " + this.precio);
    }

    public void setStock(int stock) {
        this.stock = stock;
        System.out.println("El nuevo stock es de: " + this.stock);
    }

    public String getAutorName() {
        return autor.nombre;
    }

    @Override
    public String toString() {
        return "|Ejercicio_2.Libro: " +
                "titulo='" + titulo + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                ",\n AUTOR DEL LIBRO: autor=" + autor;
    }
}
