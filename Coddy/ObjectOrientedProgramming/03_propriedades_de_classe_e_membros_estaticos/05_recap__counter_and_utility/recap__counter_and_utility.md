Vamos construir um sistema completo que combina uma classe Counter para rastrear instâncias com uma classe utilitária MathUtils - reunindo tudo o que você aprendeu sobre variáveis estáticas, métodos estáticos, blocos estáticos e constantes.

Você criará três arquivos para organizar seu código:

Counter.java: Crie uma classe que rastreia quantas instâncias foram criadas:
Uma variável estática privada para contar o total de instâncias
Uma variável de instância privada id que armazena o identificador exclusivo de cada contador
Um construtor que incrementa a contagem total e atribui a contagem atual como o id desta instância
Um método getId() que retorna o id exclusivo deste contador
Um método estático getTotalCount() que retorna quantos objetos Counter foram criados
MathUtils.java: Crie uma classe utilitária apenas com membros estáticos (nunca instanciada):
Uma constante pública PI com o valor 3.14159
Uma constante pública HALF com o valor 0.5
Um método estático square(int n) que retorna n ao quadrado
Um método estático cube(int n) que retorna n ao cubo
Um método estático circleArea(double radius) que retorna PI * radius * radius
Main.java: Demonstre ambas as classes trabalhando juntas. Você receberá duas entradas: um número para operações matemáticas e uma contagem de quantos objetos Counter devem ser criados. Imprima o seguinte:
Square: [value]
Cube: [value]
Circle area (radius=[number]): [value] (área formatada para 2 casas decimais)
Para cada Counter criado, imprima: Counter [id] created
Finalmente: Total counters: [count]
Você receberá duas entradas: um número (int) para os cálculos matemáticos e uma contagem (int) de quantos objetos Counter devem ser criados.

Lembre-se de acessar os membros estáticos através do nome da classe (como MathUtils.PI e Counter.getTotalCount()) e use String.format("%.2f", value) para formatar valores decimais.