package Model;

public abstract class Persona {

    private String nombre;
    private String email;
    //constructores
    public Persona(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }
    //setters y getters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
