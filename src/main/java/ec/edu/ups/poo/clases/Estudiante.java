package ec.edu.ups.poo.clases;

import java.util.ArrayList;
import java.util.List;

public class Estudiante extends Persona {
    private String carrera;
    private List<Asignaturas> listaAsignaturas;
    private List<Calificacion> listaCalificaciones;

    public Estudiante() {
        super();
        this.listaAsignaturas = new ArrayList<>();
        this.listaCalificaciones = new ArrayList<>();
    }

    public Estudiante(String nombre, String apellido, String carrera) {
        super(nombre, apellido);
        this.carrera = carrera;
        this.listaAsignaturas = new ArrayList<>();
        this.listaCalificaciones = new ArrayList<>();
    }

    // Getters y setters
    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public List<Asignaturas> getListaAsignaturas() {
        return listaAsignaturas;
    }

    public void setListaAsignaturas(List<Asignaturas> listaAsignaturas) {
        this.listaAsignaturas = listaAsignaturas;
    }

    public List<Calificacion> getListaCalificaciones() {
        return listaCalificaciones;
    }

    public void setListaCalificaciones(List<Calificacion> listaCalificaciones) {
        this.listaCalificaciones = listaCalificaciones;
    }

    // Métodos
    public void agregarAsignatura(Asignaturas asignatura) {
        listaAsignaturas.add(asignatura);
    }

    public void agregarCalificacion(Calificacion calificacion) {
        listaCalificaciones.add(calificacion);
    }

    // toString
    @Override
    public String toString() {
        return super.toString() +
                "Carrera: " + carrera + "\n" +
                "Asignaturas: " + listaAsignaturas + "\n" +
                "Calificaciones: " + listaCalificaciones + "\n";
    }
}
