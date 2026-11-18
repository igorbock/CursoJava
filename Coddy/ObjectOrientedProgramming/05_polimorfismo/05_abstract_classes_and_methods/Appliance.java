// Classe abstrata que serve como o modelo para todos os eletrodomésticos
abstract class Appliance {
    // TODO: Declare campos protegidos para brand (String) e wattage (int)
    protected String brand;
    protected int wattage;

    // TODO: Crie um construtor que inicialize ambos os campos
    public Appliance(String brand, int wattage) {
        this.brand = brand;
        this.wattage = wattage;
    }
    
    // TODO: Crie métodos getter para brand e wattage
    public String getBrand() {
        return this.brand;
    }

    public int getWattage() {
        return this.wattage;
    }
    
    // TODO: Crie um método getInfo() que retorna: "[brand] - [wattage]W"
    public String getInfo() {
        return this.brand + " - " + this.wattage + "W";
    }
    
    // TODO: Declare um método abstrato operate() que as subclasses devem implementar
    public abstract void operate();
}
