// Classe concreta que estende Appliance
class Microwave extends Appliance {
    // TODO: Declare um campo privado para power (int) representando a porcentagem do nível de potência
    private int power;

    // TODO: Crie um construtor que receba brand, wattage e power
    // Use super() para inicializar os campos da classe pai
    public Microwave(String brand, int wattage, int power) {
        super(brand, wattage);
        this.power = power;
    }
    
    // TODO: Implemente o método operate() para imprimir:
    // "[brand] microwave is heating at [power]% power"
    @Override
    public void operate() {
        System.out.println(super.getBrand() + " microwave is heating at " + this.power + "% power");
    }
}
