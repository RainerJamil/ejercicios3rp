package ejercicio4;

public class Rombo {
    int diagonalMayor;
    int diagonalMenor;

    public Rombo(int diagonalMayor, int diagonalMenor) {
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
    }

    double calcularArea(){
        return ((double) (diagonalMayor * diagonalMenor) /2);
    }
    double calcularPerimetro(){
        return  4*calcularLado();
    }
    double calcularLado(){
        return Math.sqrt((Math.pow((double) diagonalMenor /2,2)+Math.pow((double) diagonalMayor /2,2)));
    }
}
