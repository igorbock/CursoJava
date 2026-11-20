import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ler entradas
        String brand = scanner.nextLine();
        int volumeLevel = scanner.nextInt();
        
        // TODO: Crie uma SmartTV com a marca fornecida
        SmartTV smartTV = new SmartTV(brand);

        // TODO: Chame powerOn()
        smartTV.powerOn();
        
        // TODO: Chame setVolume() com o nível fornecido
        smartTV.setVolume(volumeLevel);
        
        // TODO: Print: Current volume: [volume] using getVolume()
        System.out.println("Current volume: " + smartTV.getVolume());
        
        // TODO: Chame powerOff()
        smartTV.powerOff();
    }
}
