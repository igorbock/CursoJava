import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ler entradas
        String carBrand = scanner.nextLine();
        int carYear = scanner.nextInt();
        scanner.nextLine(); // consumir nova linha
        String motorcycleBrand = scanner.nextLine();
        int motorcycleYear = scanner.nextInt();
        
        // TODO: Crie um Car com 4 portas
        Car car = new Car(carBrand, carYear, 4);
        
        // TODO: Crie uma Motorcycle sem sidecar (false)
        Motorcycle motorcycle = new Motorcycle(motorcycleBrand, motorcycleYear, false);
        
        // TODO: Imprima getInfo() para ambos os veículos (demonstra o comportamento compartilhado da classe abstrata)
        System.out.println(car.getInfo());
        System.out.println(motorcycle.getInfo());
        
        // TODO: Imprima startEngine() para ambos os veículos (demonstra implementações diferentes)
        System.out.println(car.startEngine());
        System.out.println(motorcycle.startEngine());
        
        // TODO: Imprima openRoof() e closeRoof() apenas para o carro (demonstra a capacidade da interface)
        System.out.println(car.openRoof());
        System.out.println(car.closeRoof());
    }
}
