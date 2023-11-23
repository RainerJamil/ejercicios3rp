package ejercicio3_7;

import java.util.Vector;

public class Tienda {
    String nombre;
    String propietario;
    int identificadorTibutario;
    Vector computadores;


    public Tienda(String nombre, String propietario, int identificadorTibutario) {
        this.nombre = nombre;
        this.propietario = propietario;
        this.identificadorTibutario = identificadorTibutario;
        computadores = new Vector();
    }

    public boolean tiendaLlena(){

        return false;
    }
    public boolean tiendaVacia(){
        return computadores.size()==0;
    }

    public void anadir(Computador computador) {
        computadores.add(computador);
    }

    public boolean eliminar(String marcaComputador) {
        int p = buscar(marcaComputador);
        if (p < 0) {
            return false;
        }
        computadores.removeElement(p);
        return true;
    }

    public int buscar(String marcaComputardor) {
        Computador computador;
        for (int i = 0; i < computadores.size(); i++) {
            computador=(Computador) computadores.elementAt(i);
            if (computador.marca.equals(marcaComputardor)) ;

        }
        return -1;
    }
    public void imprimir(){
        for (int i=0;i<computadores.size();i++){
            System.out.println("computador"+i);
            Computador computador=(Computador)computadores.elementAt(i);
            System.out.println("Marca="+computador.marca);
            System.out.println("Cantida de memoria="+computador.cantidadMemoria);
            System.out.println("Caracteristicas del procesador="+computador.caracteristicasProcesador);
            System.out.println("Sistema operativo="+computador.sistemaOperativo);
            System.out.println("Precio="+computador.precio);
        }
    }
}
