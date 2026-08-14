// Crie um método chamado findNumber que recebe três argumentos:

// Um array 2D de inteiros (grid)
// Um inteiro (target) para encontrar
// Um booleano (breakEarly) que determina se a busca deve parar após encontrar a primeira ocorrência O 
// método deve usar um loop rotulado para buscar o número alvo e imprimir cada posição onde ele for encontrado. 
// Se breakEarly for true, ele deve parar após encontrar a primeira ocorrência. 
// Cada elemento encontrado deve ser impresso no formato: Found at: rowIndex,colIndex

import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

public class label_statements {
    public static void findNumber(int[][] grid, int target, boolean breakEarly) {
        // Escreva seu código aqui
        search: for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] == target) {
                    System.out.println("Found at: " + i + "," + j);
                    if(breakEarly) {
                        break search;
                    }
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Lê a string JSON que representa um array 2D
        String gridString = scanner.nextLine();
        // Lê o número target
        int target = Integer.parseInt(scanner.nextLine());
        // Lê a flag breakEarly
        boolean breakEarly = Boolean.parseBoolean(scanner.nextLine());
        
        Type gridType = new TypeToken<int[][]>(){}.getType();
        int[][] grid = new Gson().fromJson(gridString, gridType);
        
        findNumber(grid, target, breakEarly);
    }
}
