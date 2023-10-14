package ejercicio2;

public class main {
    public static void main(String[] args) {
        Planeta p1 = new Planeta("Tierra", 1, 9763E24, 1.08321E12, 12742, 150000000, Planeta.tipoPlaneta.TERRESTRE, true,1,1);
        p1.imprimir();
        System.out.println("Densidad del planeta = "+p1.calcularDensidad());
        System.out.println("Es planta exterior = "+p1.esPlanetaExterior());
        System.out.println();
        Planeta p2 = new Planeta("Júpiter",79,1.899E27,1.4313E15,139820,750000000, Planeta.tipoPlaneta.GASEOSO,true,12,0.47);
        p2.imprimir();
        System.out.println("Densidad del planeta = "+p2.calcularDensidad());
        System.out.println("Es planeta exterior = "+p2.esPlanetaExterior());
    }
}