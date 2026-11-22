// TODO: Crie a classe EmailMessenger que implementa Messenger
// 1. Adicione um campo String chamado 'recipient'
// 2. Crie um construtor que inicializa o recipient
// 3. Implemente sendMessage() para imprimir: "Email to [recipient]: [message]"
// 4. Esta classe usa o método padrão sendWithTimestamp() como está (não é necessário sobrescrever)

class EmailMessenger implements Messenger {
    // TODO: Adicione o campo recipient
    private String recipient;
    
    // TODO: Crie o construtor
    public EmailMessenger(String recipient) {
        this.recipient = recipient;
    }
    
    // TODO: Implemente o método sendMessage
    public void sendMessage(String message) {
        System.out.println("Email to " + this.recipient + ": " + message);
    }
}
