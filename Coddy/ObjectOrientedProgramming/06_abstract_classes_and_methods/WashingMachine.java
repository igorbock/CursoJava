// Classe concreta que estende Appliance
class WashingMachine extends Appliance {
    // TODO: Declare um campo privado para capacity (int) representando o tamanho da carga em kg
    private int capacity;

    // TODO: Crie um construtor que recebe brand, wattage e capacity
    // Use super() para inicializar os campos da classe pai
    public WashingMachine(String brand, int wattage, int capacity) {
        super(brand, wattage);
        this.capacity = capacity;
    }
    
    // TODO: Implemente o método operate() para imprimir:
    // "[brand] washing machine is washing [capacity]kg of clothes"
    @Override
    public void operate() {
        System.out.println(super.getBrand() + " washing machine is washing " + this.capacity + "kg of clothes");
    }
}
