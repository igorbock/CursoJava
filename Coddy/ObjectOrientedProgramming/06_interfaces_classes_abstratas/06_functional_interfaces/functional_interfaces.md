Vamos criar um sistema de transformação de strings usando interfaces funcionais e expressões lambda. Você criará um processador de texto flexível que pode aplicar diferentes transformações a strings: tudo isso usando uma única interface funcional.

Você organizará seu código em três arquivos:

StringTransformer.java: defina uma interface funcional que represente qualquer operação de transformação de strings. Marque-a com a anotação @FunctionalInterface para garantir que ela permaneça funcional. Sua interface deve declarar um único método abstrato chamado transform, que recebe uma String e retorna uma String.
TextProcessor.java: crie uma classe que use sua interface funcional para processar texto. Ela deve ter um campo para armazenar um StringTransformer e um construtor para inicializá-lo. Inclua um método chamado process(String text) que aplique o transformador ao texto fornecido e retorne o resultado. Esse design permite injetar qualquer comportamento de transformação por meio do construtor.
Main.java: reúna tudo criando diferentes transformações com expressões lambda. Você receberá duas entradas: uma string de texto e um tipo de operação (upper, lower ou reverse).
Com base no tipo de operação, crie um TextProcessor com a lambda apropriada:

upper: transforma o texto em maiúsculas
lower: transforma o texto em minúsculas
reverse: inverte o texto (dica: use StringBuilder)
Em seguida, chame process() com o texto de entrada e imprima o resultado neste formato: Result: [transformed text]

Você receberá duas entradas: o texto a ser transformado (String) e o tipo de operação (String).

Observe como a mesma classe TextProcessor pode executar operações completamente diferentes dependendo de qual lambda você passar: esse é o poder das interfaces funcionais!