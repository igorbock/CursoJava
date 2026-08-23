// Crie um método chamado divideNumbers que recebe três argumentos:

// Uma String (num1) representando o primeiro número
// Uma String (num2) representando o segundo número
// Um inteiro (index) representando um índice de array
// O método deve:

// Criar um array de tamanho 2
// Armazenar o valor inteiro convertido de num1 dividido pelo valor inteiro convertido de num2 no índice fornecido
// Retornar o valor no índice fornecido
// Tratar todas as exceções possíveis, retornando a mensagem de erro correspondente em vez disso
// As mensagens de retorno devem ser:

// Para NumberFormatException: "Error: Invalid number format"
// Para ArithmeticException: "Error: Division by zero"
// Para ArrayIndexOutOfBoundsException: "Error: Invalid array index"
// Para operação bem-sucedida: retornar o resultado como uma string

public class trycatch_basics {
    public static String divideNumbers(String num1, String num2, int index) {
        // Escreva seu código aqui
        try
        {
            int[] strArr = new int[2];
            int int1 = Integer.parseInt(num1);
            int int2 = Integer.parseInt(num2);
            strArr[index] = int1 / int2;
            return String.valueOf(strArr[index]);
        }
        catch (NumberFormatException ex) {
            return "Error: Invalid number format";
        }
        catch (ArithmeticException ex) {
            return "Error: Division by zero";
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
        
        System.out.println(divideNumbers(num1, num2, index));
    }
}
