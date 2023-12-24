package STRINGS_4.PRACTICA_1;

import java.util.*;

public class EJ_3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nombre y apellidos: ");
        String nombreApellidos = scanner.nextLine();

        String codigo = generarCodigoConStringTokenizer(nombreApellidos);
            // Utilizar StringTokenizer para(nombreApellidos);
        System.out.println("El código generado con Tokenizer es: " + codigo);


        codigo = generarCodigoConSplit(nombreApellidos);
        // Utilizar StringTokenizer para(nombreApellidos);
        System.out.println("El código generado con Split es: " + codigo);
        scanner.close();
    }

    public static String generarCodigoConStringTokenizer(String nombreApellidos){
        // Utilizar StringTokenizer para dividir la cadena en nombre y apellidos
        StringTokenizer tokenizer = new StringTokenizer(nombreApellidos);

        String nombre = tokenizer.nextToken();
        //operadores ternarios (condición ? expresión_si_verdadero : expresión_si_falso;)
        String primerApellido = tokenizer.hasMoreTokens() ? tokenizer.nextToken() : "";
        String segundoApellido = tokenizer.hasMoreTokens() ? tokenizer.nextToken() : "";

        String codigo;
        String parteApellido;

        parteApellido=parteApellido(primerApellido,segundoApellido);

        // Generar el código con la primera letra del nombre y las letras del apellido obtenidas
        codigo = nombre.substring(0, 1) + parteApellido.toUpperCase();

        return codigo;
    }

    public static String generarCodigoConSplit(String nombreApellidos){
        // \\s+ es una expresion regular que indica que haya uno a mas espacios, se podria poner tambien " "
        // pero solo lo ahria si hay un espacio y podria haber algun error
        String[] partes = nombreApellidos.split("\\s+");
        //recoger del array el nombre y apellidos si existen
        String nombre = partes[0];
        String primerApellido = partes.length > 1 ? partes[1] : "";
        String segundoApellido = partes.length > 2 ? partes[2] : "";

        String codigo;

        String parteApellido;

        parteApellido=parteApellido(primerApellido,segundoApellido);

        // Generar el código con la primera letra del nombre y las letras del apellido obtenidas
        codigo = nombre.substring(0, 1) + parteApellido.toUpperCase();

        return codigo;
    }

    public static String parteApellido( String primerApellido,String segundoApellido){
        String parteApellido;
        if(primerApellido.length()>=3) {
            parteApellido = primerApellido.substring(0, Math.min(3, primerApellido.length()));
        }else if(segundoApellido.length()>=3){
            parteApellido = segundoApellido.substring(0, Math.min(3, primerApellido.length()));
        }else{
            parteApellido=primerApellido.length()>=segundoApellido.length() ? primerApellido : segundoApellido;
        }
        return parteApellido;
    }
}
