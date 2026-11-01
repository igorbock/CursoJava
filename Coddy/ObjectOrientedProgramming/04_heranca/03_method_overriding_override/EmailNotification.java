// Subclass that extends Notification for email-specific behavior
class EmailNotification extends Notification {
    // TODO: Adicione campo privado para o endereço de e-mail do destinatário
    private String recipient;

    // TODO: Crie o construtor que recebe message e recipient
    // Dica: Use super(message) para chamar o construtor da classe pai
    public EmailNotification(String recipient, String message) {
        super(message);
        this.recipient = recipient;
    }
    
    // TODO: Sobrescreva o método send() usando a anotação @Override
    // Deve imprimir: Emailing [recipient]: [message]
    @Override
    public void send() {
        System.out.println("Emailing " + this.recipient + ": " + super.getMessage());
    }
}
