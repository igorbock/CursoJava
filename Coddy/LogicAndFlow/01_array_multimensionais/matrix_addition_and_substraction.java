// Crie um método chamado subMatrices que recebe dois arrays 2D (matrizes) como entrada e retorna a 
// diferença deles como um novo array 2D.

// Escreva seu código apenas dentro da classe. Não escreva main() ou qualquer código fora desta classe.
public class matrix_addition_and_substraction {
    public static int[][] subMatrices(int[][] matrix1, int[][] matrix2) {
        // Escreva seu código aqui
        int var1 = matrix1.length;
        int var2 = matrix1[0].length;
        int[][] matrix3 = new int[var1][var2];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrix3[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return matrix3;
    }
}
