// Você está criando um localizador simples de números primos. O programa deve verificar se um número é primo testando divisores possíveis, mas use break para torná-lo mais eficiente:

// Comece com o número 97

// Verifique divisores de 2 até number/2 (então para 97, verifique de 2 a 48)

// Para cada divisor que você verificar, imprima exatamente:

// Checking divisor: [divisor]
// Se você encontrar um divisor que divide exatamente (resto é 0):

// Found divisor: [divisor]
// Então use break para parar de verificar

// No final, imprima:

// 97 is prime!
// ou

// 97 is not prime!
// dependendo de se você encontrou algum divisor

public class break_mastery {
    public static void main(String[] args) {
        int number = 97;
        boolean isPrime = true;
        
        System.out.println("Checking if " + number + " is prime...");
        
        // Write your code here
        for (int i = 2; i <= number/2; i++) {
            System.out.printf("Checking divisor: %d\n", i);
            if (number % i == 0) {
                System.out.printf("Found divisor: %d\n", i);
                isPrime = false;
                break;
            }
        }
        
        // Print the result
        System.out.println(number + " is " + (isPrime ? "prime!" : "not prime!"));
    }
}
