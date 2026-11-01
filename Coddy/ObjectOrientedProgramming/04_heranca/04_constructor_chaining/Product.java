// Product.java - Classe pai para todos os produtos

class Product {
    // TODO: Declare campos privados para name (String) e price (double)
    private String name;
    private double price;

    // TODO: Crie o construtor principal que recebe name e price
    // - Inicialize os campos
    // - Imprima: "Product constructor: [name]"
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        System.out.println("Product constructor: " + this.name);
    }
    
    // TODO: Crie o segundo construtor que recebe apenas name
    // - Encadeie para o construtor principal usando this(name, 0.0)
    public Product(String name) {
        this(name, 0.0);
    }
    
    // TODO: Crie os métodos getter getName() e getPrice()
    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }
}
