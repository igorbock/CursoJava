// Você recebe um código.

// As variáveis a e b possuem valores ausentes, preencha-as para que o código dentro da declaração if seja 
// executado e c seja igual a 3.

// Bônus: tente encontrar mais de uma solução!

public class if_statement {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        
        // Don't change below this line
        int c = 0;
        if (a >= b && !(b < 10)) {
            c = 2;
        }
        
        c += 1;
        System.out.println("c = " + c);
    }
}
