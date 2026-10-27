// TODO: Crie a classe Motorcycle que estende Vehicle
// Isso demonstra a relação "is-a" (é um) - uma Motorcycle É UM Vehicle

class Motorcycle extends Vehicle {
    // TODO: Use a palavra-chave 'extends' para herdar de Vehicle
    
    // TODO: Crie um construtor que receba a brand
    // e a passe para a classe pai usando super(brand)
    public Motorcycle(String brand) {
        super(brand);
    }
    
    // TODO: Crie um método wheelie() que imprima: [brand] is doing a wheelie!
    // Dica: Use getBrand() para acessar o nome da marca
    public void wheelie() {
        System.out.println(getBrand() + " is doing a wheelie!");
    }
}
