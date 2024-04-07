import geometry.Square;

public class Main {
    public static void main(String[] args) {
        // Tworzenie obiektu klasy Square z podanym bokiem
        Square square = new Square(5);
        
        // Wyświetlenie właściwości kwadratu
        System.out.println("Właściwości kwadratu:");
        System.out.println("Bok: " + square.getLength());
        System.out.println("Pole kwadratu: " + square.calculateArea());
        System.out.println("Obwód kwadratu: " + square.calculatePerimeter());
    }
}
