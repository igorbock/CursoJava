// Classe de notificação por e-mail que estende Notification
class EmailNotification extends Notification {
    // TODO: Adicione o campo subject (String)
    private String subject;

    // TODO: Crie um construtor que receba recipient e subject
    // Use super() para inicializar a classe pai
    public EmailNotification(String recipient, String subject) {
        super(recipient);
        this.subject = subject;
    }
    
    // TODO: Sobrescreva o método send() para imprimir:
    // "Emailing [recipient]: [subject]"
    @Override
    public void send() {
        System.out.println("Emailing " + super.getRecipient() + ": " + subject);
    }
}
