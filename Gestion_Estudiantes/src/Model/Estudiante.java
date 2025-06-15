package Model;

public class Estudiante extends Persona {
    //atributo extra
    private double promedio;
    //constructor
    public Estudiante(String nombre, String email, double promedio) {
        super(nombre, email);
        this.promedio = promedio;
    }
    //get y set
    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    

}
