// Iteração significa percorrer elementos um por um em uma sequência. Com arrays, podemos acessar cada elemento de forma sistemática usando diferentes métodos.

// A maneira mais comum de iterar por um array é usando um for loop:

// String[] fruits = {"apple", "banana", "orange"};
//     for (int i = 0; i < fruits.length; i++) {    
//     System.out.println(fruits[i]);
// }
// Saída:

// apple
// banana
// orange

import java.util.Arrays;
import java.util.Scanner;

public class using_for_loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[] arr = text.split(",");
        // Write your code below      
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > 5) {
                count++;
            }
        }

        String[] newArr = new String[count];

        int newArrIndex = 0;
        for (String word : arr) {
            if (word.length() > 5) {
                newArr[newArrIndex] = word;
                newArrIndex++;
            }
        }
        System.out.println(Arrays.toString(newArr));
    }
}
