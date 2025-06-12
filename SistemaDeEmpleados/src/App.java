import Model.EmpleadoPorHoras;
import Model.EmpleadoTiempoCompleto;

public class App {

    public static void main(String[] args) {
    
        EmpleadoTiempoCompleto empleado = new Model.EmpleadoTiempoCompleto(
            "001", 
            "Andres David", 
            15000, 
            "Seguro medico, vales de despensa, vacaciones pagadas, renovacion de equipo anualmente"
        );

        System.out.println("ID: " + empleado.getId());
        System.out.println("Nombre: " + empleado.getNombre());
        System.out.println("Beneficios: " + empleado.getBeneficios());
        System.out.println("Salario: " + empleado.calcularSalario(empleado.getSalarioBase()));

        EmpleadoPorHoras empleadox = new EmpleadoPorHoras("002", "Luisa Geovanna", 22000, 72);
        System.out.println("ID: " + empleadox.getId());
        System.out.println("Nombre: " + empleadox.getNombre());
        System.out.println("Salario: " + empleadox.calcularSalario(22000));
        System.out.println("Horas chambeadas: " + empleadox.getHorasTrabajadas());
    }
}
