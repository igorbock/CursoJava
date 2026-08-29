import java.util.Scanner;

class EmailException extends Exception {
    public EmailException(String message) {
        super(message);
    }
}


public class custom_exceptions {
    public static String validateEmail(String email) throws EmailException {
        // Escreva seu código aqui
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String email = scanner.nextLine();
        if (email.equals("null")) {
            email = null;
        }
        
        try {
            System.out.println(validateEmail(email));
        } catch (EmailException e) {
            System.out.println(e.getMessage());
        }
    }
}
