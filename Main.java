import geometry.ColoredCircle;
import geometry.Point;

public class Main {
    public static void main(String[] args) {
        // Tworzenie obiektu klasy Point reprezentującego środek koła
        Point center = new Point(0, 0);
        
        // Tworzenie obiektu klasy ColoredCircle z podanym środkiem, promieniem i kolorem
        ColoredCircle coloredCircle = new ColoredCircle(center, 5, "blue");
        
        // Wyświetlenie właściwości kolorowego koła
        System.out.println("Właściwości kolorowego koła:");
        System.out.println("Środek koła: (" + coloredCircle.getCenter().getX() + ", " + coloredCircle.getCenter().getY() + ")");
        System.out.println("Promień koła: " + coloredCircle.getRadius());
        System.out.println("Kolor koła: " + coloredCircle.getColor());
        System.out.println("Obwód koła: " + coloredCircle.calculatePerimeter());
        System.out.println("Pole powierzchni koła: " + coloredCircle.getArea());
    }
}
