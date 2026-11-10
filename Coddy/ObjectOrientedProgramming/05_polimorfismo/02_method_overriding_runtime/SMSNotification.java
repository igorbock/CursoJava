// Classe de notificação por SMS que estende Notification
class SMSNotification extends Notification {
    // TODO: Adicione o campo phoneNumber (String)
    private String phoneNumber;

    // TODO: Crie um construtor que receba recipient e phoneNumber
    // Use super() para inicializar a classe pai
    public SMSNotification(String recipient, String phoneNumber) {
        super(recipient);
        this.phoneNumber = phoneNumber;
    }
    
    // TODO: Sobrescreva o método send() para imprimir:
    // "Texting [phoneNumber] for [recipient]"
    @Override
    public void send() {
        System.out.println("Texting " + this.phoneNumber + " for " + super.getRecipient());
    }   
}
