package ejercicio3_2;

public class Main {
    public static void main(String args[]){
        Cadena cadena=new Cadena("HOLA COMO ESTAS");
        int longitud=cadena.cadenaInical.length();
        System.out.println("La longitud del String es = "+longitud);
        String cadenaSinEspacio= cadena.cadenaInical.trim();
        System.out.println("El String sin espacios en blanco = "+cadenaSinEspacio);
        String cadenaMayusculas= cadenaSinEspacio.toUpperCase();
        System.out.println("El String en mayúscula = "+cadenaMayusculas);
        String cadenaConcatenada=cadenaMayusculas.concat("12345");
        System.out.println("El String concatenado = "+cadenaConcatenada);
        String cadenaExtraida=cadenaConcatenada.substring(24,31);
        System.out.println("El String extraído = "+cadenaExtraida);
        String cadenaReemplazada=cadenaExtraida.replace("O","X");
        System.out.println("El String reemplazado = "+cadenaReemplazada);
        boolean comparacion=cadenaReemplazada.equals("programacion");
        System.out.println("Los String son iguales = "+comparacion);

        int mayuscula= cadena.calcularMayusculas(cadena.cadenaInical);
        System.out.println("Cantidad de mayúsculas en el String = " + mayuscula );

        char letraBuscada = 'O';
        int vecesLetra = cadena.contarLetra(cadena.cadenaInical,letraBuscada);
        System.out.println("La letra '" + letraBuscada + "' aparece " + vecesLetra + " veces en el String.");

        Cadena.eliminarEspacios(cadena.cadenaInical);

        String cadenaInvertida=Cadena.invertirCadena(cadena.cadenaInical);
        System.out.println("La cadena invertida = " + cadenaInvertida);
    }
}
