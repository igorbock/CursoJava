Vamos criar uma hierarquia de transporte que demonstre padrões de herança simples e multinível. Você criará uma cadeia de classes em que cada nível adiciona novos recursos, mostrando como os métodos são herdados por vários níveis.

Você organizará seu código em quatro arquivos:

Vehicle.java: crie a classe-base no topo da sua hierarquia. Todo veículo deve ter:
Um campo privado para brand (String)
Um construtor que aceite a marca
Um método getBrand() que retorne a marca
Um método move() que imprima: [brand] is moving
LandVehicle.java: crie uma classe que estenda Vehicle, representando o nível intermediário da sua cadeia multinível. Veículos terrestres adicionam comportamentos específicos para o solo:
Um campo privado para wheels (int)
Um construtor que receba brand e wheels, usando super(brand) para a parte referente à classe-pai
Um método getWheels() que retorne a quantidade de rodas
Um método honk() que imprima: [brand] honks!
Car.java: crie uma classe que estenda LandVehicle, completando sua cadeia de herança de três níveis. Os carros adicionam seus próprios recursos especializados:
Um campo privado para model (String)
Um construtor que receba brand, wheels e model, usando super(brand, wheels)
Um método getModel() que retorne o modelo
Um método displayInfo() que imprima: [brand] [model] with [wheels] wheels
Main.java: demonstre como um objeto Car tem acesso aos métodos dos três níveis da hierarquia. Você receberá três entradas: brand (String), wheels (int) e model (String). Crie um Car e chame estes métodos na seguinte ordem:
move() - herdado de Vehicle (avô)
honk() - herdado de LandVehicle (pai)
displayInfo() - definido na própria classe Car
Você receberá três entradas: o nome da marca, o número de rodas e o nome do modelo.

Sua saída deve mostrar três linhas demonstrando como o objeto Car pode usar métodos de todos os níveis da sua cadeia de herança — desde o Vehicle, no nível mais alto, até sua própria classe!