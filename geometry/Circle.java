package geometry;

// Definicja klasy Circle
public class Circle {
    // Prywatne pola center (punkt) i radius
    private Point center;
    private double radius;
    
    // Konstruktor inicjujący pola center i radius
    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }
    
    // Metoda zwracająca wartość center
    public Point getCenter() {
        return center;
    }
    
    // Metoda zwracająca wartość radius
    public double getRadius() {
        return radius;
    }
    
    // Metoda obliczająca obwód koła
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
    
    // Metoda obliczająca pole powierzchni koła
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
