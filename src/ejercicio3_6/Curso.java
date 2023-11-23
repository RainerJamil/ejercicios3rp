package ejercicio3_6;

import java.util.ArrayList;
import java.util.Scanner;

public class Curso {
    ArrayList<Estudiante> estudiantes;

    public void consultaCurso() {
        estudiantes = new ArrayList<>();
    }

    public void anadirEstudiante(Estudiante estudiante) {
        for (Estudiante e : estudiantes) {
            if (e.codigo == e.codigo) {
                System.out.println("Error codigo ya existe");
                return;
            }
        }
        estudiantes.add(estudiante);
        System.out.println("Estudiante añadido correctamente"+estudiante);
    }

    public void buscarEstudiante(int codigo) {
        for (Estudiante e : estudiantes) {
            if (e.codigo == codigo) {
                System.out.println("Nombre: " + e.nombre);
                System.out.println("Apellidos: " + e.apellidos);
                System.out.println("Código: " + e.codigo);
                System.out.println("Semestre: " + e.semestre);
                System.out.println("Nota: " + e.nota);
                return;
            }
        }
        System.out.println("Estudiante no encontrado");
    }


    public void eliminarEstudiante(int codigo) {
        for (Estudiante e : estudiantes) {
            if (e.codigo == e.codigo) {
                System.out.println("Nombre: " + e.nombre);
                System.out.println("Apellidos: " + e.apellidos);
                System.out.println("Código: " + e.codigo);
                System.out.println("Semestre: " + e.semestre);
                System.out.println("Nota: " + e.nota);
                System.out.println("¿Desea eliminar al estudiante? (S/N)");
                Scanner sc = new Scanner(System.in);
                String res = sc.next();
                if (res.equalsIgnoreCase("S")) {
                    estudiantes.remove(e);
                    System.out.println("Estudiante eliminado");
                } else {
                    System.out.println("Estudiante no eliminado");
                }
                return;

            }
        }
        System.out.println("Estudiante no encontrado");
    }

    public double calcularPromedio() {
        double sumaNotas = 0;
        for (Estudiante e : estudiantes) {
            sumaNotas += e.nota;

        }

        return estudiantes.size() > 0 ? sumaNotas / estudiantes.size() : 0;
    }

    public int obtenerCantidadAprobados() {
        int cantidadAprobados = 0;
        for (Estudiante e : estudiantes) {
            if (e.nota >= 3.0) {
                cantidadAprobados++;
            }
        }

        return cantidadAprobados;
    }
    public double porcentajesAprobados(){
        int totalEstudiante= estudiantes.size();
        if (totalEstudiante<0){
            int aprobados=obtenerCantidadAprobados();
            return (double) aprobados/totalEstudiante*100;
        }else {
            return 0;
        }
    }
}
