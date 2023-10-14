package ejercicio3;

public class main {
    public static void main(String[] args){

        Automovil auto1 = new Automovil("Ford",2018,3, Automovil.tipoCom.DIESEL,Automovil.tipoA.EJECUTIVO,5,6,250, Automovil.tipoColor.NEGRO,true);
        auto1.imprimir();
        auto1.setVelocidadActual(100);
        System.out.println("Velocidad actual = "+ auto1.velocidadActual);
        auto1.acelerar(20);
        System.out.println("Velocidad actual = "+ auto1.velocidadActual);
        auto1.desacelerar(50);
        System.out.println("Velocidad actual = "+ auto1.velocidadActual);
        auto1.frena();
        System.out.println("Velocidad actual = "+ auto1.velocidadActual);
        auto1.desacelerar(20);
        auto1.tieneMultas();
        auto1.totalMultas();

        System.out.println();

        auto1.setVelocidadActual(100);
        System.out.println("Velocidad actual = "+ auto1.velocidadActual);
        auto1.acelerar(160);
        System.out.println("Velocidad actual = "+ auto1.velocidadActual);
        auto1.acelerar(40);
        System.out.println("Velocidad actual = "+ auto1.velocidadActual);
        auto1.desacelerar(50);
        System.out.println("Velocidad actual = "+ auto1.velocidadActual);
        auto1.tieneMultas();
        auto1.totalMultas();
    }
}
