// Neste desafio, você aplicará seu conhecimento de blocos try-catch para lidar com diferentes exceções ao realizar uma operação de multiplicação e armazenar os resultados em um array.

// Crie um método chamado multiplyNumbers que recebe três argumentos:

// Uma String (num1) representando o primeiro número
// Uma String (num2) representando o segundo número
// Um inteiro (index) representando um índice de array
// O método deve:

// Criar um array de tamanho 3
// Multiplicar os valores inteiros parseados de num1 e num2, e armazenar o resultado no index fornecido
// Retornar o valor no índice fornecido como uma string
// Trate todas as exceções possíveis com mensagens de erro apropriadas:

// Para NumberFormatException, retornar:

// Error: Invalid number format

// Para ArrayIndexOutOfBoundsException, retornar:

// Error: Invalid array index

// Para qualquer operação bem-sucedida, retornar o resultado como uma string.

import java.util.Scanner;

public class trycatch_basics_mastery {
    public static String multiplyNumbers(String num1, String num2, int index) {
        // Escreva seu código aqui usando try-catch
        try
        {
            int[] strArr = new int[3];
            int int1 = Integer.parseInt(num1);
            int int2 = Integer.parseInt(num2);
            strArr[index] = int1 * int2;
            return String.valueOf(strArr[index]);
        }
        catch (NumberFormatException ex) {
            return "Error: Invalid number format";
        }
        catch (ArrayIndexOutOfBoundsException ex)
        {
            return "Error: Invalid array index";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num1 = scanner.nextLine();
        String num2 = scanner.nextLine();
        int index = Integer.parseInt(scanner.nextLine());

        System.out.println(multiplyNumbers(num1, num2, index));
    }
}
