// Classe de nível médio que estende Vehicle
public class LandVehicle extends Vehicle {
    // TODO: Adicionar campo privado para wheels (int)
    private int wheels;

    // TODO: Criar construtor que recebe brand e wheels
    // Lembre-se de usar super(brand) para a parte do pai
    public LandVehicle(String brand, int wheels) {
        super(brand);
        this.wheels = wheels;
    }
    
    // TODO: Criar o método getWheels() que retorna a contagem de rodas
    public int getWheels() {
        return wheels;
    }
    
    // TODO: Criar o método honk() que imprime: [brand] honks!
    public void honk() {
        System.out.println(getBrand() + " honks!");
    }
}
