import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ler as entradas
        String brand = scanner.nextLine();
        int wheels = scanner.nextInt();
        scanner.nextLine(); // consome a quebra de linha
        String model = scanner.nextLine();
        
        // TODO: Criar um objeto Car com os valores de entrada
        Car car = new Car(brand, wheels, model);
        
        // TODO: Chamar move() - herdado de Vehicle (avô)
        car.move();
        
        // TODO: Chamar honk() - herdado de LandVehicle (pai)
        car.honk();
        
        // TODO: Chamar displayInfo() - definido no próprio Car
        car.displayInfo();
    }
}
