import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ler as entradas
        String brand = scanner.nextLine();
        int wattage = scanner.nextInt();
        int capacity = scanner.nextInt();
        
        // TODO: Criar um objeto WashingMachine com os valores de entrada
        WashingMachine wash = new WashingMachine(brand, wattage, capacity);
        
        // TODO: Imprimir o resultado da chamada de getInfo() na máquina de lavar
        System.out.println(wash.getInfo());
    }
}
