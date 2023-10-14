package ejercicio2;

public class Planeta {

    //Atributos
    String nombre=null;
    int cantidadSatelites=0;
    double masa =0;
    double volumen=0;
    int diamentro=0;
    int distanciaSol=0;
    enum tipoPlaneta {GASEOSO, TERRESTRE, ENANO}
    tipoPlaneta tipo;
    boolean esObservable = false;
    double periodoOrbital=0;
    double periodoRotacion=0;

    //Constructores
    public Planeta(String nombre, int cantidadSatelites, double masa, double volumen, int diamentro, int distanciaSol, tipoPlaneta tipo, boolean esObservable,double periodoOrbital, double periodoRotacion) {
        this.nombre = nombre;
        this.cantidadSatelites = cantidadSatelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diamentro = diamentro;
        this.distanciaSol = distanciaSol;
        this.tipo = tipo;
        this.esObservable = esObservable;
        this.periodoOrbital=periodoOrbital;
        this.periodoRotacion=periodoRotacion;
    }

    //Metodos
    void imprimir(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Cantidad de sateites: "+cantidadSatelites);
        System.out.println("Masa del planeta: "+masa);
        System.out.println("Volumen del planta: "+volumen);
        System.out.println("Diametro del planeta: "+diamentro);
        System.out.println("Distancia al sol: "+distanciaSol);
        System.out.println("Tipo de planeta: "+tipo);
        System.out.println("Es observable: " + esObservable);
        System.out.println("Periodo orbital del planeta: "+periodoOrbital+" años");
        System.out.println("Periodo rotacion del planeta: "+periodoRotacion+" dias");
    }

    double calcularDensidad(){
        return masa/volumen;
    }

    boolean esPlanetaExterior(){
        float limite=(float) (149597870*3.4);
        if(distanciaSol>limite){
            return true;
        }else {
            return false;
        }
    }
}
