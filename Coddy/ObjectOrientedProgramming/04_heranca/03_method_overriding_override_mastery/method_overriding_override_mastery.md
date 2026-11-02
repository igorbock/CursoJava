Implemente completamente SmsNotification e PushNotification, que substituem o comportamento da classe pai, em vez de estendê-lo, sobrescrevendo send().

O send() de Notification imprime "Sending notification: " + message
O construtor de SmsNotification recebe uma mensagem e um número de telefone, passa a mensagem para super e armazena o número de telefone
SmsNotification sobrescreve send() para imprimir "Texting " + phone + ": " + getMessage() em vez disso
O construtor de PushNotification recebe uma mensagem e um ID de dispositivo, passa a mensagem para super e armazena o ID do dispositivo
PushNotification sobrescreve send() para imprimir "Pushing to " + deviceId + ": " + getMessage() em vez disso