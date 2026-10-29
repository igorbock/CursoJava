// Classe pai que representa qualquer eletrodoméstico
class Appliance {
    // TODO: Declare campos privados para brand (String) e wattage (int)
    private String brand;
    private int wattage;

    // TODO: Crie um construtor que aceite brand e wattage e os inicialize
    public Appliance(String brand, int wattage) {
        this.brand = brand;
        this.wattage = wattage;
    }
    
    // TODO: Crie o método getBrand() que retorna a marca (brand)
    public String getBrand() {
        return this.brand;
    }
    
    // TODO: Crie o método getWattage() que retorna a potência (wattage)
    public int getWattage() {
        return this.wattage;
    }
    
    // TODO: Crie o método getInfo() que retorna: "[brand] - [wattage]W"
    public String getInfo() {
        return this.brand + " - " + this.wattage + "W"; 
    }
}
