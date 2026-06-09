// Escreva um programa que imprima "Hello Coddy: " e o valor de i de 3 a 27 
// (inclusive, o que significa imprimir os números 3, 4, 5, ..., 26, 27, totalizando 27 - 3 + 1 = 25 vezes), 
// faça isso usando um laço for.

// Ficará assim:

// Hello Coddy: 3
// Hello Coddy: 4
// ...
// Hello Coddy: 27

public class for_loop_part_1 {
    public static void main(String[] args) {
        // Write code here
        for (int i = 3; i <= 27; i++) {
            System.out.println("Hello Coddy: " + i);
        }
    }
}
