Complete a classe ExamScore. O nome do estudante é somente leitura (ela possui um getter, mas não possui um setter); a pontuação só é alterada por meio de validação.

O construtor armazena o nome e, em seguida, define a pontuação por meio de setScore
setScore(int score) só aplica a alteração quando a pontuação está entre 0 e 100, inclusive; ele também atualiza se a pontuação é suficiente para aprovação (60 ou mais)
isPassing() retorna o estado de aprovação armazenado
getGrade() retorna 'A' para 90+, 'B' para 80+, 'C' para 70+, 'D' para 60+ e, caso contrário, 'F'