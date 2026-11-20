Vamos criar um sistema de alto-falantes que demonstra como as classes implementam interfaces. Você criará uma interface que define o que qualquer alto-falante pode fazer e, em seguida, criará dois tipos diferentes de alto-falantes que implementam esse contrato à sua própria maneira.

Você organizará seu código em quatro arquivos:

Speaker.java: Defina uma interface chamada Speaker que declare o que qualquer alto-falante deve ser capaz de fazer. Todo alto-falante deve ter um método speak() que retorne uma String. Esse é o contrato que todas as classes que o implementarem devem cumprir.
Human.java: Crie uma classe que implemente a interface Speaker. Um Human tem um campo name (String). Inclua um construtor para inicializar o nome e implemente o método speak() para retornar: [name] says: Hello everyone!
Robot.java: Crie outra classe que implemente a interface Speaker. Um Robot tem um campo model (String). Inclua um construtor para inicializar o modelo e implemente o método speak() para retornar: Robot [model] says: Beep boop!
Main.java: Reúna tudo usando polimorfismo baseado em interfaces. Você receberá duas entradas: um nome de humano e um modelo de robô. Crie um Human e um Robot e, em seguida, armazene-os em um array de referências Speaker. Percorra o array e imprima o resultado da chamada de speak() em cada alto-falante.
Você receberá duas entradas: o nome do humano (String) e o modelo do robô (String).

Sua saída deve mostrar duas linhas: uma para cada alto-falante. Observe como tanto o Human quanto o Robot podem ser tratados uniformemente por meio da interface Speaker, embora falem de maneiras completamente diferentes!