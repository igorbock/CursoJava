// Car extends Vehicle (relacionamento IS-A) e implements Convertible (capacidade CAN-DO)
class Car extends Vehicle implements Convertible {
    // TODO: Declare o campo numDoors (int)
    private int numDoors;

    // TODO: Crie o construtor que recebe brand, year e numDoors
    // Use super() para inicializar os campos herdados
    public Car(String brand, int year, int numDoors) {
        super(brand, year);
        this.numDoors = numDoors;
    }
    
    // TODO: Implement startEngine() to return: [brand] car engine started
    public String startEngine() {
        return super.brand + " car engine started";
    }
    
    // TODO: Implement openRoof() to return: [brand] roof opening
    public String openRoof() {
        return super.brand + " roof opening";
    }
    
    // TODO: Implement closeRoof() to return: [brand] roof closing
    public String closeRoof() {
        return super.brand + " roof closing";
    }
}
