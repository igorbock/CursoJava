public class Book {
    private String title;
    private String author;
    private int pages;
    
    // TODO: Crie um construtor que recebe title, author e pages
    // Use a palavra-chave 'this' para atribuir cada parâmetro ao seu campo
    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }
    
    // TODO: Crie o getter getTitle()
    public String getTitle() {
        return title;
    }
    
    // TODO: Crie o getter getAuthor()
    public String getAuthor() {
        return author;
    }
    
    // TODO: Crie o getter getPages()
    public int getPages() {
        return pages;
    }
    
    // TODO: Crie o método getSummary() que retorna:
    // "<title> by <author> (<pages> pages)"
    public String getSummary() {
        return title + " by " + author + " (" + pages + " pages)";
    }
}