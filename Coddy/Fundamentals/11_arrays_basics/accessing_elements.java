// Crie um método chamado values que recebe um array como argumento e imprime todos os itens do array um após o outro.

// Para iterar sobre um array, use o campo .length:

// for (int i = 0; i < arr.length; i++) {
//     // code
// }
// Desta forma, i iterará de 0 até arr.length (não incluindo), o que é exatamente todos os índices do array.

public class accessing_elements {
    public static void values(int[] arr) {
        // Write code here
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        values(numbers);
    }
}
