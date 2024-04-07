import geometry.Circle;
import geometry.Point;

public class Main {
    public static void main(String[] args) {
        // Tworzenie obiektu klasy Point reprezentującego środek koła
        Point center = new Point(0, 0);
        
        // Tworzenie obiektu klasy Circle z podanym środkiem i promieniem
        Circle circle = new Circle(center, 5);
        
        // Wyświetlenie właściwości koła
        System.out.println("Właściwości koła:");
        System.out.println("Środek koła: (" + circle.getCenter().getX() + ", " + circle.getCenter().getY() + ")");
        System.out.println("Promień koła: " + circle.getRadius());
        System.out.println("Obwód koła: " + circle.calculatePerimeter());
        System.out.println("Pole powierzchni koła: " + circle.getArea());
    }
}
