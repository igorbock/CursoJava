// Crie um método chamado getElement que recebe três argumentos:

// Um array 2D de inteiros chamado matrix.
// Um inteiro rowIndex representando o índice da linha.
// Um inteiro colIndex representando o índice da coluna.
// O método deve retornar o elemento na linha e coluna especificadas na matrix. 
// Se o rowIndex ou colIndex estiver fora dos limites (ou seja, menor que 0 ou maior ou 
// igual ao número de linhas ou colunas), o método deve retornar -1.

public class accessing_2d_array_elements {
    public static int getElement(int[][] matrix, int rowIndex, int colIndex) {
        // Escreva seu código aqui
        int numRows = matrix.length;
        int numCols = matrix[0].length;
        if (rowIndex < 0 || colIndex < 0 || rowIndex >= numRows || colIndex >= numCols){
            return -1;
        }
        return matrix[rowIndex][colIndex];
    }
}
