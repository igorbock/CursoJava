import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ler entradas
        String emailRecipient = scanner.nextLine();
        String phoneNumber = scanner.nextLine();
        String message = scanner.nextLine();
        
        // TODO: Use Messenger.formatMessage() para formatar a mensagem e armazená-la
        String formatMessage = Messenger.formatMessage(message);

        // TODO: Crie um EmailMessenger com o destinatário do e-mail
        Messenger email = new EmailMessenger(emailRecipient);
        
        // TODO: Crie um SMSMessenger com o número de telefone
        Messenger sms = new SMSMessenger(phoneNumber);
        
        // TODO: Chame sendWithTimestamp() no EmailMessenger com a mensagem formatada
        email.sendWithTimestamp(formatMessage);
        
        // TODO: Chame sendWithTimestamp() no SMSMessenger com a mensagem formatada
        sms.sendWithTimestamp(formatMessage);
    }
}
