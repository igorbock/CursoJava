Vamos criar uma classe de gerenciamento de Password que demonstra o ocultamento de informações, protegendo dados sensíveis e aplicando regras de segurança por meio de acesso controlado.

Você criará dois arquivos para organizar seu código:

Password.java: crie uma classe Password que oculte seus dados internos e controle como as senhas podem ser definidas e acessadas:
Um campo password privado (String) que armazena a senha real
Um campo minLength privado (int) que define o comprimento mínimo aceitável da senha
Um construtor que recebe o requisito de comprimento mínimo
Um setter setPassword(String password) que aceita apenas senhas que atendam ao requisito de comprimento mínimo. Se for válida, armazene-a e retorne true; se for muito curta, não altere a senha e retorne false
Um getter getMaskedPassword() que retorna a senha com todos os caracteres substituídos por asteriscos (*) — nunca exponha a senha real!
Um método checkPassword(String attempt) que retorna true se a tentativa corresponder à senha armazenada, e false caso contrário
Um getter getLength() que retorna o comprimento da senha atual (ou 0 se nenhuma senha estiver definida)
Main.java: crie um objeto Password com um comprimento mínimo de 6 e, em seguida, leia duas entradas: uma senha a ser definida e uma tentativa a ser verificada. Imprima três linhas:
Set: true ou Set: false (resultado da definição da senha)
Masked: ****** (a versão mascarada da senha)
Match: true ou Match: false (resultado da verificação da tentativa)
Você receberá duas entradas: a senha a ser definida e a tentativa de senha a ser verificada.

Observe como a senha real nunca fica diretamente acessível fora da classe — isso é o ocultamento de informações em ação. A classe controla exatamente quais informações são reveladas e como a senha pode ser modificada.