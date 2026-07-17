// Crie um método chamado createJaggedArray que recebe um inteiro n como entrada e retorna um array 
// irregular de inteiros. O array irregular deve ter a seguinte estrutura:

// A primeira linha deve ter 1 elemento.
// A segunda linha deve ter 2 elementos.
// A terceira linha deve ter 3 elementos.
// E assim por diante, até a linha n, que deve ter n elementos.
// Inicialize cada elemento do array com o produto de seus índices de linha e coluna (começando de 1). 
// Por exemplo, o elemento na segunda linha e primeira coluna deve ter o valor 2 * 1 = 2.

// Escreva seu código apenas dentro da classe. Não escreva main() ou qualquer código fora desta classe.
public class jagged_arrays {
    public static int[][] createJaggedArray(int n) {
        // Escreva seu código aqui
        int[][] jaggedArray = new int[n][];

        for (int i = 0; i < jaggedArray.length; i++) {
            jaggedArray[i] = new int[i + 1];
            for (int j = 0; j < jaggedArray[i].length; j++) {
                jaggedArray[i][j] = (i + 1) * (j + 1);
            }
        }

        return jaggedArray;
    }
}
