import javax.swing.JOptionPane;
import Model.Computadora;

public class Actividad_Individual_4 {
    public static void main(String[] args){
        String marca = JOptionPane.showInputDialog("Ingrese la marca de la computadora:");
        String modelo = JOptionPane.showInputDialog("Ingrese el modelo de la computadora:");

        Computadora computadora = new Computadora(marca, modelo);

        computadora.encender();
        computadora.encender();
        computadora.apagar();
        System.out.println("la computadora ya esta pagada :<");
    }
}

