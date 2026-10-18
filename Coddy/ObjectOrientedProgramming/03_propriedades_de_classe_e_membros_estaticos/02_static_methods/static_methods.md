Assim como as variáveis estáticas pertencem à classe em vez das instâncias, os métodos estáticos também pertencem à própria classe. Você pode chamá-los sem criar um objeto.

Declare um método estático adicionando a palavra-chave static:

public class MathHelper {
    public static int add(int a, int b) {
        return a + b;
    }
    
    public static int multiply(int a, int b) {
        return a * b;
    }
}

// Chame sem criar um objeto
int sum = MathHelper.add(5, 3);      // 8
int product = MathHelper.multiply(4, 2);  // 8
Métodos estáticos têm uma restrição importante: eles não podem acessar variáveis de instância ou métodos de instância diretamente. Como os métodos estáticos existem sem um objeto, não há uma referência this para trabalhar.

public class Counter {
    private int count;              // Variável de instância
    private static int total;       // Variável estática
    
    public static void incrementTotal() {
        total++;      // OK - acessando variável estática
        // count++;   // Erro! Não é possível acessar variável de instância
    }
}
Métodos estáticos são ideais para operações utilitárias que não dependem do estado do objeto - pense em métodos como Math.sqrt() ou Integer.parseInt(). Eles fornecem funcionalidade que faz sentido no nível da classe em vez de para objetos individuais.

challenge icon
Desafio

Fácil
Vamos construir uma classe utilitária StringUtils que fornece métodos úteis de manipulação de strings sem a necessidade de criar nenhum objeto - perfeito para demonstrar métodos estáticos!

Você criará dois arquivos para organizar seu código:

StringUtils.java: Crie uma classe utilitária com métodos estáticos que realizam operações comuns de string:
Um método estático countVowels(String text) que retorna o número de vogais (a, e, i, o, u - tanto maiúsculas quanto minúsculas) na string fornecida
Um método estático reverse(String text) que retorna a string invertida
Um método estático isPalindrome(String text) que retorna true se a string for lida da mesma forma de frente para trás e de trás para frente (insensível a maiúsculas e minúsculas), e false caso contrário
Main.java: Use sua classe utilitária para processar uma string. Você receberá uma entrada: uma string de texto. Chame cada método estático diretamente através do nome da classe e imprima três linhas:
Vowels: [count]
Reversed: [reversed string]
Palindrome: true ou Palindrome: false
Você receberá uma entrada: uma string de texto para analisar.

Lembre-se de que os métodos estáticos são chamados usando o nome da classe (como StringUtils.countVowels(text)) em vez de criar uma instância primeiro. Isso torna as classes utilitárias convenientes para operações que não precisam manter nenhum estado entre as chamadas.