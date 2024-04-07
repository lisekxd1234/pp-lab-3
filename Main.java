import geometry.Rectangle;

public class Main {
    public static void main(String[] args) {
        // Tworzenie obiektu klasy Rectangle z podanymi wymiarami
        Rectangle rectangle = new Rectangle(4, 6);
        
        // Wyświetlenie właściwości prostokąta
        System.out.println("Właściwości prostokąta:");
        System.out.println("Długość: " + rectangle.getLength());
        System.out.println("Szerokość: " + rectangle.getWidth());
        System.out.println("Pole prostokąta: " + rectangle.calculateArea());
        System.out.println("Obwód prostokąta: " + rectangle.calculatePerimeter());
    }
}
