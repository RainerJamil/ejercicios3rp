package ejercicio8;
public class Avion {
        private String fabricante;
        private int numeroMotores;
    Avion(String fabricante, int numeroMotores) {
        this.fabricante = fabricante;
        this.numeroMotores = numeroMotores;
    }
    void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    void cambiarFabricante(Avion a) {
        a.setFabricante("Lockheed");
    }
    public int getNumeroMotores() {
        return numeroMotores;
    }
    private void setNumeroMotores(int numeroMotores) {
        this.numeroMotores = numeroMotores;
    }
    public void imprimirFabricante() {
        System.out.println("El fabricante del avión es: " + fabricante);
    }

}
