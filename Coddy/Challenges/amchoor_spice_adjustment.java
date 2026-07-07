// Crie uma função chamada adjustAmchoorAmount que recebe currentAmount e adjustment como seus parâmetros.

// Você é um chef em uma cozinha minimalista, experimentando com a especiaria amchoor para aperfeiçoar seu prato. Sua tarefa é criar uma função que ajusta a quantidade de especiaria amchoor com base na quantidade atual e um valor de ajuste fornecido.

// A função deve aumentar ou diminuir a quantidade de amchoor com base no valor de ajuste, mas com algumas restrições para refletir sua experimentação cuidadosa:

// A quantidade de amchoor nunca deve ser inferior a 0 gramas (você não pode ter especiaria negativa!).
// A quantidade máxima de amchoor deve ser limitada a 100 gramas (para evitar temperar demais).
// Parâmetros:

// currentAmount (int): A quantidade atual de especiaria amchoor em gramas.
// adjustment (int): O valor de ajuste. Um valor positivo significa adicionar mais especiaria, enquanto um valor negativo significa reduzir a quantidade.
// A função retorna um número inteiro representando a nova quantidade de amchoor após o ajuste, garantindo que ela permaneça dentro do intervalo de 0 a 100 gramas.

// Use os operadores de incremento (++) ou decremento (--) pelo menos uma vez em sua solução para praticar esses operadores básicos.

public class amchoor_spice_adjustment {
    public static int adjustAmchoorAmount(int currentAmount, int adjustment) {
        // Write code here
        currentAmount += adjustment;
        if (currentAmount < 0) {
            currentAmount = 0;
        }
        if (currentAmount > 100) {
            currentAmount = 100;
        }
        return currentAmount;
    }
}
