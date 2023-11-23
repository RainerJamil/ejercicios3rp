package ejercicio3_6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Tienda tienda = new Tienda("Tienda Cuantica", "Pepito Perez", 123456, 5);
        Computador comp1 = new Computador("Acer", 50, "Intel iCore 7", "Windows", 18500000);
        Computador comp2 = new Computador("Toshiba", 80, "Intel iCore 5", "Windows", 15500000);
        Computador comp3 = new Computador("Mac", 100, "Intel iCore 7", "Mac", 2500000);
        tienda.anadir(comp1);
        tienda.anadir(comp2);
        tienda.anadir(comp3);
        Scanner sc = new Scanner(System.in);
        String marca = sc.next();
        System.out.println("El computador a buscar: " + marca + " se encuentra en la posición: " + tienda.buscar(marca));
        tienda.imprimir();
        System.out.println("ESTUDIANTES");
        Scanner SC =new Scanner(System.in);
        Curso curso = new Curso();
        while (true){
            System.out.println("1. Añadir Estudiante");
            System.out.println("2. Buscar Estudiante");
            System.out.println("3. Eliminar Estudiante");
            System.out.println("4. Calcular el promedio");
            System.out.println("5. Obtener cantidad  y porcentaje de estudiantes");
            System.out.println("6. salir");
            System.out.println("Elija una opción");
            int op =SC.nextInt();

            switch (op){
                case 1:
                    System.out.println("Nombre del estudiante");
                    String nombre=SC.next();
                    System.out.println("Apellido del estudiante");
                    String apellidos=SC.next();
                    System.out.println("Codigo del estudiante");
                    int codigo=SC.nextInt();
                    System.out.println("Semestre del estudiante");
                    int semestre=SC.nextInt();
                    System.out.println("Nota final del estudiante");
                    double notaFinal = SC.nextDouble();
                    Estudiante nuevoEstudiante = new Estudiante(nombre,apellidos,codigo,semestre,notaFinal);
                    curso.anadirEstudiante(nuevoEstudiante);
                    break;
                case 2:
                    System.out.println("ingrese el codigo del estudiante: ");
                    int codigobus= SC.nextInt();
                    curso.buscarEstudiante(codigobus);
                    break;
                case 3:
                    System.out.println("ingrese el codigo para eliminar al estudiante");
                    int codigoeli =SC.nextInt();
                    curso.eliminarEstudiante(codigoeli);
                case 4:
                    double promedio= curso.calcularPromedio();
                    System.out.println("EL promedio es: "+promedio);
                    curso.calcularPromedio();
                case 5:
                    int cantidadAprobados=curso.obtenerCantidadAprobados();
                    double porcentajeAprobados=curso.porcentajesAprobados();
                    System.out.println("La cantidad de aprobados son: "+cantidadAprobados);
                    System.out.println("El porcentaje de aprobados son: "+porcentajeAprobados);
                case 6:
                    System.out.println("tenga un buen dia..!!");
                    System.exit(0);
                default:
                    System.out.println("Opcion no valida... seleccione una opcion valida...");
            }
        }
    }
}
