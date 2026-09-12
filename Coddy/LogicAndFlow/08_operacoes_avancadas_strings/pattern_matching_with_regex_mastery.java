// Crie um método chamado analyzeText que recebe uma String (text) e realiza uma análise avançada de correspondência de padrões. O método deve:

// Contar e categorizar todas as palavras em:
// Palavras simples (apenas letras)
// Números (inteiros e decimais)
// Endereços de e-mail (contêm @ e domínio)
// URLs (começam com http:// ou https://)
// Para cada categoria, retornar:
// A quantidade de correspondências
// A posição da primeira ocorrência
// O conteúdo correspondente real (até 3 itens)
// O formato de retorno deve ser:

// Category: count, positions: [pos1, pos2, ...], found: [item1, item2, ...]
// Além disso, crie um método validateMatches que recebe uma String (text) e retorna true se:

// Todos os endereços de e-mail terminarem com .com, .org ou .net
// Todas as URLs forem seguras (https://)
// Todos os números forem positivos
// Todas as palavras tiverem pelo menos 3 caracteres
// As mensagens de retorno devem ser:

// Se text for null: retornar "Invalid input"
// Se text estiver vazio: retornar "Empty text"
// Se nenhuma correspondência for encontrada: retornar "No matches found"

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class pattern_matching_with_regex_mastery {
    // Regexes (defensivas)
    private static final Pattern WORD_SIMPLE =
            Pattern.compile("\\b[a-zA-Z]+\\b");

    // Inteiros e decimais: 12, -12, 12.34, -12.34 (a validação exige positivos, então o - será reprovado)
    private static final Pattern NUMBER =
            Pattern.compile("\\b\\d+(?:\\.\\d+)?\\b|\\b-\\d+(?:\\.\\d+)?\\b");

    // E-mail: algo@dominio.tld (tld com letras e tamanho >=2). Endereço real aparece no match.
    private static final Pattern EMAIL =
            Pattern.compile("\\b[a-zA-Z0-9._%+-]+@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,}\\b");

    // URL segura: http:// ou https://
    private static final Pattern URL =
            Pattern.compile("\\bhttps?://[^\\s]+\\b");

    public static String analyzeText(String text) {
        if (text == null) return "Invalid input";
        if (text.isEmpty()) return "Empty text";

        List<String> simpleWordsFound = new ArrayList<>();
        List<Integer> simpleWordsPos = new ArrayList<>();

        List<String> numbersFound = new ArrayList<>();
        List<Integer> numbersPos = new ArrayList<>();

        List<String> emailsFound = new ArrayList<>();
        List<Integer> emailsPos = new ArrayList<>();

        List<String> urlsFound = new ArrayList<>();
        List<Integer> urlsPos = new ArrayList<>();

        extractMatches(text, WORD_SIMPLE, simpleWordsFound, simpleWordsPos);
        extractMatches(text, NUMBER, numbersFound, numbersPos);
        extractMatches(text, EMAIL, emailsFound, emailsPos);
        extractMatches(text, URL, urlsFound, urlsPos);

        int totalMatches =
                simpleWordsFound.size() + numbersFound.size() + emailsFound.size() + urlsFound.size();

        if (totalMatches == 0) return "No matches found";

        StringBuilder sb = new StringBuilder();

        // Só imprime categoria se tiver matches (ajuste para bater com o esperado)
        if (simpleWordsFound.size() > 0) {
            appendCategory(sb, "Words", simpleWordsPos, simpleWordsFound);
        }
        if (numbersFound.size() > 0) {
            appendCategory(sb, "Numbers", numbersPos, numbersFound);
        }
        if (emailsFound.size() > 0) {
            appendCategory(sb, "Emails", emailsPos, emailsFound);
        }
        if (urlsFound.size() > 0) {
            appendCategory(sb, "URLs", urlsPos, urlsFound);
        }

        return sb.toString().trim();
    }

    public static boolean validateMatches(String text) {
        if (text == null) {
            return false; // (não há instrução específica de mensagem aqui; retorno booleano)
        }
        if (text.isEmpty()) {
            return false;
        }

        // Precisamos validar:
        // - e-mails terminarem com .com, .org, .net
        // - URLs serem seguras (https://)
        // - números positivos
        // - palavras simples terem pelo menos 3 caracteres

        // E-mails
        Matcher mEmail = EMAIL.matcher(text);
        while (mEmail.find()) {
            String email = mEmail.group();
            if (!(email.endsWith(".com") || email.endsWith(".org") || email.endsWith(".net"))) {
                return false;
            }
        }

        // URLs (qualquer http:// ou https:// que aparecer precisa ser https://)
        Matcher mUrl = URL.matcher(text);
        while (mUrl.find()) {
            String url = mUrl.group();
            if (!url.startsWith("https://")) {
                return false;
            }
        }

        // Números: devem ser positivos
        Matcher mNum = NUMBER.matcher(text);
        while (mNum.find()) {
            String numStr = mNum.group();
            // Temos sinais possíveis. Se começar com '-', não é positivo.
            if (numStr.startsWith("-")) return false;

            // Além disso, garantir que é numérico e >= 0
            try {
                // Double para suportar decimais
                double v = Double.parseDouble(numStr);
                if (v < 0) return false;
            } catch (NumberFormatException e) {
                return false;
            }
        }

        // Palavras simples: pelo menos 3 caracteres
        Matcher mWord = WORD_SIMPLE.matcher(text);
        while (mWord.find()) {
            String w = mWord.group();
            if (w.length() < 3) return false;
        }

        return true;
    }

    // ========= Helpers =========

    private static void extractMatches(
            String text,
            Pattern pattern,
            List<String> foundItems,
            List<Integer> positions
    ) {
        Matcher m = pattern.matcher(text);
        while (m.find()) {
            foundItems.add(m.group());
            positions.add(m.start()); // posição em caracteres (0-based)
        }
    }

    private static void appendCategory(
        StringBuilder sb,
        String categoryName,
        List<Integer> positions,
        List<String> foundItems
    ) {
        List<String> shownFound = new ArrayList<>();
        for (int i = 0; i < foundItems.size() && i < 3; i++) {
            shownFound.add(foundItems.get(i));
        }

        List<Integer> shownPos = new ArrayList<>();
        for (int i = 0; i < positions.size() && i < 3; i++) {
            shownPos.add(positions.get(i));
        }

        sb.append(categoryName)
                .append(": ")
                .append(foundItems.size())
                .append(", positions: ")
                .append(shownPos)
                .append(", found: ")
                .append(shownFound)
                .append("\n");
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        
        if (text.equals("null")) text = null;
        
        System.out.println(analyzeText(text));
        System.out.println(validateMatches(text));
    }
}
