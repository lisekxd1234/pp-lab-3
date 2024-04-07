import geometry.Circle;
import geometry.ColoredCircle;
import geometry.Point;

public class Main {
    public static void main(String[] args) {
        // Tworzenie tablicy obiektów typu Circle i ColoredCircle
        Circle[] circles = new Circle[2];
        circles[0] = new Circle(new Point(0, 0), 5);
        circles[1] = new ColoredCircle(new Point(1, 1), 3, "red");
        
        // Iteracja przez tablicę i wywołanie metody getArea() dla każdego obiektu
        for (Circle circle : circles) {
            double area = circle.getArea();
            System.out.println("Pole powierzchni koła: " + area);
        }
    }
}