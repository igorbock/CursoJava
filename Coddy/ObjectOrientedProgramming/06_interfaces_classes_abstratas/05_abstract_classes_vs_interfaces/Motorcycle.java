// Motorcycle estende Vehicle mas NÃO implementa Convertible
// (motocicletas não têm tetos para converter!)
class Motorcycle extends Vehicle {
    // TODO: Declare o campo hasSidecar (boolean)
    private boolean hasSidecar;
    
    // TODO: Crie o construtor que recebe brand, year e hasSidecar
    // Use super() para inicializar os campos herdados
    public Motorcycle(String brand, int year, boolean hasSidecar) {
        super(brand, year);
        this.hasSidecar = hasSidecar;
    }
    
    // TODO: Implement startEngine() to return: [brand] motorcycle engine roaring
    public String startEngine() {
        return super.brand + " motorcycle engine roaring";
    }
}
