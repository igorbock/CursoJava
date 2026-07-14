public class nested_loops_with_2d_arrays {
    public static void printMatrix(int[][] matrix) {
        // Escreva seu código aqui
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%d ", matrix[i][j]);
                if (j == matrix[i].length - 1) {
                    System.out.print(" ");
                    System.out.println();
                } else {
                    System.out.print(" ");
                }
            }
        }
    }
}
