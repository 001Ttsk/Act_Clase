package Model;

public class Clase {

    //atributos
    public String codigo;
    public String nombre;
    public int capacidad;
    private Estudiante [] inscritos;

    //constructores
    public Clase (String codigo, String nombre, int capacidad){
        this.codigo=codigo;
        this.nombre=nombre;
        this.capacidad=capacidad;
        this.inscritos= new Estudiante[capacidad];
    }
    //get and set
    public Estudiante[] getInscritos() {
        return inscritos;
    }

    public void setInscritos(Estudiante[] inscritos) {
        this.inscritos = inscritos;
    }

    //metodo de inscripciones booleano
    public boolean inscribir(Estudiante e) {
        //contador
    for (int i = 0; i < inscritos.length; i++) {
        //metodo de inscripcion 
        if (inscritos[i] == null) {
            inscritos[i] = e;
            return true;
        }
    }
    return false; 
    }

    //metodo promedio
    public double calcularPromedioGrupo() {
        //variable para almacenar las sumas y estudiantes inscritos
        double suma = 0;
        int count = 0;
        int i = 0;
        while (i < inscritos.length) {
            if (inscritos[i] != null) {
                suma += inscritos[i].getPromedio();
                count++;
            }
            i++;
        }
        if (count > 0) {
            return suma / count;
        } else {
            return 0; 
        }
    }
}
