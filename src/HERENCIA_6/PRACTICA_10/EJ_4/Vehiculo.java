package HERENCIA_6.PRACTICA_10.EJ_4;

public class Vehiculo {
    private String matricula;
    protected static double totalRecaudado;


    public Vehiculo() {
    }

    public Vehiculo(String matricula) {
        this.matricula = matricula;

    }



    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public static double getTotalRecaudado() {
        return totalRecaudado;
    }

    public static void setTotalRecaudado(double totalRecaudado) {
        Vehiculo.totalRecaudado = totalRecaudado;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "matricula='" + matricula + '\'' +
                '}';
    }
}
