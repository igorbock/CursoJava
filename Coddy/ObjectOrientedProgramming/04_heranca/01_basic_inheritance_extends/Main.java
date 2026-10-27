import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String brand = scanner.nextLine();
        
        // TODO: Crie um objeto Motorcycle com a brand
        Motorcycle moto = new Motorcycle(brand);

        // TODO: Chame o método start() herdado
        moto.start();
        
        // TODO: Chame o método wheelie()
        moto.wheelie();
    }
}
