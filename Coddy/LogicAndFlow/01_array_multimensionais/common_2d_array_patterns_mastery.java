// Neste desafio, você aplicará seu conhecimento de percorrimento diagonal e percorrimento de borda a um problema ligeiramente mais avançado.

// Crie um método chamado printAdvancedPatterns que recebe um array 2D quadrado de inteiros (matriz) como entrada e imprime os seguintes padrões:

// Ambas as Diagonais Juntas: Imprima tanto a diagonal principal quanto a anti-diagonal em um único percorrimento. Primeiro, imprima todos os elementos da diagonal principal (do canto superior esquerdo para o inferior direito), depois imprima os elementos da anti-diagonal (do canto superior direito para o inferior esquerdo). Se a matriz tiver tamanho ímpar, o elemento central pertence a ambas as diagonais — imprima-o apenas uma vez (como parte da diagonal principal).
// Travessia em Ordem Espiral: Imprima os elementos da matriz em ordem espiral começando do canto superior esquerdo.
// Entrada de Exemplo:
// int[][] matrix = {
//     { 1,  2,  3,  4 },
//     { 5,  6,  7,  8 },
//     { 9, 10, 11, 12 },
//     {13, 14, 15, 16 }
// };
// Saída Esperada:
// Both Diagonals: 1 6 11 16 4 7 10 13
// Spiral Order: 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
// Para uma matriz 3×3 (tamanho ímpar), o elemento central 5 é compartilhado por ambas as diagonais e é impresso apenas uma vez:

// // Input:
// // { 1, 2, 3 }
// // { 4, 5, 6 }
// // { 7, 8, 9 }

// Both Diagonals: 1 5 9 3 7
// Spiral Order: 1 2 3 6 9 8 7 4 5

public class common_2d_array_patterns_mastery {
    public static void printAdvancedPatterns(int[][] matrix) {
        int size = matrix.length;

        // Ambas as Diagonais
        System.out.print("Both Diagonals: ");
        StringBuilder diagonals = new StringBuilder();
        
        // Diagonal principal
        for (int i = 0; i < size; i++) {
            diagonals.append(matrix[i][i]).append(" ");
        }
        
        // Diagonal secundária
        for (int i = 0; i < size; i++) {
            if (i != size - 1 - i) {  // Evitar elemento central duplicado
                diagonals.append(matrix[i][size - 1 - i]).append(" ");
            }
        }
        
        // Remover espaço final
        if (diagonals.length() > 0) {
            diagonals.setLength(diagonals.length() - 1);
        }
        System.out.println(diagonals.toString());

        // Ordem em espiral
        System.out.print("Spiral Order: ");
        StringBuilder spiral = new StringBuilder();
        int top = 0, bottom = size - 1, left = 0, right = size - 1;
        
        while (top <= bottom && left <= right) {
            for (int j = left; j <= right; j++) {
                spiral.append(matrix[top][j]).append(" ");
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                spiral.append(matrix[i][right]).append(" ");
            }
            right--;

            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    spiral.append(matrix[bottom][j]).append(" ");
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    spiral.append(matrix[i][left]).append(" ");
                }
                left++;
            }
        }
        
        // Remover espaço final
        if (spiral.length() > 0) {
            spiral.setLength(spiral.length() - 1);
        }
        System.out.println(spiral.toString());
    }
}
