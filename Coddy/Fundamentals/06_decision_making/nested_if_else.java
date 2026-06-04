// Crie um programa que verifica se alguém pode andar em uma montanha-russa. Os requisitos são:

// Deve ter pelo menos 12 anos
// Deve ter mais de 150 cm de altura
// Se atenderem a ambos os requisitos, mas tiverem menos de 15 anos, precisam de supervisão de um adulto
// Imprima exatamente estas mensagens para cada caso:

// Se jovem demais: Sorry, you're too young
// Se não alto o suficiente: Sorry, you're not tall enough
// Se menor de 15 e sem adulto: Sorry, you need an adult with you
// Se menor de 15 com adulto: You can ride with adult supervision!
// Se 15 ou mais e alto o suficiente: You can ride by yourself!

import java.util.Scanner;

public class nested_if_else {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt(); // Don't change this line
        int height = scanner.nextInt(); // Don't change this line
        boolean hasAdult = scanner.nextBoolean(); // Don't change this line

        // Write your code below
        if (age >= 12) {
            if (height > 150) {             
                if (age < 15) {
                    if (hasAdult) {
                        System.out.println("You can ride with adult supervision!");
                    } else {
                        System.out.println("Sorry, you need an adult with you");
                    }
                } else {
                    System.out.println("You can ride by yourself!");
                }
            } else {
                System.out.println("Sorry, you're not tall enough");
            }
        } else {
            System.out.println("Sorry, you're too young");
        }
        
        scanner.close();
    }
}
