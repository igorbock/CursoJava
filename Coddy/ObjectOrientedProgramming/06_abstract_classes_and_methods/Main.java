import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ler as entradas
        String brand1 = scanner.nextLine();
        int wattage1 = scanner.nextInt();
        int capacity = scanner.nextInt();
        scanner.nextLine(); // consumir a quebra de linha
        String brand2 = scanner.nextLine();
        int power = scanner.nextInt();
        
        // TODO: Criar um objeto WashingMachine com brand1, wattage1 e capacity
        WashingMachine wash = new WashingMachine(brand1, wattage1, capacity);

        // TODO: Criar um objeto Microwave com brand2, wattage1 (ou a potência apropriada) e power
        Microwave micro = new Microwave(brand2, wattage1, power);
        
        // TODO: Criar um array de referências Appliance e armazenar ambos os objetos
        Appliance[] applies = {
            wash,
            micro
        };
        
        // TODO: Percorrer o array e para cada eletrodoméstico:
        // - Imprimir suas informações usando getInfo()
        // - Chamar operate()
        for (Appliance appli : applies) {
            System.out.println(appli.getInfo());
            appli.operate();
        }
    }
}
