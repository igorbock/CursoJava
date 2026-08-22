// Neste desafio, você aplicará seu conhecimento de declarações rotuladas (break e continue com rótulos) para controlar o fluxo de iteração em um array 2D.

// Crie um método chamado skipNumber que recebe três argumentos:

// Um array 2D de inteiros (grid)
// Um inteiro (skipValue) que deve ser pulado ao iterar sobre o array
// Um booleano (skipRow)
// Se skipRow for true, toda a linha deve ser pulada quando skipValue for encontrado.
// Se skipRow for false, apenas o valor específico deve ser pulado (ou seja, continue para a próxima coluna).
// O método deve imprimir cada posição visitada no formato:

// Visited: rowIndex,colIndex

// Se uma linha for pulada inteiramente devido a skipRow = true, imprimir:

// Skipping row: rowIndex

import java.util.Scanner;

public class label_statements_mastery {
    public static void skipNumber(int[][] grid, int skipValue, boolean skipRow) {
        outer: for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == skipValue) {
                    if (skipRow) {
                        System.out.println("Skipping row: " + i);
                        continue outer;
                    } else {
                        continue;
                    }
                }
                System.out.println("Visited: " + i + "," + j);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String gridString = scanner.nextLine();
        int skipValue = Integer.parseInt(scanner.nextLine());
        boolean skipRow = Boolean.parseBoolean(scanner.nextLine());
        
        Type gridType = new TypeToken<int[][]>(){}.getType();
        int[][] grid = new Gson().fromJson(gridString, gridType);
        
        skipNumber(grid, skipValue, skipRow);
    }
}
