// Crie um método chamado arrayOperations que recebe um array 2D de inteiros (matrix) como entrada e realiza as seguintes operações:

// Calcule a soma de todos os elementos na matriz.
// Encontre o elemento máximo na matriz.
// Crie um novo array 1D que contém as somas de cada linha na matriz.
// Imprima no console usando o seguinte formato:
// Sum: 78
// Maximum: 12
// Row Sums: [10, 26, 42]

import java.util.Arrays;

public class recap__all_about_arrays {
    public static void arrayOperations(int[][] matrix) {
        int sum = 0;
        int max = -9999999;
        int[] rowSums = new int[matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                int element = matrix[i][j];
                sum += element;
                rowSum += element;
                if (element > max) {
                    max = element;
                }
            }
            rowSums[i] = rowSum;
        }
        
        System.out.println("Sum: " + sum);
        System.out.println("Maximum: " + max);
        System.out.println("Row Sums: " + Arrays.toString(rowSums));
    }
}
