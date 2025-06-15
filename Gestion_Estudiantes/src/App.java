import Model.Clase;
import Model.Estudiante;

public class App {
    public static void main(String[] args) throws Exception {
        Clase curso = new Clase("POO1", "programacion orientada a objertos", 3);
        //inicialiozacion
        Estudiante e1 = new Estudiante("Andres", "andres@gmail.com", 9.5);
        Estudiante e2 = new Estudiante("Luisa", "luisa@gmail.com", 9.2);
        Estudiante e3 = new Estudiante("David", "David@gmail.com", 8.7);
        //invocacion del metodo
        curso.inscribir(e1);
        curso.inscribir(e2);
        curso.inscribir(e3);
        //salida
        System.out.println("Promedio del grupo:" + curso.calcularPromedioGrupo());
    }
}

