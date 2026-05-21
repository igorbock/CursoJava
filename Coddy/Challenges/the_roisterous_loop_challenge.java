// Escreva um programa que obtenha uma entrada inteira do usuário, chamada limit. 
// O programa deve imprimir todos os números pares de 0 até (mas não incluindo) limit, 
// cada um em uma nova linha.

import java.util.Scanner;

public class the_roisterous_loop_challenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int limit = scanner.nextInt();
        // Write code here to print even numbers
        for (int i = 0; i < limit; i++) {
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
