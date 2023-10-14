package ejercicio4;

public class Cudrado {
    int lado;

    public Cudrado(int lado) {
        this.lado = lado;
    }
    double calcularArea(){
        return Math.pow(lado,2);
    }
    double calcularPerimetro(){
        return  4*lado;
    }
}
