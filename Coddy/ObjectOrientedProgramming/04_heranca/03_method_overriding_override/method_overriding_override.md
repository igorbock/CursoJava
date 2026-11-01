Vamos criar um sistema de notificações que demonstra como as subclasses podem substituir métodos da classe pai para fornecer seu próprio comportamento especializado. Você verá como a anotação @Override ajuda a detectar erros e como cada subclasse pode personalizar os métodos herdados.

Você criará três arquivos para organizar seu código:

Notification.java: crie a classe pai que representa uma notificação genérica. Ela deve ter:
Um campo privado para a message (String)
Um construtor que aceite a mensagem
Um método getMessage() que retorne a mensagem
Um método send() que imprima: Sending notification: [message]
EmailNotification.java: crie uma subclasse que estenda Notification e personalize a forma como as notificações são enviadas por e-mail:
Um campo privado para o endereço de e-mail do recipient (String)
Um construtor que receba a mensagem e o destinatário, usando super(message) para a parte da classe pai
Substitua o método send() usando a anotação @Override para imprimir: Emailing [recipient]: [message]
Main.java: demonstre como o mesmo nome de método produz comportamentos diferentes dependendo do tipo de objeto. Você receberá duas entradas: uma mensagem e um endereço de e-mail. Crie uma Notification regular e uma EmailNotification com a mesma mensagem e, em seguida, chame send() em cada uma para ver as diferentes saídas.
Você receberá duas entradas: a mensagem (String) e o endereço de e-mail do destinatário (String).

Sua saída deve mostrar duas linhas — primeiro a partir do método send() da classe pai e, depois, a partir da versão substituída em EmailNotification. Isso demonstra como a substituição de métodos permite que as subclasses substituam o comportamento herdado por sua própria implementação.