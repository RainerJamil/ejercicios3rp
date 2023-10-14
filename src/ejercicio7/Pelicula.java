package ejercicio7;

public class Pelicula {
    private String nombre;
    private String director;
    enum tipo {ACCION, COMEDIA, DRAMA, SUSPENSO};
    tipo genero;
    private int duracion;
    private int ano;
    private double calificacion;

    public Pelicula(String nombre, String director, tipo genero, int duracion, int ano, double calificacion) {
        this.nombre = nombre;
        this.director = director;
        this.genero = genero;
        this.duracion = duracion;
        this.ano = ano;
        this.calificacion = calificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public tipo getGenero() {
        return genero;
    }

    public void setGenero(tipo genero) {
        this.genero = genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public void imprimir() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Director: " + director);
        System.out.println("Género: " + genero);
        System.out.println("Duración: " + duracion);
        System.out.println("Año: " + ano);
        System.out.println("Calificación: " + calificacion);
    }

    boolean esPeliculaEpica() {
        if (duracion >= 180) {
            return true;
        } else {
            return false;
        }
    }

    private String calcularValoracion() {
        if (calificacion >= 0 && calificacion <= 2) {
            return "Muy mala";
        } else if (calificacion > 2 && calificacion <= 5) {
            return "Mala";
        } else if (calificacion > 5 && calificacion <= 7) {
            return "Regular";
        } else if (calificacion > 7 && calificacion <= 8) {
            return "Buena";
        } else if (calificacion > 8 && calificacion <= 10) {
            return "Excelente";
        } else {
            return "No tiene asignada una valoración válida";
        }
    }

    boolean esSimilar(Pelicula pelicula) {
        if (pelicula.genero == genero && pelicula.calcularValoracion().equals(calcularValoracion())) {
            return true;
        } else {
            return false;
        }
    }
    private void imprimirCarterela(){
        System.out.println("CARTELERA");
        System.out.println("Pelicula: ------- "+nombre+" -------");
        System.out.print("CALIFICACION: ------- ");
        for(int i=0;i<calificacion;i++){
            System.out.print("*");
        }
        System.out.println(" -------");
        System.out.println("AÑO: ------- "+ano+" -------");
        System.out.println("GENERO: ------- "+ genero+" -------");
        System.out.println("DIRECTOR: ------- "+director+" -------");
        System.out.println();

    }
    public void imprimirCartelPublic() {
        imprimirCarterela();
    }
}
