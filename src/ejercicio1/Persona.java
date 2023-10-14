package ejercicio1;

public class Persona {

    //Atributos
    String nombre;
    String apellido;
    String numeroDocumentoIdentidad;
    int anoNacimiento;
    String paisNacimiento;
    char sexo;

    // Constructores
    public Persona(String nombre, String apellido, String numeroDocumentoIdentidad, int anoNacimiento,String paisNacimiento,char sexo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroDocumentoIdentidad = numeroDocumentoIdentidad;
        this.anoNacimiento = anoNacimiento;
        this.paisNacimiento = paisNacimiento;
        this.sexo = sexo;
    }

    // Metodo
    void imprimir(){
        System.out.println("Nombre = "+nombre);
        System.out.println("Apellido = "+apellido);
        System.out.println("Numero de documento de identidad = "+numeroDocumentoIdentidad);
        System.out.println("Año de nacimiento = "+anoNacimiento);
        System.out.println("Pais de nacimiento = "+paisNacimiento);
        System.out.println("Sexo = "+sexo);
        System.out.println();
    }
}
