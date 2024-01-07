package HERENCIA_6.PRACTICA_10.EJ_5;

public class Main {
    public static void main(String[] args){
        //Hacer una clase polígono con dos métodos abstractos, uno que calcule el área y
        //otro el perímetro. Para cada polígono se guarda su número de lados. Codificar
        //después tres clases derivadas: Cuadrado, Rectángulo y Triángulo que codifiquen
        //dichos métodos. Hacer un main con un array de polígonos para probarl.


        Poligono[] poligonos={new Cuadrado(12),new Rectangulo(12,5),new Triangulo(20,30,40,50)};

        for(Poligono poligono:poligonos){
            poligono.calcularArea();
            poligono.calcularPerimetro();
        }


    }
}
