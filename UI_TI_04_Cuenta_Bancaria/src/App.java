import Model.CuentaBancaria;
public class App {
    public static void main(String[] args) throws Exception {
        //presentacion de PATSU
        System.out.print("---Bienvenido a PATSUBANK---\n");
        System.out.println("---------------------------------");
        System.out.println("Ingrese su usuario y contraseña\n");
        CuentaBancaria cuenta = new CuentaBancaria("David");
        System.out.println("saldo:");
        System.out.println("Retirar 1000");
        cuenta.depositar(1000);
        System.out.println( + cuenta.getSaldo());
        System.out.println("saldo:");
        System.out.println("Retirar 400");
        cuenta.retirar(400);
        System.out.println( + cuenta.getSaldo());
        System.out.println("saldo:");
        System.out.println("Retirar 20000");
        cuenta.retirar(20000);
        System.out.println( + cuenta.getSaldo());


    }
    }

