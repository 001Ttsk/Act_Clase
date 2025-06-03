import Model.Circle;
import Model.FigureAbs;
import Model.Square;
import Model.Triangle;
import Model.TrianguloEquilatero;
import Model.TrianguloRectangulo;

public class App {
    public static void main(String[] args) throws Exception {

        FigureAbs sq = new Square(10);
        FigureAbs cir = new Circle(10);
        FigureAbs triangle = new Triangle(20, 25, 20);
        FigureAbs triangleequilatero = new TrianguloEquilatero(20, 20, 20);
        FigureAbs triangulorec = new TrianguloRectangulo(15, 25, 10);

        FigureAbs[] figures = { sq, cir, triangle, triangleequilatero, triangulorec};

        for (FigureAbs figureAbs : figures) {
            System.out.println("La clase es: " + figureAbs.getClass().getSimpleName());
            System.out.println("El area es: " + figureAbs.getArea());
            System.out.println("El perimetro es: " + figureAbs.getPerimeter());
            System.out.println("----------------------------------------------------");
        }

    }
}
