// Classe base no topo da hierarquia
public class Vehicle {
    // TODO: Adicionar campo privado para brand (String)
    private String brand;

    // TODO: Criar construtor que aceita brand
    public Vehicle(String brand) {
        this.brand = brand;
    }
    
    // TODO: Criar método getBrand() que retorna a brand
    public String getBrand() {
        return brand;
    }
    
    // TODO: Criar método move() que imprime: [brand] is moving
    public void move() {
        System.out.println(brand + " is moving");
    }
}
