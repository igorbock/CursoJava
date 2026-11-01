// Electronics.java - Subclasse de Product com informações de garantia

class Electronics extends Product {
    // TODO: Declare um campo privado para warrantyYears (int)
    private int warrantyYears;

    // TODO: Crie o construtor principal que recebe name, price e warrantyYears
    // - Chame super(name, price) para inicializar o pai
    // - Defina o campo warrantyYears
    // - Imprima: "Electronics constructor: [warrantyYears] year warranty"
    public Electronics(String name, double price, int warrantyYears) {
        super(name, price);
        this.warrantyYears = warrantyYears;
        System.out.println("Electronics constructor: " + this.warrantyYears + " year warranty");
    }
    
    // TODO: Crie um segundo construtor que recebe name e price
    // - Encadeie para o construtor principal com this(name, price, 1) para garantia padrão de 1 ano
    public Electronics(String name, double price) {
        this(name, price, 1);
    }

    // TODO: Crie um terceiro construtor que recebe apenas name
    // - Encadeie para o segundo construtor com this(name, 0.0)
    public Electronics(String name) {
        this(name, 0.0);
    }
    
    // TODO: Crie o método getDetails() que retorna:
    // "[name] - $[price] ([warrantyYears] year warranty)"
    // Use String.format("%.2f", price) para a formatação do preço
    public String getDetails() {
        return String.format("%s - $%.2f (%d year warranty)", getName(), getPrice(), this.warrantyYears);
    }
}
