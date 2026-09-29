import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String title1 = sc.nextLine();
        int pages1 = Integer.parseInt(sc.nextLine());
        String title2 = sc.nextLine();
        int pages2 = Integer.parseInt(sc.nextLine());
        Book book1 = new Book(title1, pages1);
        Book book2 = new Book(title2, pages2);
        Shelf shelf = new Shelf(book1, book2);
        System.out.println("Total pages: " + shelf.totalPages());
        System.out.println("Longest: " + shelf.longestTitle());
    }
}