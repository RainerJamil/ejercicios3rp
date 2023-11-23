package ejercicio3_7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Tienda tienda =new Tienda("Tienda Cuantica","Pepito Perez",123456);
        Computador comp1 =new Computador("Acer", 50, "Intel iCore 7", "Windows", 18500000);
        tienda.anadir(comp1);
        System.out.println(" ");
        Computador comp2 =new Computador("Toshiba", 80,"Intel iCore 5", "Windows", 15500000);
        tienda.anadir(comp2);
        System.out.println(" ");
        Computador comp3 =new Computador("Mac", 100,"Intel iCore 7", "Mac", 2500000);
        tienda.anadir(comp3);
        Scanner sc = new Scanner(System.in);
        String marca = sc.next();
        System.out.println("El computador a buscar: " + marca + " se encuentra en la posición "+ tienda.buscar(marca));
        tienda.imprimir();
    }
}
