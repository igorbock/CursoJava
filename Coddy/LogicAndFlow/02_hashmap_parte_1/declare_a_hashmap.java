import java.util.HashMap;

public class declare_a_hashmap {
    public static HashMap<String, String> createStringStringMap() {
        // Escreva seu código aqui
        HashMap<String, String> fruitsMap = new HashMap<>();
        fruitsMap.put("apple", "red");
        fruitsMap.put("banana","yellow");
        fruitsMap.put("grape", "purple");

        return fruitsMap;
    }

    public static void main(String[] args) {
        HashMap<String, String> map = createStringStringMap();
        
        // Imprima o HashMap
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
    }
}
