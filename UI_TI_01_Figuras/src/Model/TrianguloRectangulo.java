package Model;

public class TrianguloRectangulo extends FigureAbs {
    private double base, lado, altura;

    public TrianguloRectangulo(double base, double lado, double altura) {
        this.base = base;
        this.lado = lado;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double getArea() {
        return (base*altura)/2;
    }

    @Override
    public double getPerimeter() {
        return (base+lado+altura);
    }

    
}
