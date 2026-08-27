// Neste desafio, você aplicará seu conhecimento de lançamento de exceções para validar um salário com base em certas regras.

// Crie um método chamado validateSalary que recebe dois argumentos:

// Um inteiro (salary) representando o salário de uma pessoa
// Um booleano (strict) que determina regras de validação adicionais
// O método deve lançar exceções com base nessas regras:

// Se salary for negativo, lance uma IllegalArgumentException com a mensagem:

// Salary cannot be negative

// Se salary for acima de 1.000.000, lance uma IllegalArgumentException com a mensagem:

// Salary cannot be greater than 1000000

// Se strict for true e salary for 0, lance uma IllegalArgumentException com a mensagem:

// Salary cannot be zero in strict mode

// Se nenhuma exceção for lançada, retorne o salário como uma string.

import java.util.Scanner;

public class throwing_exceptions_mastery {
    public static String validateSalary(int salary, boolean strict) {
        // Escreva seu código aqui
        if (salary < 0) {
            throw new IllegalArgumentException("Salary cannot be negative");
        }
        if (salary > 1000000) {
            throw new IllegalArgumentException("Salary cannot be greater than 1000000");
        }
        if (strict && salary == 0) {
            throw new IllegalArgumentException("Salary cannot be zero in strict mode");
        }

        return "" + salary + "";
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int salary = Integer.parseInt(scanner.nextLine());
        boolean strict = Boolean.parseBoolean(scanner.nextLine());
        
        try {
            System.out.println(validateSalary(salary, strict));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
