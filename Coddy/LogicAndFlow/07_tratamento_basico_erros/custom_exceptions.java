// Crie uma classe de exceção personalizada chamada EmailException e um método chamado validateEmail que recebe um argumento:

// Uma String (email) para validar
// O método deve lançar sua exceção personalizada com estas mensagens:

// Se email for null: "Email cannot be null"
// Se email estiver vazio: "Email cannot be empty"
// Se email não contiver @: "Email must contain @"
// Se email não contiver texto antes de @: "Email must have a local part"
// Se a validação passar: retorne "Valid email"

import java.util.Scanner;

class EmailException extends Exception {
    public EmailException(String message) {
        super(message);
    }
}


public class custom_exceptions {
    public static String validateEmail(String email) throws EmailException {
        // Escreva seu código aqui
        try {
            if (email == null) {
                throw new EmailException("Email cannot be null");
            }
            if (email == "") {
                throw new EmailException("Email cannot be empty");
            }
            if (!email.contains("@")) {
                throw new EmailException("Email must contain @");
            }
            int atIndex = email.indexOf('@');
            if (atIndex == 0) {
                return "Email must have a local part";
            }
            return "Valid email";
        } catch(EmailException e) {
            return e.getMessage();
        }
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
