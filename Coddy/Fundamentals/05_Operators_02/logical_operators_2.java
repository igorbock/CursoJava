// Você precisa atribuir valores inteiros às variáveis b1 e b2 para que b3 
// resulte em true na expressão: b3 = !((b1 + b2) > (b1 * b2)).

public class logical_operators_2 {
    public static void main(String[] args) {
        // Type your code below
        int b1 = 3;
        int b2 = 5;
        boolean b3 = !((b1 + b2) > (b1 * b2));
        
        // Don\'t change the line below
        System.out.println("b3 = " + b3);
    }
}
