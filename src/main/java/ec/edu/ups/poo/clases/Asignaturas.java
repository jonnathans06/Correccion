package ec.edu.ups.poo.clases;

public class Asignaturas {
    private String nombre;
    private int nHoras;

    // Constructores
    public Asignaturas(String nombre, int nHoras) {
        this.nombre = nombre;
        this.nHoras = nHoras;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre)       {
        this.nombre = nombre;
    }

    public int getnHoras() {
        return nHoras;
    }
    public void setnHoras(int nHoras) {
        this.nHoras = nHoras;
    }

    // toString
    @Override
    public String toString() {
        return "Materia: " + nombre + " | Horas: " + nHoras;
    }
}
