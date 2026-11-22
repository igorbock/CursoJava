// TODO: Crie a classe SMSMessenger que implementa Messenger
// 1. Adicione um campo String chamado 'phoneNumber'
// 2. Crie um construtor que inicializa o número de telefone
// 3. Implemente sendMessage() para imprimir: "SMS to [phoneNumber]: [message]"
// 4. Sobrescreva sendWithTimestamp() para imprimir: "[URGENT] " e então chame sendMessage(message)

class SMSMessenger implements Messenger {
    // TODO: Adicione o campo phoneNumber
    private String phoneNumber;
    
    // TODO: Crie o construtor
    public SMSMessenger(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    // TODO: Implemente o método sendMessage
    public void sendMessage(String message) {
        System.out.println("SMS to " + this.phoneNumber + ": " + message);
    }
    
    // TODO: Sobrescreva o método sendWithTimestamp com comportamento personalizado
    @Override
    public void sendWithTimestamp(String message) {
        System.out.print("[URGENT] ");
        sendMessage(message);
    }
}
