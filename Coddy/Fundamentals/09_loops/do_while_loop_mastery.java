

// Comece com um número (16)
// Em cada passo:
// Imprima o número atual
// Se o número for par, divida por 2
// Se o número for ímpar, subtraia 1
// Continue até chegar a 1
// Deve executar pelo menos uma vez (perfeito para do-while!)

public class do_while_loop_mastery {
    public static void main(String[] args) {
        // Initialize starting number
        int number = 16;
        
        System.out.println("Starting countdown...");
        
        // Write your do-while loop here
        do { 
            System.out.printf("Number is: %d\n", number);
            if (number % 2 == 0) {
                number /= 2;
            } else {
                number -= 1;
            }
        } while (number > 1);
        
        System.out.println("Final number is: " + number);
        System.out.println("Countdown finished!");
    }
}
