package CLASES_Y_OBJETOS_3.PRACTICA_8.EJ_2;

public class Etiqueta {

    private int altura;
    private int anchura;
    private char caracter;

    public Etiqueta(int altura,int anchura, char caracter){
        this.altura=altura;
        this.anchura=anchura;
        this.caracter=caracter;
    }

    public void mostrarEtiqueta(Etiqueta e) {
        for (int i = 1; e.altura >= i; i++) {
            String linea = "";
            for (int j = 1; e.anchura >= j; j++) {
                if (i == 1 || i == e.altura || j == 1 || j == e.anchura) {
                    linea += e.caracter;
                } else {
                    linea += " ";
                }
            }
            System.out.println(linea);
        }
    }

    public char getCaracter() {
        return caracter;
    }

    public void setCaracter(char caracter) {
        this.caracter = caracter;
    }

    public int getAnchura() {
        return anchura;
    }

    public void setAnchura(int anchura) {
        this.anchura = anchura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
}
