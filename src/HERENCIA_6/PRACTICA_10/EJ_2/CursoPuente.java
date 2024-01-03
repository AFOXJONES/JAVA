package HERENCIA_6.PRACTICA_10.EJ_2;

public class CursoPuente extends Alumno{

    private String carreraProcedencia;

    public CursoPuente(String nombre, String apellido, int curso, double importeMatricula, String carreraProcedencia) {
        super(nombre, apellido, curso, importeMatricula);
        this.carreraProcedencia = carreraProcedencia;
    }

    public String getCarreraProcedencia() {
        return carreraProcedencia;
    }

    public void setCarreraProcedencia(String carreraProcedencia) {
        this.carreraProcedencia = carreraProcedencia;
    }


    @Override
    public String toString() {
        return "CursoPuente{" +
                "nombre='" + super.getNombre() + '\'' +
                ", apellido='" + super.getApellido() + '\'' +
                ", curso=" + super.getCurso()+
                ", importeMatricula=" + +getImporteMatricula() +
                "carreraProcedencia='" + carreraProcedencia + '\'' +
                '}';
    }
}
