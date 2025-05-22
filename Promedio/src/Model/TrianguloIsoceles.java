package Model;

public class TrianguloIsoceles {
    private double Height;
    private double Base;

    public double getPerimeter() {
        return Height + Base + Height;
    }

    public double getArea() {
        return (Base * Height) / 2;
    }

    public void setBase(double base) {
        this.Base = base;
    }

    public void setHeight(double height) {
        this.Height = height;
    }
}
