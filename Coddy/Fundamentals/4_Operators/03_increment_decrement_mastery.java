// Você está criando um rastreador simples de pontuação de jogo. O programa começa com certos valores e você precisa atualizá-los usando operadores de incremento e decremento.

// Você começa com estes valores iniciais:
// lives = 3
// score = 100
// level = 1
// coins = 5
// Execute estas operações em ordem:
// O jogador perdeu 2 vidas (use decremento duas vezes)
// O jogador coletou 3 moedas (use incremento três vezes)
// O jogador ganhou 1 vida (use incremento uma vez)
// O jogador avançou para o próximo nível (use incremento uma vez)
// O jogador perdeu 4 moedas (use decremento quatro vezes)
// O programa mostrará os valores finais após suas operações.

public class 03_increment_decrement_mastery {
    public static void main(String[] args) {
        // Initial values - don't modify these!
        int lives = 3;
        int score = 100;
        int level = 1;
        int coins = 5;
        
        // Add your operations below
        lives--;
        lives--;
        coins++;
        coins++;
        coins++;
        lives++;
        level++;
        coins--;
        coins--;
        coins--;
        coins--;
        
        
        // Don't modify the code below
        System.out.println("Game Status:");
        System.out.println("-----------");
        System.out.println("Lives: " + lives);
        System.out.println("Score: " + score);
        System.out.println("Level: " + level);
        System.out.println("Coins: " + coins);
    }
}