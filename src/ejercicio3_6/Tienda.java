package ejercicio3_6;

public class Tienda {
    String nombre;
    String propietario;
    int identificadorTibutario;
    Computador[] computadores;

    public static int numeroComputadores;

    public Tienda(String nombre, String propietario, int identificadorTibutario, int tamano) {
        if (tamano < 1) {
            System.out.println("Cantidad de computadores insufientes");
        } else {
            this.nombre = nombre;
            this.propietario = propietario;
            this.identificadorTibutario = identificadorTibutario;
            computadores = new Computador[tamano];
            numeroComputadores = 0;
        }
    }

    public boolean tiendaLlena() {
        return numeroComputadores == computadores.length;
    }

    public boolean tiendaVacia() {
        return numeroComputadores == 0;
    }

    public void anadir(Computador computador) {

        if (tiendaLlena()) {
            System.out.println("La tienda está llena. No se puede añadir elemento");
        } else {
            computadores[numeroComputadores] = computador;
            numeroComputadores++;
        }
    }

    public boolean eliminar(String marcaComputador) {
        int p = buscar(marcaComputador);
        if (p < 0) {
            return false;
        }
        for (int i = 0; i < numeroComputadores; i++) {
            computadores[i] = computadores[+1];
        }
        numeroComputadores--;
        return true;

    }

    public int buscar(String marcaComputardor) {
        for (int i = 0; i < numeroComputadores; i++) {
            if (computadores[i].marca.equals(marcaComputardor))
                return i;
        }
        return 1;
    }


    public void imprimir() {
        for (int i = 0; i < numeroComputadores; i++) {
            System.out.println("computador" + i);
            System.out.println("Marca=" + computadores[i].marca);
            System.out.println("Cantida de memoria=" + computadores[i].cantidadMemoria);
            System.out.println("Caracteristicas del procesador=" + computadores[i].caracteristicasProcesador);
            System.out.println("Sistema operativo=" + computadores[i].sistemaOperativo);
            System.out.println("Precio=" + computadores[i].precio);
        }
    }
}
