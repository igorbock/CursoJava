import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

public class nested_loops_with_2d_arrays_mastery {
    public static void printSum(int[][] array) {
        // Escreva seu código aqui
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
            System.out.printf("Row %d sum: %d\n", i, sum);
            sum = 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String arrayString = scanner.nextLine();
        
        Type arrayType = new TypeToken<int[][]>(){}.getType();
        int[][] array = new Gson().fromJson(arrayString, arrayType);
        
        printSum(array);
    }
}
