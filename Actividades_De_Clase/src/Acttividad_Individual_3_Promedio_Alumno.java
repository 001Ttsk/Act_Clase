import javax.swing.JOptionPane;
import Model.Estudiante;

public class Acttividad_Individual_3_Promedio_Alumno {
    public static void main(String[] args) {
        Estudiante[] estudiantes = {
            new Estudiante("Luisa", "001"),
            new Estudiante("David", "002"),
            new Estudiante("Merari", "003"),
            new Estudiante("Victor", "004"),
            new Estudiante("Abraham", "005")
        };
        for (Estudiante estudiante : estudiantes) {
            asignarNotas(estudiante);
            mostrarResultados(estudiante);
        }
    }

    private static void asignarNotas(Estudiante estudiante) {
        for (int i = 0; i < 5; i++) {
            boolean notaValida = false;
            while (!notaValida) {
                String input = JOptionPane.showInputDialog(
                    "Ingrese la nota " + (i + 1) + " para " + estudiante.getNombre() + ":"
                );
                if (input == null) System.exit(0);
                if (input.matches("\\d+(\\.\\d+)?")) {
                    double nota = Double.parseDouble(input);
                    if (nota >= 0 && nota <= 100) {
                        estudiante.setNota(i, nota);
                        notaValida = true;
                    } else {
                        JOptionPane.showMessageDialog(null, "Ingrese una nota entre 0 y 100");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Ingrese un numero valido.");
                }
            }
        }
    }

    private static void mostrarResultados(Estudiante estudiante) {
        System.out.println("Nombre: " + estudiante.getNombre());
        System.out.println("Matricula: " + estudiante.getMatricula());
        System.out.println("Promedio: " + estudiante.calcularPromedio());
        System.out.println("El estudiante aprobo? " + (estudiante.aprobado() ? "Si" : "No"));
        System.out.println("------------");
    }
}