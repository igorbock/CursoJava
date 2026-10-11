public class Product {
    private String name;
    private double price;
    private int stock;
    
    // TODO: Criar um construtor com 3 parâmetros: name, price, stock
    // Inicializar todos os campos usando 'this'
    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
    
    // TODO: Criar um construtor com 2 parâmetros: name, price
    // Usar this() para chamar o construtor de 3 parâmetros com stock = 0
    public Product(String name, double price) {
        this(name, price, 0);
    }
    
    // TODO: Criar um construtor padrão sem parâmetros
    // Usar this() para chamar o construtor de 2 parâmetros com name = "Unknown" e price = 0
    public Product() {
        this("Unknown", 0);
    }
    
    public String getName() { return this.name; }
    public double getPrice() { return this.price; }
    public int getStock() { return this.stock; }
}