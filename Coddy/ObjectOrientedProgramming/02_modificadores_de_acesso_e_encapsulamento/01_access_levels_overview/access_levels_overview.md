Vamos criar um sistema de registros de Student que demonstra como os modificadores de acesso controlam a visibilidade entre diferentes arquivos.

Você criará dois arquivos para organizar seu código:

Student.java: defina uma classe Student com campos usando diferentes níveis de acesso:
campo private: studentId (String) — acessível apenas dentro da classe Student
campo padrão (sem modificador): grade (int) — acessível dentro do mesmo pacote
campo protected: name (String) — acessível no mesmo pacote e em subclasses
campo public: school (String) — acessível em qualquer lugar
Inclua um construtor que defina os quatro campos e um método public chamado getInfo() que retorne uma string no formato: "[studentId] name - Grade grade at school"
Main.java: crie um objeto Student e demonstre quais campos podem ser acessados diretamente de fora da classe. Imprima o campo school diretamente e, em seguida, imprima o resultado de getInfo() para mostrar todas as informações do estudante.
Você receberá quatro entradas: studentId, name, grade e school (nessa ordem).

Sua saída deve conter duas linhas: o nome da escola acessado diretamente, seguido pelas informações completas do estudante retornadas pelo método getInfo().