Vamos criar um sistema de cadastro de Student que usa a palavra-chave final para proteger dados que nunca devem mudar após o cadastro de um estudante.

Você criará dois arquivos para organizar seu código:

Student.java: Crie uma classe Student em que certas informações ficam permanentemente bloqueadas depois de definidas:
Um campo final studentId (String) - atribuído na criação e que nunca pode mudar
Um campo final enrollmentYear (int) - o ano em que o estudante se matriculou, também permanente
Um campo privado comum name (String) - pode ser atualizado se o estudante mudar de nome
Um construtor que recebe os três valores e inicializa os campos
Um getter getStudentId() para o ID do estudante
Um getter getEnrollmentYear() para o ano de matrícula
Um getter getName() e um setter setName() para o nome
Um método getInfo() que retorna: "ID: [studentId] | Name: [name] | Enrolled: [enrollmentYear]"
Main.java: Crie um objeto Student, depois atualize o nome e exiba as informações. Você receberá quatro entradas: o ID do estudante, o nome inicial, o ano de matrícula e um novo nome para atualizar. Imprima duas linhas:
As informações do estudante antes da mudança de nome
As informações do estudante depois da mudança de nome
Você receberá quatro entradas nesta ordem: studentId (String), name (String), enrollmentYear (int) e newName (String).

Observe como os campos final protegem o ID e o ano de matrícula do estudante — esses são registros permanentes que não devem mudar, enquanto o nome pode ser atualizado por meio do setter.