import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ler as entradas
        String name = scanner.nextLine();
        int year = scanner.nextInt();
        scanner.nextLine(); // consumir a quebra de linha
        String brand = scanner.nextLine();
        
        // TODO: Criar um objeto Gadget com name e year
        Gadget gadget = new Gadget(name, year);

        // TODO: Criar um objeto Smartphone com name, year, e brand
        Smartphone smartphone = new Smartphone(name, year, brand);
        
        // TODO: Imprimir o nome da classe do gadget usando getClass().getSimpleName()
        System.out.println(gadget.getClass().getSimpleName());
        
        // TODO: Imprimir se o toString() do gadget contém "@" (true ou false)
        System.out.println(gadget.toString().contains("@"));

        // TODO: Imprimir o smartphone (usa o toString() sobrescrito)
        System.out.println(smartphone);

    }
}
