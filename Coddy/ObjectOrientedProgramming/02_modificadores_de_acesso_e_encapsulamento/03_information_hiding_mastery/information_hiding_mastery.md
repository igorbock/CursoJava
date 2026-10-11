Complete a classe Vault. Seu PIN, sua contagem de tentativas malsucedidas e seu estado de bloqueio são todos privados: nada fora da classe pode lê-los ou alterá-los diretamente.

setPin(String pin) só aceita um PIN que tenha exatamente 4 dígitos; em caso de sucesso, armazena-o e retorna true; caso contrário, retorna false e não armazena nada
unlock(String attempt) retorna Locked imediatamente se já estiver bloqueado. Caso contrário, uma tentativa correta zera a contagem de falhas e retorna Unlocked; uma tentativa incorreta aumenta a contagem de falhas e retorna Wrong PIN, a menos que seja a terceira tentativa incorreta consecutiva, o que bloqueia o cofre e retorna Locked em vez disso
isLocked() retorna o estado de bloqueio armazenado