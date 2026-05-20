// Escreva um código que inicialize três variáveis, a (int), b (double) e c (int) com os valores 9, 2.6 e 11 (respectivamente).

// Depois disso, inicialize as seguintes variáveis:

// d (int) que conterá o resultado de a módulo 2 
// e (int) que conterá o resultado de a módulo 3
// f (double) que conterá o resultado de b módulo 1.5
// g (double) que conterá o resultado de b módulo 3.9
// h (int) que conterá o resultado de c módulo 10
// Confira o resultado e veja como diferentes dividendos e divisores afetam o resultado.

public class 02_modulo_operator {
    public static void main(String[] args) {
        // Type your code below
        int a = 9;
        double b = 2.6;
        int c = 11;
        
        int d = a % 2;
        int e = a % 3;
        double f = b % 1.5;
        double g = b % 3.9;
        int h = c % 10;

        // Don't change the line below
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        System.out.println("g = " + g);
        System.out.println("h = " + h);
    }
}
