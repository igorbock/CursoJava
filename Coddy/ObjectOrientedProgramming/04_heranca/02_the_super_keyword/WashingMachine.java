// Classe filha que estende Appliance
class WashingMachine extends Appliance {
    // TODO: Declare um campo privado para capacity (int)
    private int capacity;

    // TODO: Crie um construtor que receba brand, wattage e capacity
    // Use super(brand, wattage) para chamar o construtor pai
    // Em seguida, inicialize o campo capacity
    public WashingMachine(String brand, int wattage, int capacity) {
        super(brand, wattage);
        this.capacity = capacity;
    }
    
    // TODO: Crie o método getCapacity() que retorna a capacity
    public int getCapacity() {
        return this.capacity;
    }

    // TODO: Sobrescreva o método getInfo()
    // Chame super.getInfo() para obter as informações do pai
    // Retorno: "[parent info], Capacity: [capacity]kg"
    public String getInfo() {
        String info = super.getInfo();
        return info + ", Capacity: " + this.capacity;
    }
}
