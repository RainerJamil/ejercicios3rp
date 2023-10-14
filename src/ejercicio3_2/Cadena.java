package ejercicio3_2;

public class Cadena {
    String cadenaInical="  Programacion Orientada a Objetos  ";
    String cadena1=null;

    public Cadena(String cadena1) {
        this.cadena1 = cadena1;
    }

    public String getCadena1() {
        return cadena1;
    }

    public void setCadena1(String cadena1) {
        this.cadena1 = cadena1;
    }

    public static int calcularMayusculas(String cadena1) {
        int contador=0;
        for(int i=0;i<cadena1.length();i++){
            if(Character.isUpperCase(cadena1.charAt(i))){
                contador++;
            }
        }
        return contador;
    }

    public static int contarLetra(String cadena1,char letra){
        int contador = 0;
        letra = Character.toLowerCase(letra);
        for (int i = 0; i < cadena1.length(); i++) {
            char caracter = Character.toLowerCase(cadena1.charAt(i));
            if (caracter == letra) {
                contador++;
            }
        }
        return contador;
    }
    public static void eliminarEspacios(String cadena1){
        String cadenaSinEspacio=cadena1.replaceAll("\\s", "");
        System.out.println("Cadena sin espacio ="+cadenaSinEspacio);
    }
    public static String invertirCadena(String cadena1){
        StringBuilder cadenaInvertida= new StringBuilder(cadena1);
        return cadenaInvertida.reverse().toString();
    }
}
