import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ler entradas
        String name = scanner.nextLine();
        double price = scanner.nextDouble();
        int warrantyYears = scanner.nextInt();
        
        // TODO: Criar um objeto Electronics usando todos os três parâmetros
        Electronics electronics = new Electronics(name, price, warrantyYears);
        
        // TODO: Imprimir o resultado de getDetails()
        System.out.println(electronics.getDetails());
    }
}
