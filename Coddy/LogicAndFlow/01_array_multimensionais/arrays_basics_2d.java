// Inicialize um array 2D com o seguinte valor:

// 5, 7, 10, 24, 41
// 86, 13, 683, 64, 13
// 42, 46, 791, 111, 9
// 86, 88, 1845, 5, 15897
// 9, 1, 5, 5, 6

public class arrays_basics_2d {
    public static void main(String[] args) {
        int[][] matrix = {
            // Escreva seu código aqui
            {5, 7, 10, 24, 41},
            {86, 13, 683, 64, 13},
            {42, 46, 791, 111, 9},
            {86, 88, 1845, 5, 15897},
            {9, 1, 5, 5, 6}
        };
            
        
        // Imprime a matriz
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
