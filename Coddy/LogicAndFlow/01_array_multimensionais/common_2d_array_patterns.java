// Crie um método chamado printPatterns que recebe um array 2D quadrado de inteiros (matrix) como entrada e imprime os seguintes padrões:

// Diagonal Principal: Imprima todos os elementos onde o índice da linha é igual ao índice da coluna.
// Diagonal Secundária: Imprima todos os elementos onde a soma dos índices da linha e da coluna é igual ao tamanho da matriz menos 1.
// Bordas: Imprima os elementos das bordas superior, inferior, esquerda e direita da matriz.
// A saída deve ser assim:

// Main Diagonal: 1 6 11 16 
// Anti-Diagonal: 4 7 10 13 
// Top Border: 1 2 3 4 
// Bottom Border: 13 14 15 16 
// Left Border: 1 5 9 13 
// Right Border: 4 8 12 16

// Escreva seu código apenas dentro da classe. Não escreva main() ou qualquer código fora desta classe.
public class common_2d_array_patterns {
    public static void printPatterns(int[][] matrix) {
        // Escreva seu código aqui
        int size = matrix.length;

        System.out.print("Main Diagonal: ");
        for (int i = 0; i < size; i++) {
            System.out.print(matrix[i][i] + " ");
        }
        System.out.println();

        System.out.print("Anti-Diagonal: ");
        for (int i = 0; i < size; i++) {
            System.out.print(matrix[i][size - 1 - i] + " ");
        }
        System.out.println();

        System.out.print("Top Border: ");
        for (int j = 0; j < size; j++) {
            System.out.print(matrix[0][j] + " ");
        }
        System.out.println();

        System.out.print("Bottom Border: ");
        for (int j = 0; j < size; j++) {
            System.out.print(matrix[size - 1][j] + " ");
        }
        System.out.println();

        System.out.print("Left Border: ");
        for (int i = 0; i < size; i++) {
            System.out.print(matrix[i][0] + " ");
        }
        System.out.println();

        System.out.print("Right Border: ");
        for (int i = 0; i < size; i++) {
            System.out.print(matrix[i][size - 1] + " ");
        }
        System.out.println();
    }
}
