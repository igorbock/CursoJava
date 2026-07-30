// Crie um método chamado manageWarehouse que recebe dois argumentos:

// Um HashMap chamado warehouse onde:
// Chaves representam nomes de produtos (String).
// Valores representam quantidades (Integer).
// Uma lista de operações (String[] operations) onde cada string segue um destes formatos:
// "ADD product quantity" → Adiciona a quantidade especificada ao produto existente (ou cria se não existir).
// "REMOVE product quantity" → Diminui a quantidade do produto. Se a quantidade se tornar 0 ou negativa, remova o produto.
// "CHECK product" → Imprime true se o produto existir, caso contrário false.
// "PRINT" → Imprime todos os produtos e suas quantidades no formato:

// Product: Laptop, Quantity: 10
// Product: Mouse, Quantity: 50
// Para converter um String em um Integer, usamos:

// String quantityString = "25";  
// int quantity = Integer.valueOf(quantityString);  
// System.out.println(quantity + 5); // Output: 30
// Integer.valueOf() garante que recebamos um inteiro que possamos usar em cálculos.

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

public class recap__manage_warehouse {
    public static void manageWarehouse(HashMap<String, Integer> warehouse, String[] operations) {
        // Escreva seu código aqui
        for (int i = 0; i < operations.length; i++) {
            String opr = operations[i].split(" ")[0];
            String prd = "";
            int qtd = 0;
            switch(opr) {
                case "ADD":
                    qtd = Integer.valueOf(operations[i].split(" ")[2]);
                    prd = operations[i].split(" ")[1];
                    if(warehouse.containsKey(prd)) {
                        int oldValue = warehouse.get(prd);
                        warehouse.replace(prd, oldValue + qtd);
                    } else {
                        warehouse.put(prd, qtd);
                    }
                break;
                case "REMOVE":
                    qtd = Integer.valueOf(operations[i].split(" ")[2]);
                    prd = operations[i].split(" ")[1];
                    if(warehouse.containsKey(prd)) {
                        int oldValue = warehouse.get(prd);
                        int newValue = oldValue - qtd;
                        if (newValue <= 0) {
                            warehouse.remove(prd);
                        } else {
                            warehouse.replace(prd, newValue);
                        }   
                    }
                break;
                case "CHECK":
                    prd = operations[i].split(" ")[1];
                    if(warehouse.containsKey(prd)) {
                        System.out.println("true");
                    } else {
                        System.out.println("false");
                    }
                break;
                case "PRINT":
                    for (Map.Entry<String, Integer> entry : warehouse.entrySet()) {
                        String key = entry.getKey();
                        Integer value = entry.getValue();
                        System.out.println("Product: " + key + ", Quantity: " + value);
                    }
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String warehouseString = scanner.nextLine();
        String operationsString = scanner.nextLine();

        // Converte string JSON para HashMap
        Type mapType = new TypeToken<HashMap<String, Integer>>(){}.getType();
        HashMap<String, Integer> warehouse = new Gson().fromJson(warehouseString, mapType);

        // Converte string JSON para Array
        String[] operations = new Gson().fromJson(operationsString, String[].class);

        manageWarehouse(warehouse, operations);
    }
}
