Vamos criar um sistema GameConfig que usa blocos estáticos para inicializar as configurações do jogo quando a classe é carregada pela primeira vez. Isso é perfeito para configurações que precisam ser calculadas ou definidas uma vez antes que qualquer objeto do jogo seja criado.

Você criará dois arquivos para organizar seu código:

GameConfig.java: crie uma classe de configuração que inicializa suas configurações usando blocos estáticos:
Um array estático privado levelThresholds (int[]) que armazena a pontuação necessária para alcançar cada nível
Uma variável estática privada maxLevel (int) que armazena o número total de níveis
Uma variável estática privada configLoaded (boolean) para verificar se a inicialização ocorreu
Use um bloco estático para inicializar maxLevel com 5 e imprimir "Initializing game configuration..."
Use um segundo bloco estático para criar o array levelThresholds com tamanho igual a maxLevel, depois preenchê-lo para que cada nível exija level * 100 pontos (o nível 1 precisa de 100, o nível 2 precisa de 200, etc.) e definir configLoaded como true
Um método estático getThreshold(int level) que retorna o limite de pontuação para esse nível (os níveis começam em 1)
Um método estático getMaxLevel() que retorna o nível máximo
Um método estático isConfigLoaded() que retorna se a configuração foi carregada
Main.java: demonstre que os blocos estáticos são executados automaticamente quando a classe é acessada. Você receberá uma entrada: um número de nível para consultar. Imprima quatro linhas:
Config loaded: true ou Config loaded: false
Max level: [maxLevel]
Level [level] threshold: [threshold]
Level 1 threshold: [threshold] (sempre mostre também o nível 1)
Você receberá uma entrada: o número do nível (int) a ser consultado.

Observe como a mensagem de inicialização é impressa antes de qualquer código do seu Main ser executado — esse é o bloco estático sendo executado quando a classe é carregada pela primeira vez!