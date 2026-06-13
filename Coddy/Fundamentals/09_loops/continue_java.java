// Você recebe um código que imprime os números de 1 a 20 (incluindo).

// Sua tarefa é adicionar instruções if e continue para que apenas números pares sejam impressos (2, 4, 6, ...). 

public class continue_java {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 > 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
