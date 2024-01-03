package HERENCIA_6.PRACTICA_10.EJ_2;

public class Extranjero extends Alumno{
    private String paisOrigen;

    public Extranjero(String nombre, String apellido, int curso, double importeMatricula, String paisOrigen) {
        super(nombre, apellido, curso, importeMatricula);
        this.paisOrigen = paisOrigen;
    }


    @Override
    public double getImporteMatricula() {
        return super.getImporteMatricula()+(super.getImporteMatricula()*15/100);
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }


    @Override
    public String toString() {
        return "Extranjero{" +
                "nombre='" + super.getNombre() + '\'' +
                ", apellido='" + super.getApellido() + '\'' +
                ", curso=" + super.getCurso()+
                ", importeMatricula=" + +getImporteMatricula() +
                '}';
    }
}
