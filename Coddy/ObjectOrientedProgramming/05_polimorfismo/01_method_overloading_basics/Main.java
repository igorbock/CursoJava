import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ler as entradas
        String message = scanner.nextLine();
        int repeatCount = Integer.parseInt(scanner.nextLine());
        String prefix = scanner.nextLine();
        String suffix = scanner.nextLine();
        
        // TODO: Criar um objeto MessageFormatter
        MessageFormatter formatter = new MessageFormatter();
        
        // TODO: Chamar format apenas com message e imprimir o resultado
        System.out.println(formatter.format(message));
        
        // TODO: Chamar format com message e repeatCount e imprimir o resultado
        System.out.println(formatter.format(message, repeatCount));
        
        // TODO: Chamar format com message e prefix e imprimir o resultado
        System.out.println(formatter.format(message, prefix));
        
        // TODO: Chamar format com message, prefix, e suffix e imprimir o resultado
        System.out.println(formatter.format(message, prefix, suffix));
        
    }
}
