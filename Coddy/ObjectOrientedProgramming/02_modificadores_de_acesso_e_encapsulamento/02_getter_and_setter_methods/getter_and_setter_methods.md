Vamos criar um conversor de Temperature que demonstra o poder de getters e setters com lógica de validação.

Você criará dois arquivos para organizar seu código:

Temperature.java: Defina uma classe Temperature que armazena um valor de temperatura em Celsius. A classe deve ter:
Um campo celsius privado (double)
Um campo valid privado (boolean) que indica se a temperatura é fisicamente possível
Um getter getCelsius() que retorna o valor em Celsius
Um setter setCelsius() que aceita apenas valores iguais ou superiores ao zero absoluto (-273.15). Se o valor for válido, defina valid como true; caso contrário, não altere celsius e defina valid como false
Um getter isValid() para o campo booleano (lembre-se: getters booleanos usam o prefixo is)
Um getter getFahrenheit() que converte e retorna a temperatura em Fahrenheit usando a fórmula: (celsius * 9/5) + 32
Main.java: Crie um objeto Temperature, leia um valor em Celsius como entrada, use o setter para defini-lo e, em seguida, imprima se a temperatura é válida e seu equivalente em Fahrenheit. Formate sua saída em duas linhas:
Valid: true ou Valid: false
Fahrenheit: X.X (mostrando uma casa decimal)
Você receberá uma entrada: um valor double que representa uma temperatura em Celsius.

Para formatar a saída em Fahrenheit com uma casa decimal, você pode usar String.format("%.1f", value).