import javax.swing.JOptionPane;
import Model.Estudiante;
public class Acttividad_Individual_3_Promedio_Alumno {
    public static void main(String[] args) {
        //Estudiantes creados
        Estudiante[] estudiantes = {
            new Estudiante("Luisa", "001"),
            new Estudiante("David", "002"),
            new Estudiante("Merari", "003"),
            new Estudiante("Victor", "004"),
            new Estudiante("Abraham", "005")
        };

        //Ingresar las notas
        for (Estudiante estudiante : estudiantes) {
            for (int i = 0; i < 5; i++) {
                boolean entradaValida = false;
                while (!entradaValida) {
                    try {
                        String input = JOptionPane.showInputDialog(
                            "Ingrese la nota" + (i + 1) + "para" + estudiante.getNombre() + ":"
                        );
                        if (input == null) return; 

                        double nota = Double.parseDouble(input);
                        if (nota >= 0 && nota <= 100) { 
                            estudiante.setNota(i, nota);
                            entradaValida = true;
                        } else {
                            JOptionPane.showMessageDialog(null, "Ingrese una nota entre 0 y 100");
                        }
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Ingrese un numero valido");
                    }
                }
            }
        }

        //Salida de informacion
        System.out.println("Promedios");
        for (Estudiante estudiante : estudiantes) {
            System.out.println("Nombre:" + estudiante.getNombre());
            System.out.println("Matricula:" + estudiante.getMatricula());
            System.out.println("Promedio:" + estudiante.calcularPromedio());
            System.out.println("El estudiante aprobo?:" + (estudiante.aprobado() ? "Si" : "No"));
            System.out.println("------------------------");
        }
    }
}