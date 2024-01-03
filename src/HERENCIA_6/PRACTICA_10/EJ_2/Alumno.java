package HERENCIA_6.PRACTICA_10.EJ_2;

public class Alumno {
    private String nombre;
    private String apellido;
    private int curso;
    private double importeMatricula;

    public Alumno() {
    }

    public Alumno(String nombre, String apellido, int curso, double importeMatricula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.importeMatricula = importeMatricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public double getImporteMatricula() {
        return importeMatricula;
    }

    public void setImporteMatricula(double importeMatricula) {
        this.importeMatricula = importeMatricula;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", curso=" + curso +
                ", importeMatricula=" + importeMatricula +
                '}';
    }
}
