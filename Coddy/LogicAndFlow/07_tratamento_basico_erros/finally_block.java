// Crie um método chamado processNumber que recebe dois argumentos:

// Uma String (number) para converter em inteiro
// Um boolean (shouldThrow) que determina se uma exceção deve ser lançada
// O método deve:

// Inicializar uma variável result com 0
// No bloco try:
// Se shouldThrow for true, divida 10 por 0
// Caso contrário, converta a string number em inteiro e armazene em result
// No bloco catch: defina result como -1
// No bloco finally: adicione 100 ao result
// Retorne result como uma string

public class finally_block {
    public static String processNumber(String number, boolean shouldThrow) {
        // Escreva seu código aqui
        int result = 0;
        try {
            if (shouldThrow) {
                result = 10 / 0;
            } else {
                result = Integer.parseInt(number);
            }
        } catch (Exception ex) {
            result = -1;
        } finally {
            result += 100;
        }

        return "" + result + "";
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        boolean shouldThrow = Boolean.parseBoolean(scanner.nextLine());
        
        System.out.println(processNumber(number, shouldThrow));
    }
}
