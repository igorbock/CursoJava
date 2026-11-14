Vamos criar um sistema de inspeção de veículos que usa o operador instanceof para identificar e lidar com segurança com diferentes tipos de veículos. Você criará uma hierarquia de veículos e escreverá um código que verifica o tipo real de cada veículo antes de acessar seus recursos especializados.

Você organizará seu código em quatro arquivos:

Vehicle.java: Crie a classe base compartilhada por todos os veículos. Todo veículo tem um campo model (String). Inclua um construtor para inicializá-lo, um método getter getModel() e um método inspect() que imprime: Inspecting vehicle: [model]
Car.java: Crie uma classe que estende Vehicle. Os carros têm um campo adicional numDoors (int). Use super para a inicialização da classe-pai. Adicione um método checkDoors() que imprime: [model] has [numDoors] doors
Motorcycle.java: Crie outra classe que estende Vehicle. As motocicletas têm um campo hasSidecar (boolean). Adicione um método checkSidecar() que imprime [model] has a sidecar ou [model] has no sidecar, dependendo do valor booleano.
Main.java: É aqui que instanceof se torna essencial! Você receberá quatro entradas: um modelo de carro, o número de portas, um modelo de motocicleta e se ela tem um sidecar (true/false).
Crie um array de referências Vehicle contendo um Car e uma Motorcycle. Em seguida, percorra o array e, para cada veículo:

Chame o método base inspect()
Use instanceof para verificar se é um Car — se for, faça o downcast com segurança e chame checkDoors()
Use instanceof para verificar se é uma Motorcycle — se for, faça o downcast com segurança e chame checkSidecar()
Você receberá quatro entradas: o modelo do carro (String), o número de portas (int), o modelo da motocicleta (String) e se ela tem um sidecar (boolean).

Sua saída deve mostrar quatro linhas — para cada veículo, você verá sua mensagem de inspeção seguida pela verificação específica do seu tipo. O operador instanceof garante que você chame métodos de Car apenas em Cars reais e métodos de Motorcycle apenas em Motorcycles reais, evitando qualquer ClassCastException!