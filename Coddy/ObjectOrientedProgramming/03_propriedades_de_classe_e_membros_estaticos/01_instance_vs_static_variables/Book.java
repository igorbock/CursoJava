class Book {
    // TODO: Declare a variável de instância 'title' (String)
    private String title;

    // TODO: Declare a variável de instância 'price' (double)
    private double price;

    // TODO: Declare a variável estática 'totalBooks' (int) - compartilhada entre todos os objetos Book
    private static int totalBooks;
    
    // TODO: Crie o construtor que recebe title e price
    // Não se esqueça de incrementar totalBooks quando um novo livro for criado
    public Book(String title, double price) {
        this.title = title;
        this.price = price;
        totalBooks++;
    }
    
    // TODO: Crie o getter getTitle() que retorna o title
    public String getTitle() {
        return this.title;
    }
    
    // TODO: Crie o getter getPrice() que retorna o price
    public double getPrice() {
        return this.price;
    }
    
    // TODO: Crie o método estático getTotalBooks() que retorna o número total de livros
    public static int getTotalBooks() {
        return totalBooks;
    }
}
