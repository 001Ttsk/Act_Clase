package Model;

public class UsuarioSeguro {
    private String nombreUsuario;
    private String password;
    public String getNombreUsuario() {
        return nombreUsuario;
    }
    public void setNombreUsuario(String nombreUsuario) {
        if (nombreUsuario == null || nombreUsuario.isEmpty()) {
            System.out.println("El nombre de usuario no debe ser nulo/vacio");
            return;
        }
        this.nombreUsuario = nombreUsuario;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        if (password == null || password.length() < 8) {
            System.out.println("La contraseña debe tener al menos 8 caracteres");
            return;
        }
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) hasUpper = true;
            if (Character.isLowerCase(c)) hasLower = true;
            if (Character.isDigit(c)) hasDigit = true;
        }
        if (!hasUpper) {
            System.out.println("La contraseña debe tener al menos una mayuscula");
            return;
        }
        if (!hasLower) {
            System.out.println("La contraseña debe tener al menos una minuscula");
            return;
        }
        if (!hasDigit) {
            System.out.println("La contraseña debe tener al menos un numero");
            return;
        }
        this.password = password;
    }
    public boolean autenticar(String nombreUsuario, String password) {
        return this.nombreUsuario != null && this.password != null &&
               this.nombreUsuario.equals(nombreUsuario) &&
               this.password.equals(password);
    }
}
