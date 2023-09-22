package SENTENCIAS_DE_CONTROL.PRACTICA_6;
import java.util.*;
public class EJ8 {
    public static void main(String[] args) {

        //8. Se desea conocer el luckynumber de cualquier persona. El número de la suerte se consigue
        //reduciendo la fecha de nacimiento a un número de un solo dígito.
        //16/08/1973->16+8+1973=1997->1+9+9+7=26->2+6=8

        Scanner sc=new Scanner(System.in);

        System.out.println("Escribe una fecha en formato DD/MM/YYYY: ");
        String fecha=sc.next();

        System.out.println("LUCKY NUMBER: "+calcularLuckyNumber(fecha));


    }
    public static int calcularLuckyNumber(String fecha){
        String[] partes = fecha.split("/");
        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]);
        int anio = Integer.parseInt(partes[2]);

        int lucky=dia+mes+anio;

        int n1=lucky/1000;
        int n2=(lucky%1000)/100;
        int n3=((lucky%1000)%100)/10;
        int n4=lucky%10;

        lucky=n1+n2+n3+n4;

        if(lucky>=10){
            n1=lucky/10;
            n2=lucky%10;
            lucky=n1+n2;
        }


        return lucky;
    }
}
