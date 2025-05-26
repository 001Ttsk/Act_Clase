package Model;

public class Computadora {
    //declaracion de atributos 
    private String marca;
    private String modelo;
    private boolean encendida;

    public String getModelo(){
        return modelo;
    }
    public String getMarca() {
        return marca;
    }

    public Computadora(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.encendida = false;
    }

    public void encender() {
        if (!encendida) {
            System.out.println("la computadora se esta encendiendo *bip bip bip*");
            encendida = true;
        } else {
            System.out.println("la computadora ya esta encendida. Yuju!");
        }
    }

    public void apagar() {
        if (encendida) {
            System.out.println("la computadora se esta apagando...");
            encendida = false;
        } else {
            System.out.println("la computadora ya esta apagada :<");
        }
    }
}
