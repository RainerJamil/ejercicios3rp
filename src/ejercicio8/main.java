package ejercicio8;

public class main {
    public static void main(String args[]) {
        Avion a1 = new Avion("Airbus",4);
        Avion a2;
        Avion a3 = new Avion("Boeing",4);
        a2 = a1;
        a1.imprimirFabricante();
        a2.imprimirFabricante();
        a1.setFabricante("Douglas");
        a1.imprimirFabricante();
        a2.imprimirFabricante();
        a1.cambiarFabricante(a2);
        a2.imprimirFabricante();
        System.out.println();
        Avion a4=new Avion("TOYOTA",5);
        Avion a5;
        a5=a4 ;
        System.out.println("avion A4");
        a4.imprimirFabricante();
        System.out.println("avion A5");
        a5.imprimirFabricante();
        System.out.println();
        System.out.println("cambio de fabricante al avion A5");
        a5.setFabricante("Stealth");
        a5.imprimirFabricante();
        System.out.println("avion A4");
        a4.imprimirFabricante();
        System.out.println("podemos decir que el cambio que hicimos en el avion A5 afecto al avion A4 ");
    }
}
