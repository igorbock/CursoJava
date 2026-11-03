// Classe de nível inferior que estende LandVehicle
public class Car extends LandVehicle {
    // TODO: Adicione um campo privado para model (String)
    private String model;
    
    // TODO: Crie um construtor que receba brand, wheels e model
    // Lembre-se de usar super(brand, wheels) para a parte do pai
    public Car(String brand, int wheels, String model) {
        super(brand, wheels);
        this.model = model;
    }
    
    // TODO: Crie o método getModel() que retorna o model
    public String getModel() {
        return model;
    }
    
    // TODO: Crie o método displayInfo() que imprime: [brand] [model] with [wheels] wheels
    public void displayInfo() {
        System.out.println(getBrand() + " " + getModel() + " with " + getWheels() + " wheels");
    }
}

