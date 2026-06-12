// Você recebe um código que imprime os números de 1 a 20 (inclusive).

// Sua tarefa é adicionar as instruções if e break para que apenas os números de 1 a 15 sejam 
// impressos, o loop sairá antes de imprimir os números de 16 a 20.

public class break_java {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i == 16) {
                break;
            }
            System.out.println(i);
        }
    }
}
