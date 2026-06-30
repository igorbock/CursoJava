// Crie um programa que faça o seguinte:

// Inicializa um array de strings chamado fruits com os valores "apple", "banana", "orange", "grape" e "kiwi".
// Usa um laço for aprimorado para iterar sobre o array fruits.
// Em cada iteração, imprime a fruta atual em maiúsculas usando o método toUpperCase(): someString.toUpperCase()

public class enhanced_for_loop {
    public static void main(String[] args) {
        // Initialize the fruits array
        String[] fruits = {"apple", "banana", "orange", "grape", "kiwi"};
        for (String fruit : fruits) {
            System.out.println(fruit.toUpperCase());
        }
        // Use an enhanced for loop to iterate over the array
        
    }
}
