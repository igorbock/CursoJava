// Crie um método matrixOperation que recebe:

// Duas matrizes 3x3
// Um operador String ("add", “subtract”)
// Retorna:
// Para "add": Nova matriz com a soma dos elementos
// Para "subtract": Nova matriz com a diferença dos elementos

public class matrix_addition_and_substraction_mastery {
    public static int[][] matrixOperation(int[][] matrix1, int[][] matrix2, String operator) {
        // Escreva seu código aqui
        int[][] matrix3 = new int[3][3];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                if (operator.equals("add")) {
                    matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
                } else {
                    matrix3[i][j] = matrix1[i][j] - matrix2[i][j];
                }
            }
        }
        return matrix3;
    }
}
