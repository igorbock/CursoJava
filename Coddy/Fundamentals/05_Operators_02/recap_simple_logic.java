// Dado o seguinte trecho de código, sua tarefa é atribuir valores booleanos (true ou false) às variáveis 
// b1, b2 e b3 para que b4 resulte em true.

// A variável b4 é calculada usando a seguinte lógica:

// Ela realiza uma operação AND (&&) entre b1, b2 e o NOT de b3
// Para b4 ser true, todas as partes da operação AND devem ser true

public class recap_simple_logic {
    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = true;
        boolean b3 = false;
        
        boolean b4 = b1 && b2 && (!b3);
        System.out.println("b4 = " + b4);

    }
}