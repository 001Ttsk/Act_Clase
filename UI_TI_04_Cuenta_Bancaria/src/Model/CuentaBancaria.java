package Model;

//clase cuenta bancaria
public class CuentaBancaria {

    //declaracion de atributos 
    private String titular;
    private double saldo;

    //setter and getteres
    public CuentaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0.0;
    }
    public double getSaldo() {
        return saldo;
    }
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    //retiro
    public boolean retirar(double monto) {
        if (monto > 0 && saldo >= monto) {
            saldo -= monto;
            return true;
        }
        System.out.println("Saldo insuficiente");
        return false;
    //deposito
    }
    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
        }
    }

    
}
