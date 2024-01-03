package HERENCIA_6.PRACTICA_10;

public class LibroDeTexto extends Libro{
    private String curso;
    private double descuento;


    public LibroDeTexto() {
    }

    public LibroDeTexto(String titulo, String autor, String editorial, double precio, String curso, double descuento) {
        super(titulo, autor, editorial,precio);
        this.curso = curso;
        this.descuento = descuento;
    }

    @Override
    public String toString() {
        return "LibroDeTexto{" +
                "curso='" + curso + '\'' +
                ", descuento=" + descuento +
                "} " + super.toString()+" Precio Con Descuento="+getPrecio();
    }

    @Override
    public double getPrecio() {
        return super.getPrecio() - (super.getPrecio() * descuento / 100);
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
}
