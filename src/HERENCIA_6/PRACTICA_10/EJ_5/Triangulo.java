package HERENCIA_6.PRACTICA_10.EJ_5;

public class Triangulo extends Poligono{
    private double base;
    private double altura;
    private double lado1;
    private double lado2;


    public Triangulo(double base, double altura, double lado1, double lado2) {
        super(3);
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    @Override
    public void calcularArea() {
        double area=(base*altura)/2;
        System.out.println("Area del triangulo: "+area);
    }

    @Override
    public void calcularPerimetro() {
        double perimetro=lado1+lado2+base;
        System.out.println("Area del perimetro: "+perimetro);
    }
}
