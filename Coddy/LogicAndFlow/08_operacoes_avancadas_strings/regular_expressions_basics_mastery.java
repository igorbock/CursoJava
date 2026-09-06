// Crie um método chamado validatePassword que recebe uma String (password) e a valida de acordo com as seguintes regras:

// Deve ter entre 8 e 20 caracteres de comprimento
// Deve conter pelo menos:
// Uma letra maiúscula (A-Z)
// Uma letra minúscula (a-z)
// Um dígito (0-9)
// Um caractere especial de (@#$%^&+=)
// Não deve conter espaços
// Além disso, crie um segundo método chamado getPasswordStrength que recebe a mesma senha e retorna:

// "Weak" se atender apenas aos requisitos mínimos
// "Medium" se tiver mais de 12 caracteres e pelo menos 2 caracteres especiais
// "Strong" se tiver mais de 16 caracteres e pelo menos 3 caracteres especiais
// As mensagens de retorno para validatePassword devem ser:

// Se password for null: retorne "Invalid input"
// Se a validação passar: retorne "Valid"
// Se a validação falhar: retorne o motivo específico ("Too short", "No uppercase", "No lowercase", "No digit", "No special character", "Contains space")

import java.util.Scanner;

public class regular_expressions_basics_mastery {
    public static String validatePassword(String password) {
        // Escreva seu código aqui
        
    }
    
    public static String getPasswordStrength(String password) {
        // Escreva seu código aqui
    }c
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        
        if (password.equals("null")) password = null;
        
        String validation = validatePassword(password);
        System.out.println(validation);
        
        if (validation.equals("Valid")) {
            System.out.println(getPasswordStrength(password));
        }
    }
}
