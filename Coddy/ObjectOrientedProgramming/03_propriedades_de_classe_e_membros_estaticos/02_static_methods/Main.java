import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        
        // TODO: Use os métodos estáticos de StringUtils para analisar o texto
        // Chame StringUtils.countVowels(text) para obter a contagem de vogais
        // Chame StringUtils.reverse(text) para obter a string invertida
        // Chame StringUtils.isPalindrome(text) para verificar se é um palíndromo
        int result1 = StringUtils.countVowels(text);
        String result2 = StringUtils.reverse(text);
        boolean result3 = StringUtils.isPalindrome(text);
        
        // TODO: Imprima os resultados no formato:
        // Vowels: [count]
        // Reversed: [reversed string]
        // Palindrome: true/false
        System.out.println("Vowels: " + result1);
        System.out.println("Reversed: " + result2);
        System.out.println("Palindrome: " + result3);
    }
}
