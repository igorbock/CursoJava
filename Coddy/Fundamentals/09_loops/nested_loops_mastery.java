// Crie uma tabela de multiplicação simples para os números de 1 a 5. A saída deve parecer exatamente assim:

// Multiplication Table (1-5):
// -------------------------
// 1  2  3  4  5
// 2  4  6  8  10
// 3  6  9  12 15
// 4  8  12 16 20
// 5  10 15 20 25
// 5 linhas - Cada linha representa a multiplicação por 1, 2, 3, 4 e 5, respectivamente
// 5 colunas - Cada linha mostra os produtos quando multiplicados por 1 a 5
// Padrão:
// Linha 1: 1×1, 1×2, 1×3, 1×4, 1×5
// Linha 2: 2×1, 2×2, 2×3, 2×4, 2×5
// Linha 3: 3×1, 3×2, 3×3, 3×4, 3×5
// E assim por diante...
// Espaçamento: Cada número ocupa um campo de 3 caracteres de largura (alinhado à esquerda). Números de um dígito são seguidos por 2 espaços; números de dois dígitos são seguidos por 1 espaço. O último número de cada linha não tem espaços no final.
// Alinhamento: Os números são alinhados à esquerda dentro de seu campo de 3 caracteres — por exemplo, 1 (1 + 2 espaços), 10 (10 + 1 espaço), exceto o último número de cada linha, que não tem preenchimento

public class nested_loops_mastery {
    public static void main(String[] args) {
        System.out.println("Multiplication Table (1-5):");
        System.out.println("-------------------------");
        
        // Write your nested loops here
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                int product = i * j;
                System.out.printf("%-3d", product);
                if (j == 5) {
                    System.out.println();
                }
            }
        }
    }
}
