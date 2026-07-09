// Cada caso de teste tem uma entrada - um número ímpar inteiro.
// Sua tarefa é imprimir pirâmide n usando *, aqui estão alguns exemplos:

// 1 - pirâmide
// *
// 5 - pirâmide
// *
// ***
// *****
// 7 - pirâmide
// *
// ***
// *****
// *******
// Entrada
// inteiro ímpar n do usuário
// 1 <= n < 1000
// Dicas
// Tente começar pelos triângulos pequenos
// Verifique a dica se você estiver preso ;)
// n representa o número de  * na linha inferior

import java.util.Scanner;

public class number_pattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int rows = n / 2 + 1;
        for (int i = 0; i < rows; i++) {
            String stars = new String(new char[2 * (i + 1) - 1]).replace("\0", "*");
            System.out.println(stars);
        }
        scanner.close();
    }
}
