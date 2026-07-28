import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class nested_hashmap {
    public static void printNestedInventory(HashMap<String, HashMap<String, Integer>> inventory) {
        // Itera sobre cada categoria no HashMap externo.
        for (String category : inventory.keySet()) {
            System.out.println("Category: " + category);
            HashMap<String, Integer> items = inventory.get(category);
            // Verifica se o mapa interno está vazio.
            if (items.isEmpty()) {
                System.out.println("  (No products)");
            } else {
                // Itera sobre cada produto no HashMap interno usando keySet().
                for (String product : items.keySet()) {
                    System.out.println("  Product: " + product + ", Price: " + items.get(product));
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inventoryString = scanner.nextLine();

        // Converte string JSON para HashMap Aninhado
        Type inventoryType = new TypeToken<HashMap<String, HashMap<String, Integer>>>(){}.getType();
        HashMap<String, HashMap<String, Integer>> inventory = new Gson().fromJson(inventoryString, inventoryType);

        printNestedInventory(inventory);
    }
}
