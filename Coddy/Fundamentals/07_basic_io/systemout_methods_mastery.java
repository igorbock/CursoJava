// Crie uma arte ASCII simples de uma casa usando métodos System.out. A casa deve ficar exatamente assim:

//    /\
//   /  \
//  /    \
// +------+
// |      |
// | []   |
// |      |
// +------+
// Regras:

// Use uma combinação de print() e println()
// Cada linha deve ser criada usando exatamente os caracteres mostrados (espaços, barras, colchetes, etc.)
// Preste atenção ao espaçamento antes de cada linha
// A saída deve corresponder exatamente ao exemplo
// A barra invertida (\) é o caractere de escape no Java (e na maioria das linguagens de programação). 
// Quando você quiser mostrar uma barra invertida real em uma string, tem que escapar o escape: escreva-a duas vezes—\\.

// System.out.println("\\"); // Will output: \


public class systemout_methods_mastery {
    public static void main(String[] args) {
        // Create your house here using System.out methods
        System.out.println("   /\\");
        System.out.println("  /  \\");
        System.out.println(" /    \\");
        System.out.println("+------+");
        System.out.println("|      |");
        System.out.println("| []   |");
        System.out.println("|      |");
        System.out.println("+------+");
    }
}
