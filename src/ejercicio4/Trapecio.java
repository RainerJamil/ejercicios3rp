package ejercicio4;

public class Trapecio {
    int altura;
    int baseMayor;
    int baseMenor;

    public Trapecio(int altura, int baseMayor, int baseMenor) {
        this.altura = altura;
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
    }
    double calcularArea(){
        return ((double) (baseMayor +baseMenor) /2)*altura;
    }
    double calcularPerimetro(){
        return  baseMenor+baseMayor+2*calculoLado();
    }
    double calculoLado(){
        return Math.sqrt(Math.pow(((double) (baseMayor - baseMenor) /2),2)+Math.pow(altura,2));
    }
}
