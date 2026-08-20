// Neste desafio, você aplicará seu conhecimento de cláusulas de guarda para validar um nome de usuário com regras mais estritas.

// Crie um método chamado validateUsername que recebe um argumento:

// Uma String (username) para validar
// O método deve usar cláusulas de guarda para validar o nome de usuário e retornar uma string de mensagem com base nessas regras:

// Se username for null, retorne: Username cannot be null
// Se username estiver vazio, retorne: Username cannot be empty
// Se o primeiro caractere não for uma letra, retorne: Username must start with a letter
// Se username contiver caracteres especiais (!@#$%^&*() etc.), retorne: Username cannot contain special characters
// Se o comprimento for menor que 5 ou maior que 15 caracteres, retorne: Username must be between 5 and 15 characters
// Se todas as verificações passarem, retorne: Valid username
// Métodos úteis que você precisará:

// Verificar se um caractere é uma letra:

// char c = 'A';
// if (Character.isLetter(c)) {
//     // c é uma letra (a-z ou A-Z)
// }
// Verificar se um caractere é uma letra ou dígito:

// char c = '5';
// if (Character.isLetterOrDigit(c)) {
//     // c é uma letra ou um número (a-z, A-Z, 0-9)
// }
// Acessar um caractere em uma posição específica:

// String text = "Hello";
// char firstChar = text.charAt(0);  // Obtém 'H'

import java.util.Scanner;

public class guard_clauses_mastery {
    public static String validateUsername(String username) {
        // Escreva seu código aqui usando cláusulas de guarda
        if (username == null) return "Username cannot be null";
        if (username.isEmpty()) return "Username cannot be empty";
        if (!Character.isLetter(username.charAt(0))) return "Username must start with a letter";
        if (username.matches(".*[!@#\\$%\\^&\\*()].*")) return "Username cannot contain special characters";
        if (username.length() < 5 || username.length() > 15) return "Username must be between 5 and 15 characters";
        return "Valid username";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        if (username.equals("null")) {
            username = null;
        }
        System.out.println(validateUsername(username));
    }
}
