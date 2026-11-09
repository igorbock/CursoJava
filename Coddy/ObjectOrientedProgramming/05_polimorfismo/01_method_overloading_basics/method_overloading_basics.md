Vamos criar um formatador de mensagens que demonstre a sobrecarga de métodos, oferecendo várias maneiras de formatar mensagens. Você criará uma classe utilitária com vários métodos format sobrecarregados que lidam com diferentes cenários de entrada.

Você organizará seu código em dois arquivos:

MessageFormatter.java: crie uma classe que ofereça formatação flexível de mensagens por meio de métodos sobrecarregados. Seu formatador deve ter:
Um método format(String message) que retorna a mensagem envolvida por colchetes: [message]
Um método format(String message, int repeatCount) que retorna a mensagem repetida o número de vezes especificado, separada por espaços
Um método format(String message, String prefix) que retorna a mensagem com o prefixo anexado: prefix: message
Um método format(String message, String prefix, String suffix) que retorna: prefix: message (suffix)
O compilador escolherá o método correto com base nos argumentos que você passar — isso é o polimorfismo em tempo de compilação em ação!
Main.java: demonstre os quatro métodos sobrecarregados funcionando em conjunto. Você receberá quatro entradas: uma mensagem (String), uma quantidade de repetições (int), um prefixo (String) e um sufixo (String). Crie um MessageFormatter e chame cada versão do método format, imprimindo cada resultado em sua própria linha:
Primeiro, formate apenas com a mensagem
Segundo, formate com a mensagem e a quantidade de repetições
Terceiro, formate com a mensagem e o prefixo
Quarto, formate com a mensagem, o prefixo e o sufixo
Você receberá quatro entradas: o texto da mensagem, quantas vezes repeti-la, uma string de prefixo e uma string de sufixo.

Por exemplo, se a mensagem for "Olá", a quantidade de repetições for 3, o prefixo for "INFO" e o sufixo for "concluído", sua saída deverá mostrar quatro versões formatadas diferentes da mesma mensagem, cada uma usando um método sobrecarregado diferente!