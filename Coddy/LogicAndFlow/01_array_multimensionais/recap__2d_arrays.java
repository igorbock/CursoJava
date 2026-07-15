// Crie um método chamado processMatrix que recebe um array bidimensional de inteiros como argumento e realiza as 
// seguintes operações:

// Encontre a soma de todos os elementos na matriz.
// Encontre o elemento máximo na matriz.
// Conte o número de elementos pares na matriz.
// O método deve retornar um array contendo a soma, o elemento máximo e a contagem de elementos pares, nessa ordem.

// Escreva seu código apenas dentro da classe. Não escreva main() ou qualquer código fora desta classe.
public class recap__2d_arrays {
    public static int[] processMatrix(int[][] matrix) {
        // Escreva seu código aqui
        int sum = 0;
        int major = -999;
        int pairs = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int actual = matrix[i][j];
                sum += actual;
                if (actual > major) {
                    major = actual;
                }
                if (actual % 2 == 0) {
                    pairs += 1;
                }
            }
        }

        return new int[] {sum, major, pairs};
    }
}
