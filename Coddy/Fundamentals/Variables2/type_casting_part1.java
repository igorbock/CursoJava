// Escreva um programa Java que demonstre a conversão de tipo. Realize as seguintes operações:

// Declare uma variável double chamada price e inicialize-a com o valor 99.99.
// Converta a variável price para um int e armazene o resultado em uma nova variável chamada intPrice.
// Imprima os valores de price e intPrice no console.

public class type_casting_part1 {
    public static void main(String[] args) {
        // Declare and initialize variables
        double price = 99.99;
        int intPrice = (int) price;
        
        
        // Output the values
        System.out.println("Price: " + price);
        System.out.println("Int Price: " + intPrice);
        
    }
}
