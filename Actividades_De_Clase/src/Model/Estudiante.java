package Model;

public class Estudiante {
    private String nombre;
    private String matricula;
    private double[] notas = new double[5];

    public Estudiante(String nombre, String matricula) {
        this.nombre = nombre;
        this.matricula = matricula;
    }

    // Métodos de acceso (Getters y Setters)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setNota(int indice, double nota) {
        if (indice >= 0 && indice < notas.length) {
            notas[indice] = nota;
        } else {
            System.out.println("indice fuera de rango");
        }
    }

    public double getNota(int indice) {
        if (indice >= 0 && indice < notas.length) {
            return notas[indice];
        } else {
            System.out.println("indice fuera de rango");
            return -1;
        }
    }

    public double calcularPromedio() {
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        return suma / notas.length;
    }

    public boolean aprobado() {
        return calcularPromedio() >= 70;
    }
}