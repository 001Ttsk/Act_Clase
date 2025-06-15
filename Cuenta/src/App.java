import model.CuentaComun;
import model.Cuenta;
import model.CuentaAhorros;

public class App {
    public static void main(String[] args) throws Exception {
        Cuenta CuentaComun=new CuentaComun("DAV1984-CC", "Andres David Nuñez Avalos", 1000);
        CuentaComun.depositar(500);
        CuentaComun.retirar(400);
        CuentaAhorros CuentaAhorros=new model.CuentaAhorros("LUISA2006-CA", 999, 16);
        CuentaAhorros.depositar(300);
        CuentaAhorros.retirar(200);
        CuentaAhorros.aplicarInteres();

        /*Cuenta [] cuentas= {CuentaComun, CuentaAhorros};
        for (Cuenta cuenta :cuentas){
            if (cuenta instanceof CuentaAhorros){
                ((CuentaAhorros) cuenta).aplicarInteres();
            }
        }*/
        
    }
}
