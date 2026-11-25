import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ler entradas
        String cardNumber = scanner.nextLine();  // Últimos 4 dígitos
        String email = scanner.nextLine();       // E-mail do PayPal
        double amount = scanner.nextDouble();    // Valor do pagamento
        
        // TODO: Crie um PaymentProcessor
        PaymentProcessor processor = new PaymentProcessor();
        
        // TODO: Crie um CreditCard com o cardNumber
        CreditCard creditCard = new CreditCard(cardNumber);
        
        // TODO: Crie uma conta PayPal com o email
        PayPal payPal = new PayPal(email);
        
        // TODO: Processe o pagamento com CreditCard e imprima o resultado
        System.out.println(processor.processPayment(creditCard, amount));
        
        // TODO: Processe o pagamento com PayPal e imprima o resultado
        System.out.println(processor.processPayment(payPal, amount));
    }
}
