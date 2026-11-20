// TODO: Crie uma classe Robot que implementa a interface Speaker

class Robot implements Speaker {
    // TODO: Adicione um campo privado para model (String)
    private String model;
    
    // TODO: Crie um construtor que recebe um parâmetro model
    public Robot(String model) {
        this.model = model;
    }

    // TODO: Implemente o método speak()
    // It should return: "Robot [model] says: Beep boop!"
    @Override
    public String speak() {
        return "Robot " + this.model + " says: Beep boop!";
    }
}
