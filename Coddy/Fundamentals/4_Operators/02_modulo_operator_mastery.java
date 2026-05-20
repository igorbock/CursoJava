// Crie um programa que calcula uma pontuação "Lucky Seven" usando apenas operações aritméticas e módulo. Seu programa deve:

// Inicialize uma variável points com o valor 105
// Calcule os seguintes valores de módulo:
// luckySeven = points módulo 14
// tripleBonus = points módulo 3
// fivePower = points módulo 5
// doubleCheck = points módulo 2
// Calcule a pontuação final usando esta fórmula:

// finalScore = points + (luckySeven * 20) - (tripleBonus * 15) + (fivePower * 10) - (doubleCheck * 25)
// Imprima todos os valores intermediários e a pontuação final

public class 02_modulo_operator_mastery {
    public static void main(String[] args) {
        int points = 105;
        // Your code here
        // Calculate modulo values
        int luckySeven = points % 14;
        int tripleBonus = points % 3;
        int fivePower = points % 5;
        int doubleCheck = points % 2;
        
        // Calculate final score
        int finalScore = points + (luckySeven * 20) - (tripleBonus * 15) + (fivePower * 10) - (doubleCheck * 25);
        System.out.println("Starting points: " + points);
        System.out.println("Lucky seven remainder: " + luckySeven);
        System.out.println("Triple bonus remainder: " + tripleBonus);
        System.out.println("Five power remainder: " + fivePower);
        System.out.println("Double check remainder: " + doubleCheck);
        System.out.println("Final score: " + finalScore);
    }
}
