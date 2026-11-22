Vamos criar um sistema de veículos que demonstra quando usar classes abstratas em vez de interfaces. Você modelará veículos que compartilham estado e comportamento comuns por meio de uma classe abstrata, enquanto adiciona capacidades opcionais por meio de interfaces.

Você organizará seu código em cinco arquivos:

Vehicle.java: crie uma classe abstrata que sirva como base para todos os veículos. Todo veículo tem um campo brand (String) e um campo year (int). Inclua um construtor para inicializar ambos os campos, métodos getter para cada um deles e um método abstrato startEngine() que retorne uma String. Adicione também um método concreto getInfo() que retorne: [brand] ([year]). Este é um caso de uso perfeito para uma classe abstrata: os veículos compartilham estado (brand, year) e parte do comportamento (getInfo), mas cada um inicia o motor de uma maneira diferente.
Convertible.java: defina uma interface para veículos que possam converter o teto. Essa capacidade não está ligada ao que um veículo é: é algo que determinados veículos podem fazer. Declare dois métodos: openRoof() e closeRoof(), ambos retornando String.
Car.java: crie uma classe que estenda Vehicle e implemente Convertible. Um Car tem um campo adicional numDoors (int). Use super para inicializar os campos herdados. Implemente startEngine() para retornar: [brand] car engine started. Implemente openRoof() para retornar: [brand] roof opening e closeRoof() para retornar: [brand] roof closing.
Motorcycle.java: crie uma classe que estenda Vehicle, mas NÃO implemente Convertible: motocicletas não têm teto! Uma Motorcycle tem um campo hasSidecar (boolean). Implemente startEngine() para retornar: [brand] motorcycle engine roaring.
Main.java: reúna tudo para demonstrar a diferença entre classes abstratas e interfaces. Você receberá quatro entradas: a marca de um carro, o ano de um carro, a marca de uma motocicleta e o ano de uma motocicleta.
Crie um Car (com 4 portas) e uma Motorcycle (sem sidecar). Primeiro, demonstre o comportamento compartilhado da classe abstrata imprimindo getInfo() para ambos os veículos. Ambos herdam isso de Vehicle. Em seguida, imprima o resultado de startEngine() para cada um: observe como cada tipo de veículo implementa isso de maneira diferente.

Por fim, demonstre a capacidade da interface: como apenas o Car implementa Convertible, chame e imprima openRoof() seguido de closeRoof() somente para o carro.

Você receberá quatro entradas: marca do carro (String), ano do carro (int), marca da motocicleta (String) e ano da motocicleta (int).

Sua saída deve mostrar seis linhas ao todo. Observe como ambos os veículos compartilham o estado da classe abstrata e o método getInfo(), mas apenas o Car tem a capacidade conversível. Isso ilustra quando usar cada abordagem!