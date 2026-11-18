Vamos criar um sistema de controle de dispositivos definindo interfaces que descrevem o que diferentes dispositivos podem fazer. Este desafio se concentra na criação de interfaces: os contratos que definem capacidades sem especificar como elas funcionam.

Você organizará seu código em três arquivos:

Switchable.java: crie uma interface que defina o que significa um dispositivo ser comutável. Qualquer dispositivo comutável deve ser capaz de ligar e desligar. Declare dois métodos: turnOn() e turnOff(). Lembre-se de que os métodos de uma interface são implicitamente públicos e abstratos, portanto você só precisa das assinaturas dos métodos.
Adjustable.java: crie outra interface que defina o que significa um dispositivo ser ajustável. Um dispositivo ajustável deve ser capaz de definir seu nível. Declare um método setLevel(int level). Inclua também uma constante MAX_LEVEL com o valor 100: lembre-se de que as constantes em interfaces são implicitamente public static final.
Main.java: demonstre que suas interfaces estão definidas corretamente imprimindo informações sobre elas. Você receberá uma entrada: um valor de nível (int). Imprima as três linhas a seguir:
Switchable methods: turnOn, turnOff
Adjustable methods: setLevel
Max level constant: [MAX_LEVEL value] (acesse a constante a partir da interface Adjustable)
Em seguida, imprima: Setting level to: [input level]
Você receberá uma entrada: um valor de nível (int).

Este desafio se concentra exclusivamente na definição de interfaces: os modelos que descrevem capacidades. Na próxima lição, você aprenderá como as classes realmente implementam essas interfaces para fornecer o comportamento real!


