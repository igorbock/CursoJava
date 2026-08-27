// Crie um método chamado validateAge que recebe dois argumentos:

// Um inteiro (age) para validar
// Um booleano (strict) que determina as regras de validação
// O método deve lançar exceções com base nessas regras:

// Se age for negativo: lance IllegalArgumentException com a mensagem "Age cannot be negative"
// Se age for maior que 150: lance IllegalArgumentException com a mensagem "Age cannot be greater than 150"
// Se strict for true e age for 0: lance IllegalArgumentException com a mensagem "Age cannot be zero in strict mode"
// Se nenhuma exceção for lançada: retorne age como uma string

import java.util.Scanner;

public class throwing_exceptions {
    public static String validateAge(int age, boolean strict) {
        // Escreva seu código aqui
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        if (age > 150) {
            throw new IllegalArgumentException("Age cannot be greater than 150");
        }
        if (strict && age == 0) {
            throw new IllegalArgumentException("Age cannot be zero in strict mode");
        }

        return "" + age + "";
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        boolean strict = Boolean.parseBoolean(scanner.nextLine());
        
        try {
            System.out.println(validateAge(age, strict));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
