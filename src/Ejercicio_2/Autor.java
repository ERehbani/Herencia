package Ejercicio_2;

public class Autor {
    protected String nombre;
    protected String apellido;
    protected String email;
    protected String genero;

    public Autor(String nombre, String apellido, String email, String genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.genero = genero;
    }


    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "|Ejercicio_2.Autor:" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", email='" + email + '\'' +
                ", genero='" + genero + '|';
    }
}
