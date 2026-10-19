Complete a classe TemperatureLog, que classifica leituras usando um método utilitário estático e também acompanha uma média contínua de todas as leituras já registradas.

O construtor armazena a cidade e a leitura, depois atualiza a contagem e a soma compartilhadas das leituras
O método estático classify(int reading) retorna "Hot" quando a leitura é 30 ou mais, "Mild" quando é 15 ou mais e, caso contrário, "Cold"
describe() retorna city + ": " + reading + " (" + classify(reading) + ")"
O método estático averageReading() retorna a soma compartilhada dividida pela contagem compartilhada