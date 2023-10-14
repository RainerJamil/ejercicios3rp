package ejercicio7;

public class main {
    public static void main(String ags[]) {
        Pelicula pelicula1 = new Pelicula("Gandhi", "Richard Attenborough", Pelicula.tipo.DRAMA,191,1982,8.3);
        Pelicula pelicula2 = new Pelicula("Thor", "Kenneth Branagh", Pelicula.tipo.ACCION, 115,2011,7.0);
        pelicula1.imprimir();
        System.out.println();
        pelicula2.imprimir();
        System.out.println();
        System.out.println("La película " + pelicula1.getNombre() + " es épica: " + pelicula1.esPeliculaEpica());
        System.out.println("La película " + pelicula2.getNombre() + " es épica: " + pelicula2.esPeliculaEpica());
        System.out.println("La película " + pelicula1.getNombre() + " y la película " + pelicula2.getNombre() + " son similares = " +pelicula1.esSimilar(pelicula2));
        System.out.println();
        pelicula1.imprimirCartelPublic();
        pelicula2.imprimirCartelPublic();
    }
}
