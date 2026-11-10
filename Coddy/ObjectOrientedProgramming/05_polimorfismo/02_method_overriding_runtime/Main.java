import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ler as entradas
        String recipient = scanner.nextLine();
        String subject = scanner.nextLine();
        String phoneNumber = scanner.nextLine();
        
        // TODO: Criar um array de referências Notification com 3 elementos
        // O array deve conter (nesta ordem):
        Notification[] notifications = new Notification[3];
        // 1. Um objeto Notification base
        notifications[0] = new Notification(recipient);
        // 2. Um objeto EmailNotification
        notifications[1] = new EmailNotification(recipient, subject);
        // 3. Um objeto SMSNotification
        notifications[2] = new SMSNotification(recipient, phoneNumber);
        // Todos usando o mesmo recipient
        
        // TODO: Percorrer o array e chamar send() em cada elemento
        // Isso demonstra o polimorfismo em tempo de execução!
        for (Notification notification : notifications) {
            notification.send();
        }
    }
}
