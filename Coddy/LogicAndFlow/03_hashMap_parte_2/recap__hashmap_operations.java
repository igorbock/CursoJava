// Crie um método chamado processHashMap que recebe um argumento:

// Um HashMap chamado products onde:
// Chaves representam nomes de produtos (String).
// Valores representam preços (Double).
// Operações a Realizar
// Encontre o produto com o preço mais alto.
// Se múltiplos produtos tiverem o mesmo preço mais alto, retorne qualquer um deles.
// Se o HashMap estiver vazio, retorne uma string vazia ("").
// Filtre produtos que tenham preço maior que 50.00 e armazene-os em um novo HashMap.
// Calcule o preço médio de todos os produtos.
// Se o HashMap estiver vazio, a média deve ser 0.0.
// Formato de Retorno
// O método deve retornar um novo HashMap com os seguintes pares chave-valor:

// Chave	Valor
// "Highest"	O nome do produto com o preço mais alto (String).
// "Filtered"	Um HashMap (HashMap<String, Double>) contendo apenas produtos com preços maiores que 50.00.
// "Average"	O preço médio de todos os produtos (Double).

import java.util.LinkedHashMap;
import java.util.stream.Collectors;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;


public class recap__hashmap_operations {
    public static HashMap<String, Object> processHashMap(HashMap<String, Double> products) {
        String highestProduct = "";
        double highestPrice = 0.00;
        HashMap<String, Double> filteredProducts = new HashMap<>();
        double totalPrice = 0.0;

        if (products.isEmpty()) {
            HashMap<String, Object> result = new HashMap<>();
            result.put("Highest", "");
            result.put("Filtered", filteredProducts);
            result.put("Average", 0.0);
            return result;
        }

        for (Map.Entry<String, Double> entry : products.entrySet()) {
            String product = entry.getKey();
            double price = entry.getValue();
            totalPrice += price;

            if (price > highestPrice) {
                highestPrice = price;
                highestProduct = product;
            }

            if (price > 50.00) {
                filteredProducts.put(product, price);
            }
        }

        double averagePrice = totalPrice / products.size();

        HashMap<String, Object> result = new HashMap<>();
        result.put("Highest", highestProduct);
        result.put("Filtered", filteredProducts);
        result.put("Average", averagePrice);

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String productsString = scanner.nextLine();

        // Converte string JSON para HashMap
        Type mapType = new TypeToken<HashMap<String, Double>>(){}.getType();
        HashMap<String, Double> products = new Gson().fromJson(productsString, mapType);

        HashMap<String, Object> result = processHashMap(products);
        
        
        // Ordena o mapa Filtered para garantir saída consistente
        Map<String, Double> filteredMap = (Map<String, Double>) result.get("Filtered");
        if (filteredMap != null && !filteredMap.isEmpty()) {
            Map<String, Double> sortedFiltered = filteredMap.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(
                    Map.Entry::getKey,
                    Map.Entry::getValue,
                    (a, b) -> b,
                    LinkedHashMap::new
                ));
            result.put("Filtered", sortedFiltered);
        }
        
        System.out.println(result);
    }
}
