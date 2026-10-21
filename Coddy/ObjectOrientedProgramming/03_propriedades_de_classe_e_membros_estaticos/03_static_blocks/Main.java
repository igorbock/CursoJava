import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int level = scanner.nextInt();
        
        // TODO: Acesse GameConfig para demonstrar a execução do bloco estático
        // Os blocos estáticos em GameConfig serão executados automaticamente quando você acessar a classe pela primeira vez
        GameConfig config = new GameConfig();
        
        // TODO: Imprima se a configuração está carregada
        // Formato: "Config loaded: true" ou "Config loaded: false"
        System.out.println("Config loaded: " + GameConfig.isConfigLoaded());
        
        // TODO: Imprima o nível máximo
        // Formato: "Max level: [maxLevel]"
        System.out.println("Max level: " + GameConfig.getMaxLevel());
        
        // TODO: Imprima o limite (threshold) para o nível de entrada
        // Formato: "Level [level] threshold: [threshold]"
        System.out.println("Level " + level + " threshold: " + GameConfig.getThreshold(level));
        
        // TODO: Imprima o limite (threshold) para o nível 1
        // Formato: "Level 1 threshold: [threshold]"
        System.out.println("Level 1 threshold: " + GameConfig.getThreshold(1));
    }
}
