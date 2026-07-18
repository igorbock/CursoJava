// Crie um rastreador de tabuleiro de jogo 3D que simula múltiplos níveis de uma grade de jogo.

// Método: create3DGameBoard recebe três parâmetros:

// levels - número de níveis de jogo (profundidade)
// rows - número de linhas por nível
// cols - número de colunas por nível
// Retorna: Uma string formatada representando o array 3D.

// Cálculo do Valor da Célula:

// O valor de cada célula é calculado da seguinte forma:

// Valor base: Some os índices de posição baseados em 1:
// (level index + 1) + (row index + 1) + (col index + 1) Este é o valor inicial antes de aplicar qualquer regra de borda. Exemplos:
// Célula em [0][0][0]: valor base = 1 + 1 + 1 = 3
// Célula em [1][2][3]: valor base = 2 + 3 + 4 = 9
// Multiplicador de borda: Multiplique o valor base por 10 se a célula estiver na borda externa:

// Nível é o primeiro (0) ou último (levels-1), OU
// Linha é a primeira (0) ou última (rows-1), OU
// Coluna é a primeira (0) ou última (cols-1)
// Esta regra é aplicada DEPOIS de calcular o valor base. Exemplos:

// Célula [0][0][0]: base = 3, na borda (primeiro nível, primeira linha, primeira col) → 3 × 10 = 30
// Célula [0][1][1]: base = 5, na borda (primeiro nível) → 5 × 10 = 50
// Célula [1][1][1] (em um tabuleiro 3×3×3): base = 6, NÃO na borda → permanece 6 (sem multiplicador)
// Sua tarefa: Implemente a lógica para preencher o array 3D com os valores calculados corretos.

public class _3d_arrays_and_beyond_mastery {
    public static String create3DGameBoard(int levels, int rows, int cols) {
        // Verifica dimensões válidas
        if (levels <= 0 || rows <= 0 || cols <= 0) {
            return "";
        }
        
        int[][][] board = new int[levels][rows][cols];
        
        for (int l = 0; l < levels; l++) {
            for (int r = 0; r < rows; r++) {
                for (int c = 0; c < cols; c++) {
                    int baseValue = (l + 1) + (r + 1) + (c + 1);
                    boolean isEdge = l == 0 || l == levels-1 || 
                                   r == 0 || r == rows-1 || 
                                   c == 0 || c == cols-1;
                    board[l][r][c] = isEdge ? baseValue * 10 : baseValue;
                }
            }
        }
        
        String result = "";
        for (int l = 0; l < levels; l++) {
            result += "Level " + l + ":\n";
            for (int r = 0; r < rows; r++) {
                for (int c = 0; c < cols; c++) {
                    result += board[l][r][c];
                    if (c < cols - 1) result += " ";
                }
                result += "\n";
            }
            if (l < levels - 1) result += "\n";
        }
        
        return result;
    }
}
