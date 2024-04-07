package geometry;

// Definicja klasy Rectangle
public class Rectangle {
    // Prywatne pola length i width
    private double length;
    private double width;
    
    // Konstruktor inicjujący pola length i width
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    // Metoda zwracająca długość prostokąta
    public double getLength() {
        return length;
    }
    
    // Metoda zwracająca szerokość prostokąta
    public double getWidth() {
        return width;
    }
    
    // Metoda obliczająca pole prostokąta
    public double calculateArea() {
        return length * width;
    }
    
    // Metoda obliczająca obwód prostokąta
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}
