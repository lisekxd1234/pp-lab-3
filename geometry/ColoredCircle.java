package geometry;

// Definicja klasy ColoredCircle, dziedzicząca po klasie Circle
public class ColoredCircle extends Circle {
    // Prywatne pole color, reprezentujące kolor koła
    private String color;
    
    // Konstruktor inicjujący pola center, radius i color
    public ColoredCircle(Point center, double radius, String color) {
        super(center, radius); // Wywołanie konstruktora klasy Circle
        this.color = color;
    }
    
    // Metoda zwracająca wartość color
    public String getColor() {
        return color;
    }
}