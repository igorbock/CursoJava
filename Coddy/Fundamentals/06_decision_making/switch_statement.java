// Crie um programa que recebe um número de mês (1 para Janeiro, 2 para Fevereiro, etc.) e imprime a estação à qual pertence. Use uma instrução switch para a lógica.

// As estações e seus meses correspondentes são:

// Winter: Dezembro (12), Janeiro (1), Fevereiro (2)
// Spring: Março (3), Abril (4), Maio (5)
// Summer: Junho (6), Julho (7), Agosto (8)
// Autumn: Setembro (9), Outubro (10), Novembro (11)
// Para qualquer outro número de mês, imprima "Invalid month".

import java.util.Scanner;

public class switch_statement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        String season = "";
        
        // Write your code below
        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "Spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "Summer";
                break;
            case 9:
            case 10:
            case 11:
                season = "Autumn";
                break;
            default:
                season = "Invalid month";
        }

        System.out.println(season);
    }
}
