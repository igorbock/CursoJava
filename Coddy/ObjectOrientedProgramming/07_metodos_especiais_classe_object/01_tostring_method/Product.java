class Product {
    // TODO: Declare três campos privados:
    // - name (String)
    // - price (double)
    // - quantity (int)
    private String name;
    private double price;
    private int quantity;
    
    // TODO: Crie um construtor que inicialize todos os três campos
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    
    // TODO: Sobrescreva o método toString()
    // Formato de retorno: Product[name=X, price=Y, quantity=Z]
    // onde X, Y, Z são os valores reais dos campos
    @Override
    public String toString() {
        return "Product[name=" + this.name + ", price=" + this.price + ", quantity=" + this.quantity + "]";
    }
}
