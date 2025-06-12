package Model;

public class EmpleadoTiempoCompleto extends Empleado {

    private String beneficios;
    
    //constructor
    public EmpleadoTiempoCompleto(String id, String nombre, double salarioBase, String beneficios) {
        super(id, nombre, salarioBase);
        this.beneficios = beneficios;
    }

    @Override
    
public double calcularSalario(double salarioBase) {
        return salarioBase;
    }


    public String getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(String beneficios) {
        this.beneficios = beneficios;
    }

}
