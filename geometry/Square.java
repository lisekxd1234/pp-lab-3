package geometry;

// Definicja klasy Square, dziedzicząca po klasie Rectangle
public class Square extends Rectangle {
    // Konstruktor inicjujący bok kwadratu
    public Square(double side) {
        // Wywołanie konstruktora klasy bazowej Rectangle
        super(side, side);
    }
}