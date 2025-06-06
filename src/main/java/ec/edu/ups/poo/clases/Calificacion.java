package ec.edu.ups.poo.clases;

public class Calificacion {
    private Asignaturas asignatura;
    private Estudiante estudiante;
    private double nota;

    public Calificacion(Asignaturas asignatura, Estudiante estudiante , double nota) {
        this.asignatura = asignatura;
        this.estudiante = estudiante;
        this.nota = nota;
    }

    // Getters y Setters
    public Asignaturas getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignaturas asignatura) {
        this.asignatura = asignatura;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Asignatura: " + asignatura.getNombre() + " | Nota: " + nota;
    }
}
