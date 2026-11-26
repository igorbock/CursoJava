import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ler entradas
        String name = scanner.nextLine();
        double price = scanner.nextDouble();
        int quantity = scanner.nextInt();
        
        // TODO: Crie um objeto Product com os valores de entrada
        Product product = new Product(name, price, quantity);

        // TODO: Imprima o objeto product diretamente
        // (Isso vai chamar automaticamente o seu método toString()!)
        System.out.println(product);
    }
}
