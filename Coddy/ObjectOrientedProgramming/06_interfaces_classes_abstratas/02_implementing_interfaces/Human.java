// TODO: Crie uma classe Human que implementa a interface Speaker

class Human implements Speaker {
    // TODO: Adicione um campo privado para name (String)
    private String name;

    // TODO: Crie um construtor que recebe um parâmetro name
    public Human(String name) {
        this.name = name;
    }
    
    // TODO: Implemente o método speak()
    // It should return: "[name] says: Hello everyone!"
    @Override
    public String speak() {
        return this.name + " says: Hello everyone!";
    }
}
