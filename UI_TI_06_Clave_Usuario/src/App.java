import java.util.Scanner;
import Model.UsuarioSeguro;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un usuario y contraseña");
        UsuarioSeguro usuario = new UsuarioSeguro();
        System.out.print("Nombre de usuario: ");
        usuario.setNombreUsuario(scanner.nextLine());
        System.out.print("Contraseña: ");
        usuario.setPassword(scanner.nextLine());
        System.out.print("Nombre de usuario para autenticar: ");
        String nombreUsuarioAutenticar = scanner.nextLine();
        System.out.print("Contraseña para autenticar: ");
        String passwordAutenticar = scanner.nextLine();
        
        if (usuario.autenticar(nombreUsuarioAutenticar, passwordAutenticar)) {
            System.out.println("Autenticacion exitosa");
        } else {
            System.out.println("Autenticacion fallida");
        }
        scanner.close();
    }
}
