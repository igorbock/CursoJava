import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Lê a senha a ser definida
        String passwordToSet = scanner.nextLine();
        // Lê a tentativa de senha para verificar
        String passwordAttempt = scanner.nextLine();
        
        // TODO: Create a Password object com comprimento mínimo de 6
        Password password = new Password(6);
        
        // TODO: Defina a senha e imprima o resultado ("Set: true" ou "Set: false")
        boolean result = password.setPassword(passwordToSet);
        System.out.println("Set: " + result);
        
        // TODO: Imprima a senha mascarada ("Masked: ******")
        String mask = password.getMaskedPassword();
        System.out.println("Masked: " + mask);
        
        // TODO: Verifique a tentativa de senha e imprima o resultado ("Match: true" ou "Match: false")
        boolean passResult = password.checkPassword(passwordAttempt);
        System.out.println("Match: " + passResult);
    }
}
