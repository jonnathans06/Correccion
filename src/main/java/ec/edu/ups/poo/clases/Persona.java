package ec.edu.ups.poo.clases;



public class Persona {
    private String nombre;
    private String apellido;

    // Constructores
    public Persona() {
    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    // toString
    @Override
    public String toString() {
        return "Estudiante [" + nombre + " " + apellido+ "]\n";
    }
}
