// Parent class for generic notifications
class Notification {
    // TODO: Adicionar campo privado para a mensagem
    private String message;

    // TODO: Criar construtor que aceita a mensagem
    public Notification(String message) {
        this.message = message;
    }

    // TODO: Criar método getMessage() que retorna a mensagem
    public String getMessage() {
        return this.message;
    }
    
    // TODO: Create send() method that prints: Sending notification: [message]
    public void send() {
        System.out.println("Sending notification: " + this.message);
    }
}
