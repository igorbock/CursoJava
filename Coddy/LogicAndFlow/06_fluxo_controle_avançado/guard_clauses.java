// Crie um método chamado validatePassword que recebe um argumento:

// Uma String (password) para validar
// O método deve usar guard clauses para validar a senha e retornar uma string de mensagem baseada nestas regras:

// Se a senha for null: retorne "Password cannot be null"
// Se a senha estiver vazia: retorne "Password cannot be empty"
// Se o comprimento da senha for menor que 8: retorne "Password must be at least 8 characters"
// Se a senha contiver espaços: retorne "Password cannot contain spaces"
// Se todas as verificações passarem: retorne "Valid password"

import java.util.Scanner;

public class guard_clauses {
    public static String validatePassword(String password) {
        // Escreva seu código aqui
        if (password == null) return "Password cannot be null";
        if (password.isEmpty()) return "Password cannot be empty";
        if (password.length() < 8) return "Password must be at least 8 characters";
        if (password.contains(" ")) return "Password cannot contain spaces";
        return "Valid password"; 
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        if (password.equals("null")) {
            password = null;
        }
        System.out.println(validatePassword(password));
    }
}
