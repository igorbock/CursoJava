// Classe base para todas as notificações
class Notification {
    // TODO: Adicione o campo recipient (String)
    private String recipient;

    // TODO: Crie um construtor que inicialize o recipient
    public Notification(String recipient) {
        this.recipient = recipient;
    }

    // TODO: Crie um método getter para recipient
    public String getRecipient() {
        return recipient;
    }

    // TODO: Crie um método send() que imprima:
    // "Sending notification to [recipient]"
    public void send() {
        System.out.println("Sending notification to " + recipient);
    }
}
