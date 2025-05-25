import Model.TrianguloIsoceles;
import Model.Circulo;
import Model.Square;

public class App {
    public static void main(String[] args) throws Exception {

        Square sq = new Square();
        sq.setSide(5);
        System.out.println("cuadrado");
        System.out.println(sq.getPerimeter());
        System.out.println(sq.getArea());
        sq.getArea(5);

        Circulo cir = new Circulo();
        cir.setRadio(5);
        System.out.println("circulo");
        System.out.println(cir.getPerimeter());
        System.out.println(cir.getArea());
        cir.getArea(5);

        TrianguloIsoceles tri = new TrianguloIsoceles();
        tri.setBase(7);
        tri.setHeight(5);
        System.out.println("triangulo isoceles");
        System.out.println(tri.getPerimeter());
        System.out.println(tri.getArea());

        
    }
}
