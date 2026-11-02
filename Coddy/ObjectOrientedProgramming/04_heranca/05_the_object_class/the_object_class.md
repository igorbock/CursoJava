Vamos explorar como a classe Object serve como a classe pai universal de todas as classes Java, criando um sistema simples de inventário de dispositivos que demonstra métodos herdados de Object.

Você criará três arquivos para organizar seu código:

Gadget.java: Crie uma classe que represente um dispositivo eletrônico. Sua classe deve ter:
Campos privados para name (String) e year (int)
Um construtor que inicialize ambos os campos
Métodos getter getName() e getYear()
Não sobrescreva nenhum método de Object — queremos ver primeiro o comportamento padrão.
Smartphone.java: Crie uma subclasse que estenda Gadget e adicione recursos específicos de smartphones:
Um campo privado para brand (String)
Um construtor que receba name, year e brand — use super(name, year) para a parte da classe pai
Um método getBrand() que retorne a marca
Sobrescreva o método toString() para retornar: Smartphone: [brand] [name] ([year])
Main.java: Demonstre a diferença entre os métodos padrão e sobrescritos de Object. Você receberá três entradas: o nome, o ano e a marca de um dispositivo. Crie um Gadget e um Smartphone usando o mesmo nome e ano (mais a marca para o smartphone) e, então:
Imprima o nome da classe do dispositivo usando getClass().getSimpleName()
Imprima se o toString() padrão do dispositivo contém o símbolo "@" (imprima true ou false)
Imprima o smartphone usando seu toString() sobrescrito
Você receberá três entradas: o nome do dispositivo/smartphone (String), o ano (int) e a marca (String).

Este desafio mostra por que sobrescrever os métodos de Object é importante — o toString() padrão fornece algo como Gadget@1a2b3c, enquanto sua versão personalizada fornece informações significativas!