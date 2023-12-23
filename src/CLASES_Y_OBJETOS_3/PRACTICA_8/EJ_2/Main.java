package CLASES_Y_OBJETOS_3.PRACTICA_8.EJ_2;

public class Main {
    //Programa que construye etiquetas. Una etiqueta es un recuadro de una altura y anchura determinada, realizado con un determinado carácter, por ej:
    //++++++
    //+    +
    //++++++
    //Etiqueta de altura 3, anchura 6, carácter ‘+’.
    //Hacer un constructor, un método para mostrarla por pantalla y otro para modificar el carácter con el que se dibuja.
    public static void main(String[] args){
        Etiqueta etiq1=new Etiqueta(6,10, 'x');
        etiq1.mostrarEtiqueta(etiq1);
        etiq1.setCaracter('f');
        etiq1.mostrarEtiqueta(etiq1);
    }
}
