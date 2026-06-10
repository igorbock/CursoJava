// Você está criando um gerador simples de tabela de multiplicação. O programa deve imprimir os múltiplos de um 
// snúmero em um formato específico.

// Requisitos:

// Imprima os múltiplos de 7 de 1 a 12 neste formato:

// 7 x 1 = 7
// 7 x 2 = 14
// 7 x 3 = 21
// ...
// 7 x 12 = 84
// Após a tabela, imprima a soma de todos os resultados (7 + 14 + 21 + ... + 84)
// Use um laço for para gerar a tabela
// Use espaçamento e formatação adequados

public class for_loop_part_1_mastery {
    public static void main(String[] args) {
        // Initialize variables
        int number = 7;
        int sum = 0;
        
        System.out.println("Multiplication Table for " + number);
        System.out.println("---------------------------");
        
        // Write your for loop here
        for (int i = 1; i <= 12; i++) {
            int product = number * i;
            sum += product;
            System.out.printf("%d x %d = %d\n", number, i, product);
        }
        
        System.out.println("---------------------------");
        System.out.println("Sum of all results: " + sum);
    }
}
