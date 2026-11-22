// Classe abstrata - use quando classes compartilham estado E comportamento
abstract class Vehicle {
    // TODO: Declare os campos protected: brand (String) e year (int)
    protected String brand;
    protected int year;

    // TODO: Crie o construtor para inicializar brand e year
    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }
    
    // TODO: Crie os métodos getter para brand e year
    public String getBrand() {
        return this.brand;
    }
    public int getYear() {
        return this.year;
    }
    
    // TODO: Crie o método abstrato startEngine() que retorna String
    public abstract String startEngine();
    
    // TODO: Crie o método concreto getInfo() que retorna: [brand] ([year])
    public String getInfo() {
        return this.brand + " (" + this.year + ")";
    }
}
