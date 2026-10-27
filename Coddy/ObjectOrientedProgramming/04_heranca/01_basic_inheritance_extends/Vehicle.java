// TODO: Criar a classe Vehicle
// Esta é a classe pai para todos os veículos

class Vehicle {
    // TODO: Declarar um campo privado para brand (String)
    private String brand;
    
    // TODO: Criar um construtor que aceite o nome da brand
    public Vehicle(String brand) {
        this.brand = brand;
    }
    
    // TODO: Criar um método getBrand() que retorne a brand
    public String getBrand() {
        return this.brand;
    }
    
    // TODO: Criar um método start() que imprima: [brand] is starting
    public void start() {
        System.out.println(this.brand + " is starting");
    }
}
