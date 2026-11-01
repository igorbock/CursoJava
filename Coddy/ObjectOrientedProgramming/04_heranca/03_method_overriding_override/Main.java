import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ler as entradas
        String message = scanner.nextLine();
        String recipient = scanner.nextLine();
        
        // TODO: Create a Notification object with the message
        Notification not = new Notification(message);
        
        // TODO: Create an EmailNotification object with the message and recipient
        EmailNotification emailNot = new EmailNotification(recipient, message);
        
        // TODO: Call send() on the Notification object
        not.send();
        
        // TODO: Call send() on the EmailNotification object
        emailNot.send();
    }
}
