package model;

public class CuentaAhorros extends Cuenta {
    private double tasaInteresAnual;
    
    public void aplicarInteres(){
        double interes=saldo*(tasaInteresAnual/12);
    //saldo = saldo + interes;
    saldo+=interes;
    //setSaldo(getSaldo()+interes);
    }

    public double getTasaInteresAnual() {
        return tasaInteresAnual;
    }

    public void setTasaInteresAnual(double tasaInteresAnual) {
        this.tasaInteresAnual = tasaInteresAnual;
    }
    
    public CuentaAhorros(String numeroCuenta, double saldo, double tasaInteresAnual){
        super(numeroCuenta, numeroCuenta, saldo);
        this.tasaInteresAnual = tasaInteresAnual;
    }

    

}
