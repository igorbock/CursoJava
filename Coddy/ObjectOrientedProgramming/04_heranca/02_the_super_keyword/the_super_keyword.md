Vamos criar um sistema de eletrodomésticos que demonstra como classes filhas podem usar super para chamar construtores da classe pai e estender o comportamento dos métodos da classe pai.

Você criará três arquivos para organizar seu código:

Appliance.java: Crie a classe pai que representa qualquer eletrodoméstico. Ela deve ter:
Um campo privado para a brand (String) do eletrodoméstico
Um campo privado para wattage (int)
Um construtor que aceite ambos os valores e os inicialize
Um método getBrand() que retorne a marca
Um método getWattage() que retorne a potência
Um método getInfo() que retorne: [brand] - [wattage]W
WashingMachine.java: Crie uma subclasse que estenda Appliance. Uma máquina de lavar tem tudo o que um eletrodoméstico tem, além de seus próprios recursos especiais:
Um campo privado para capacity (int), representando a capacidade de carga em kg
Um construtor que receba marca, potência e capacidade — use super(brand, wattage) para inicializar a parte referente à classe pai e, em seguida, defina a capacidade
Um método getCapacity() que retorne a capacidade
Um método getInfo() que chame o getInfo() da classe pai usando super.getInfo() e o estenda para retornar: [parent info], Capacity: [capacity]kg
Main.java: Crie uma WashingMachine e exiba suas informações completas. Você receberá três entradas: a marca (String), a potência (int) e a capacidade (int). Imprima o resultado da chamada de getInfo() em sua máquina de lavar.
Você receberá três entradas: nome da marca, potência e capacidade.

Observe como super tem duas finalidades aqui: chamar o construtor da classe pai para inicializar os campos herdados e chamar o método da classe pai para desenvolver seu comportamento, em vez de substituí-lo completamente.