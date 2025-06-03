package Model;

public class TrianguloEquilatero extends FigureAbs {
    //atributos
    private double base;
    private double altura;
    private double lado;

    public TrianguloEquilatero (double base, double altura, double lado){
        this.base = base;
        this.altura = altura;
        this.lado = lado;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    //herencia de la clase padre 
    @Override
    public double getArea() {
        return (base*altura)/2;
    }

    @Override
    public double getPerimeter() {
        return (lado+lado+lado);
    }

}
