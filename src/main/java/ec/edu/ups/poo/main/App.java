package ec.edu.ups.poo.main;

import ec.edu.ups.poo.clases.*;
import ec.edu.ups.poo.ventanas.Ventanas;


import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n-- OPCIONES --");
        System.out.println("1. Ventanas \n2. Calificaciones");
        System.out.print("Ingrese una opción: ");
        int opcion = sc.nextInt();

        switch (opcion) {
                    case 1:
                        Ventanas ventanas = new Ventanas();
                        break;
                    case 2:
                        System.out.println("\n-- Calificaciones --");
                        sc.nextLine();
                        Estudiante estudiante = new Estudiante();

                        System.out.print("Ingrese el nombre: "); estudiante.setNombre(sc.nextLine());
                        System.out.print("Ingrese el apellido: "); estudiante.setApellido(sc.nextLine());
                        System.out.print("Ingrese la carrera: "); estudiante.setCarrera(sc.nextLine());
                        System.out.println("-".repeat(20));

                        System.out.println("¿Cuántas asignaturas desea agregar? ");
                        System.out.print("Opcion: "); int n = sc.nextInt();
                        sc.nextLine();

                        for (int i = 0; i < n; i++) {
                            System.out.println("Asignatura " + (i + 1) + ":");
                            System.out.print("Materia: "); String nombreAsig = sc.nextLine();
                            System.out.print("Horas: "); int horas = sc.nextInt();
                            sc.nextLine();

                            Asignaturas asignatura = new Asignaturas(nombreAsig, horas);
                            estudiante.agregarAsignatura(asignatura);
                            System.out.println("-".repeat(20));

                            System.out.print("Nota para " + nombreAsig + ": ");
                            double nota = sc.nextDouble(); sc.nextLine();

                            Calificacion calificacion = new Calificacion(asignatura, estudiante, nota);
                            estudiante.agregarCalificacion(calificacion);
                            System.out.println("-".repeat(20));

                        }

                        System.out.println("-- Estudiante --");
                        System.out.println(estudiante);
                        break;
                    default:
                        System.out.println("Opción no válida");
                }
    }
}
