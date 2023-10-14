package ejercicio3;
public class Automovil {

    //ATRIBUTOS
    String marca;
    int modelo;
    int motor;
    enum tipoCom{GASOLINA,BIOETANOL,DIESEL,BIODIESEL,GAS_NATURAL}
    tipoCom tipoCombustible;
    enum tipoA{CIUDAD,SUBCOMPACTO,COMPACTO,FAMILIAR,EJECUTIVO,SUV}
    tipoA tipoAutomovil;
    int numeroPuertas;
    int numeroAsientos;
    int velocidadMax;
    enum tipoColor{BLANCO,NEGRO,ROJO,NARANJA,AMARILLO,VERDE,AZUL,VIOLETA}
    tipoColor color;
    int velocidadActual=0;
    boolean transmicion;
    int multa=0;

    //CONSTRUCTORES
    public Automovil(String marca, int modelo, int motor, tipoCom tipoCombustible, tipoA tipoAutomovil, int numeroPuertas, int numeroAsientos, int velocidadMax, tipoColor color, boolean transmicion) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.tipoCombustible = tipoCombustible;
        this.tipoAutomovil = tipoAutomovil;
        this.numeroPuertas = numeroPuertas;
        this.numeroAsientos = numeroAsientos;
        this.velocidadMax = velocidadMax;
        this.color = color;
        this.transmicion=transmicion;
    }

    //GETS Y SETS
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    public tipoCom getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(tipoCom tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public tipoA getTipoAutomovil() {
        return tipoAutomovil;
    }

    public void setTipoAutomovil(tipoA tipoAutomovil) {
        this.tipoAutomovil = tipoAutomovil;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroAsientos() {
        return numeroAsientos;
    }

    public void setNumeroAsientos(int numeroAsientos) {
        this.numeroAsientos = numeroAsientos;
    }

    public int getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(int velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    public tipoColor getColor() {
        return color;
    }

    public void setColor(tipoColor color) {
        this.color = color;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public boolean isTransmicion() {
        return transmicion;
    }

    public void setTransmicion(boolean transmicion) {
        this.transmicion = transmicion;
    }

    public int getMulta() {
        return multa;
    }

    public void setMulta(int multa) {
        this.multa = multa;
    }

    //METODOS
    void acelerar(int incrementoVelocidad){
        if(velocidadActual+incrementoVelocidad<velocidadMax){
            velocidadActual=velocidadActual+incrementoVelocidad;
        }else{
            System.out.println("Su velocidad es: "+(velocidadActual+incrementoVelocidad));
            System.out.println("Sobrepaso la velocidad maxima, se genero una multa (200 BS) ");
            multa=200+multa;
        }
    velocidadActual=velocidadMax;
    }
    void tieneMultas(){
        if(multa<=0){
            System.out.println("El vehiculo no tiene multas");
        }else {
            System.out.println("El vehiculo tiene multas");
        }
    }

    void totalMultas(){
        System.out.println("El total de multas es: "+multa);
    }

    void desacelerar(int decrementoVelocidad){
        if (velocidadActual-decrementoVelocidad>0){
            velocidadActual=velocidadActual-decrementoVelocidad;
        }else{
            System.out.println("No se puede decrementar a una velocidad negativa.");
        }
    }
     void frena(){
        velocidadActual=0;
     }
     double calcularTiempo(int distancia){
        return distancia/velocidadActual;
     }

     void imprimir(){
         System.out.println("Marca: "+marca);
         System.out.println("Modelo: "+modelo);
         System.out.println("Motor: "+motor);
         System.out.println("Tipo de combustible: "+tipoCombustible);
         System.out.println("Tipo de automovil: "+tipoAutomovil);
         System.out.println("Numero de puertas: "+numeroPuertas);
         System.out.println("Cantidad de asientos: "+numeroAsientos);
         System.out.println("Velocidad maxima: "+velocidadMax);
         System.out.println("Color: "+color);
         System.out.println("Automatico: "+transmicion);
         System.out.println();

     }
}
