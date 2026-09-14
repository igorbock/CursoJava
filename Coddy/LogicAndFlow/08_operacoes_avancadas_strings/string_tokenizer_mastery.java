// Crie um método chamado analyzeTokens que processe o texto de três maneiras:

// Tokenização básica:
// Conte o total de tokens
// Identifique os tokens exclusivos
// Encontre o token mais frequente
// Categorias de tokens (aplicadas exatamente nesta ordem de prioridade):
// Números: contém apenas dígitos
// Palavras: contém apenas letras
// Mistos: contém pelo menos uma letra e pelo menos um dígito (independentemente da presença de quaisquer outros caracteres)
// Especiais: todo o resto (tokens que não são Números, Palavras ou Mistos)
// Estatísticas dos tokens:
// Comprimento médio dos tokens
// Token mais longo
// Token mais curto
// O método deve aceitar:

// Uma String (text) para analisar
// Uma String (delimiter) para a tokenização
// Um booleano (caseSensitive) para análise que diferencia maiúsculas de minúsculas
// O formato de retorno deve ser um relatório estruturado com todas as descobertas.

// Importante: A categoria Mixed corresponde a qualquer token que contenha tanto pelo menos uma letra quanto pelo menos um dígito, mesmo que também contenha caracteres especiais (por exemplo, mixedSpecial@234 é Mixed, não Special). Special só é usado quando um token não se qualifica como Numbers, Words ou Mixed.

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.HashMap;
import java.util.Map;

public class string_tokenizer_mastery {
    public static String analyzeTokens(String text, String delimiter, boolean caseSensitive) {
        // Escreva seu código aqui
        
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String delimiter = scanner.nextLine();
        boolean caseSensitive = scanner.nextBoolean();
        
        if (text.equals("null")) text = null;
        if (delimiter.equals("null")) delimiter = null;
        
        System.out.println(analyzeTokens(text, delimiter, caseSensitive));
    }
}
