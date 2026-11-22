// TODO: Defina a interface Messenger
// 1. Declare um método abstrato: void sendMessage(String message)
// 2. Adicione um método default: sendWithTimestamp(String message)
//    - Deve imprimir "[TIMESTAMP] " e então chamar sendMessage(message)
// 3. Adicione um método estático: String formatMessage(String message)
//    - Deve retornar a mensagem convertida para maiúsculas

interface Messenger {
    // TODO: Declare o método abstrato sendMessage
    void sendMessage(String message);

    // TODO: Adicione o método default sendWithTimestamp
    default void sendWithTimestamp(String message) {
        System.out.println("[TIMESTAMP] " + sendMessage(message));
    }
    
    // TODO: Adicione o método estático formatMessage
    static void formatMessage(String message) {
        return message.toUpperCase();
    }
}
