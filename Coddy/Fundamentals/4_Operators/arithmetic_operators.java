// Operadores são usados para realizar operações em valores.

// Primeiro, vamos discutir os mais básicos operadores aritméticos, eles podem ser familiares das aulas de matemática.

// Operador	Operação	Exemplo
// +	Adição	3 + 2 = 5
// -	Subtração	3 - 2 = 1
// *	Multiplicação	3 * 2 = 6
// /	Divisão	4 / 2 = 2
// Vamos ver um exemplo de uso,

// int a = 3;
// int b = 5;
// int c = a + b; // c contém 8
// Quando trabalhamos com números decimais em Java, usamos o tipo de dados double, que pode armazenar números com pontos decimais. Os mesmos operadores aritméticos (+, -, *, /) funcionam com doubles da mesma forma que funcionam com inteiros:

// double x = 3.3;
// double y = 4.1;
// double z = x + y; // z contém 7.4

// Escreva um código que inicialize duas variáveis, a e b, com os valores 5.2 e 2.6 (respectivamente).

// Depois disso, inicialize outra variável c que conterá o resultado de a / b.

public class arithmetic_operators {
    public static void main(String[] args) {
        // Type your code below
        double a = 5.2;
        double b = 2.6;
        double c = a / b;
        
        // Don't change the line below
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
    }
}
