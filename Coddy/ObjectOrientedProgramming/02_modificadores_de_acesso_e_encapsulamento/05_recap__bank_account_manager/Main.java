import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ler as entradas
        String accountNumber = scanner.nextLine();
        String ownerName = scanner.nextLine();
        double depositAmount = scanner.nextDouble();
        double withdrawAmount1 = scanner.nextDouble();
        double withdrawAmount2 = scanner.nextDouble();
        
        // TODO: Criar um objeto BankAccount com accountNumber e ownerName
        BankAccount account = new BankAccount(accountNumber, ownerName);

        // TODO: Realizar o depósito e imprimir o resultado como "Deposit: true" ou "Deposit: false"
        boolean result = account.setBalance(depositAmount);
        System.out.println("Deposit: " + result);

        // TODO: Realizar o primeiro saque e imprimir o resultado como "Withdraw 1: true" ou "Withdraw 1: false"
        result = account.withdraw(withdrawAmount1);
        System.out.println("Withdraw 1: " + result); 
        
        // TODO: Realizar o segundo saque e imprimir o resultado como "Withdraw 2: true" ou "Withdraw 2: false"
        result = account.withdraw(withdrawAmount2);
        System.out.println("Withdraw 2: " + result); 

        // TODO: Imprimir o resumo da conta
        String info = account.getAccountSummary();
        System.out.println(info); 
    }
}
