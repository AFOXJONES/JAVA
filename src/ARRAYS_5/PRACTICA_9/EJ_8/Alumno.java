package ARRAYS_5.PRACTICA_9.EJ_8;

import java.util.*;

public class Alumno implements Comparable<Alumno> {
private String nombre;
private String apellido;
private String telefono;
private String dni;
private int[] notas;

public Alumno(String nombre, String apellido, String telefono, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.dni = dni;
        this.notas = new int[3]; // Asumiendo 3 notas para la primera evaluación
        }

public String getNombre() {
        return nombre;
        }

public String getApellido() {
        return apellido;
        }

public String getDni() {
        return dni;
        }

public int[] getNotas() {
        return notas;
        }

public void setNotas(int[] notas) {
        if (notas.length == this.notas.length) {
        this.notas = Arrays.copyOf(notas, notas.length);
        } else {
        System.out.println("Número de notas no válido.");
        }
        }

public double calcularNotaMedia() {
        int suma = 0;
        for (int nota : notas) {
        suma += nota;
        }
        return suma / (double) notas.length;
        }

@Override
public int compareTo(Alumno otroAlumno) {
        return Double.compare(this.calcularNotaMedia(), otroAlumno.calcularNotaMedia());
        }
        }
