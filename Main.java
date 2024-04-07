// Import klasy Scanner, aby wczytywać dane z konsoli
import java.util.Scanner;

// Definicja klasy Main
public class Main {
    // Metoda główna programu
    public static void main(String[] args) {
        // Tworzenie obiektu klasy Scanner do wczytywania danych z konsoli
        Scanner scanner = new Scanner(System.in);
        
        // Prośba o wprowadzenie współrzędnych punktu
        System.out.println("Podaj współrzędną x:");
        double x = scanner.nextDouble(); // Wczytanie współrzędnej x
        System.out.println("Podaj współrzędną y:");
        double y = scanner.nextDouble(); // Wczytanie współrzędnej y
        
        // Tworzenie obiektu klasy Point z wczytanymi współrzędnymi
        Point point = new Point(x, y);
        
        // Wyświetlenie współrzędnych punktu
        System.out.println("Współrzędne punktu:");
        System.out.println("x = " + point.getX());
        System.out.println("y = " + point.getY());
        
        // Zamknięcie obiektu Scanner
        scanner.close();
    }
}
