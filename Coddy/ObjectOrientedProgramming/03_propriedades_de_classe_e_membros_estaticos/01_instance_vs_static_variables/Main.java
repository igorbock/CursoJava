import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Leia as entradas para três livros
        String title1 = scanner.nextLine();
        double price1 = Double.parseDouble(scanner.nextLine());
        String title2 = scanner.nextLine();
        double price2 = Double.parseDouble(scanner.nextLine());
        String title3 = scanner.nextLine();
        double price3 = Double.parseDouble(scanner.nextLine());
        
        // TODO: Crie três objetos Book usando as entradas acima
        Book book1 = new Book(title1, price1);
        Book book2 = new Book(title2, price2);
        Book book3 = new Book(title3, price3);
        
        // TODO: Imprima o título e o preço de cada livro no formato: [title]: $[price]
        // Use String.format("%.2f", price) para formatar o preço com 2 casas decimais
        System.out.println(book1.getTitle() + ": $" + String.format("%.2f", book1.getPrice()));
        System.out.println(book2.getTitle() + ": $" + String.format("%.2f", book2.getPrice()));
        System.out.println(book3.getTitle() + ": $" + String.format("%.2f", book3.getPrice()));
        
        // TODO: Imprima o número total de livros usando o método estático
        // Format: Total books: [count]
        // Lembre-se de acessar o método estático através do nome da classe: Book.getTotalBooks()
        System.out.println("Total books: " + Book.getTotalBooks());
    }
}
