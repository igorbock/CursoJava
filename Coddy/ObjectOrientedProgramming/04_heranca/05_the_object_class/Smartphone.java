// TODO: Crie a classe Smartphone que estende Gadget
// Esta classe deve ter:
// - Um campo privado: brand (String)
// - Um construtor que recebe name, year e brand
//   (use super(name, year) para chamar o construtor pai)
// - Um método getter: getBrand()
// - Sobrescrever toString() para retornar: "Smartphone: [brand] [name] ([year])"

class Smartphone extends Gadget {
    // TODO: Declare o campo privado para brand
    private String brand;

    // TODO: Crie o construtor usando super() para os campos pai
    public Smartphone(String name, int year, String brand) {
        super(name, year);
        this.brand = brand;
    }

    // TODO: Crie o método getBrand()
    public String getBrand() {
        return this.brand;
    }

    // TODO: Sobrescreva o método toString()
    @Override
    public String toString() {
        return "Smartphone: " + this.brand + " " + this.getName() + " (" + this.getYear() + ")";
    }

}
