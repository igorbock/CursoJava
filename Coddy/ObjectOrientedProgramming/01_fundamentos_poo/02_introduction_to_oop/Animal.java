public class Animal {
    // TODO: Crie um campo String chamado 'name'
    String name;

    // TODO: Crie um construtor que recebe um parâmetro String name e o atribui
    public Animal(String name) {
        this.name = name;
    }
    
    // TODO: Crie um método chamado makeSound() que retorna uma String: "<name> makes a sound!"
    public String makeSound(){
        return this.name + " makes a sound!";
    }
}
