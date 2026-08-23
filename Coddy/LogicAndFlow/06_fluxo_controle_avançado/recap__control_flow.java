import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

public class recap__control_flow {
    public static String processArray(Object[] data, String type) {
        // Escreva seu código aqui
        if (data == null || data.length == 0) {
            return "Invalid input";
        }
        
        switch (type) {
            case "sum" -> {
                double sum = 0;
                process: for (Object value : data) {
                    if (value instanceof Integer i) {
                        sum += i;
                    } else if (value instanceof Double d) {
                        sum += d;
                    }
                }
                return "Sum: " + sum;
            }
            case "find" -> {
                search: for (int i = 0; i < data.length; i++) {
                    double num = 0;
                    if (data[i] instanceof Integer val) {
                        num = val;
                    } else if (data[i] instanceof Double val) {
                        num = val;
                    }
                    if (num > 100) {
                        return String.valueOf(i);
                    }
                }
                return "Not found";
            }
            default -> {
                return "Invalid type";
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dataJson = scanner.nextLine();
        String type = scanner.nextLine();
        
        Type arrayType = new TypeToken<Object[]>(){}.getType();
        Object[] data = new Gson().fromJson(dataJson, arrayType);
        
        System.out.println(processArray(data, type));
    }
}
