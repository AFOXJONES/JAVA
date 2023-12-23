package CLASES_Y_OBJETOS_3.PRACTICA_8.EJ_3;

public class Alumno {
    private String matricula;
    private Double notaJava;
    private Double notaPython;
    private Double notaJS;

    public Alumno(String matricula,Double notaJava,Double notaPython,Double notaJS){
        this.matricula=matricula;
        this.notaJava=notaJava;
        this.notaPython=notaPython;
        this.notaJS=notaJS;
    }



    public double calcularNotaMedia() {
        return (notaJava + notaPython + notaJS) / 3.0;
    }


    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Double getNotaJava() {
        return notaJava;
    }

    public void setNotaJava(Double notaJava) {
        this.notaJava = notaJava;
    }

    public Double getNotaPython() {
        return notaPython;
    }

    public void setNotaPython(Double notaPython) {
        this.notaPython = notaPython;
    }

    public Double getNotaJS() {
        return notaJS;
    }

    public void setNotaJS(Double notaJS) {
        this.notaJS = notaJS;
    }
}
