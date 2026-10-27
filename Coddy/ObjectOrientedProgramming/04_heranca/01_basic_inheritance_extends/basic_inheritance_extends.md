Vamos criar um sistema simples de veículos que demonstra a herança em ação. Você criará uma classe pai que contém propriedades comuns dos veículos e uma classe filha que a estende com um comportamento especializado.

Você organizará seu código em três arquivos:

Vehicle.java: crie a classe pai que representa qualquer veículo. Ela deve ter:
Um campo privado para a brand (String) do veículo
Um construtor que aceita o nome da marca e o atribui ao campo. (Nenhuma chamada a super() é necessária aqui, pois Vehicle está no topo da hierarquia.)
Um método getBrand() que retorna a marca
Um método start() que imprime: [brand] is starting
Motorcycle.java: crie uma subclasse que estende Vehicle. Uma motocicleta é um veículo, portanto, essa relação de “é-um” torna a herança apropriada. Sua Motorcycle deve:
Usar extends para herdar de Vehicle
Ter um construtor que recebe a marca e a passa para a classe pai usando super(brand)
Adicionar seu próprio método wheelie() que imprime: [brand] is doing a wheelie!
Main.java: reúna tudo criando um objeto Motorcycle e demonstrando tanto os comportamentos herdados quanto os exclusivos. Você receberá uma entrada: o nome da marca. Imprima duas linhas chamando:
O método herdado start()
O método próprio de Motorcycle, wheelie()
Você receberá uma entrada: o nome da marca (String) da sua motocicleta.

Observe como sua Motorcycle automaticamente tem acesso a start() e getBrand() sem precisar reescrevê-los — esse é o poder da herança!