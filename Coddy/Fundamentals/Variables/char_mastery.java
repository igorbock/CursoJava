// Você está criando uma interface de jogo baseada em texto. 
// Crie múltiplas variáveis char para representar diferentes símbolos do jogo:

// Crie estas variáveis char com os valores especificados:
// player com valor '+'
// enemy com valor '*'
// coin com valor '$'
// heart com valor '3'
// arrow com valor '>'
// wall com valor '#'
// Preste atenção a:
// Usando aspas simples (não aspas duplas)
// Símbolos exatos conforme especificado
// Sintaxe correta de declaração char
// O programa exibirá estes símbolos do jogo em uma exibição de status.

public class char_mastery {
    public static void main(String[] args) {
        // Create your char variables below
        char player = '+';
        char enemy = '*';
        char coin = '$';
        char heart = '3';
        char arrow = '>';
        char wall = '#';

        // Don't modify the code below
        System.out.println("Game Symbols:");
        System.out.println("-------------");
        System.out.println("Player: " + player);
        System.out.println("Enemy: " + enemy);
        System.out.println("Coin: " + coin);
        System.out.println("Life: " + heart);
        System.out.println("Direction: " + arrow);
        System.out.println("Wall: " + wall);
    }
}
