// Crie um método chamado changeElement que recebe 3 argumentos:

// Primeiro argumento é um array
// Segundo argumento é um índice
// Terceiro argumento é um novo elemento
// O método retornará um array modificado alterando o elemento no índice que está armazenado no segundo argumento com o valor no terceiro argumento.

// Por exemplo, com os seguintes argumentos: changeElement(new String[] {"1", "2", "3"}, 0, "9") o método retornará [9, 2, 3]

import java.util.Scanner;

public class modifying_arrays {
    public static String[] changeElement(String[] arr, int index, String newElement) {
        // Write code here
        arr[index] = newElement;
        return arr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String textArray = scanner.nextLine();
        int index = scanner.nextInt();
        scanner.nextLine();
        String newElement = scanner.nextLine();
        String[] arr = textArray.split(",");
        String[] modifiedArr = changeElement(arr, index, newElement);
        for (int i = 0; i < modifiedArr.length; i++) {
            System.out.print(modifiedArr[i] + " ");
        }

        scanner.close();
    }
}
