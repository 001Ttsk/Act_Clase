import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
       float x1, x2, x3;
        float promedio;
        x1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
        x2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su segundo número"));
        x3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su tercer número"));
        promedio = (x1 + x2 + x3) / 3;
        System.out.println(promedio);
    }
}
