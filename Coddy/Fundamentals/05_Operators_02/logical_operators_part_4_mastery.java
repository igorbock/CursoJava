// Você está criando um sistema de segurança residencial inteligente. O sistema precisa usar a Lei de De Morgan para avaliar corretamente diferentes condições de segurança.

// Inicialize estas variáveis:
// motionDetected = true
// doorLocked = false
// windowsClosed = true
// alarmActive = true
// nightTime = true
// Crie estas condições de segurança (algumas usando a Lei de De Morgan):
// isSecure: A casa está segura se NÃO (a porta está destrancada E movimento é detectado)
// needsAttention: A casa precisa de atenção se NÃO (janelas estão fechadas OU alarme está ativo)
// isHighRisk: Risco alto se NÃO (porta está trancada E janelas estão fechadas) E é noite
// shouldAlert: Devemos alertar se a casa NÃO está segura OU precisa de atenção

public class logical_operators_part_4_mastery {
    public static void main(String[] args) {
        // Initialize variables - don't modify these!
        boolean motionDetected = true;
        boolean doorLocked = false;
        boolean windowsClosed = true;
        boolean alarmActive = true;
        boolean nightTime = true;
        
        // Create your security conditions
        boolean isSecure = !(doorLocked == false && motionDetected);
        boolean needsAttention = !(windowsClosed || alarmActive);
        boolean isHighRisk = !(doorLocked && windowsClosed) && nightTime;
        boolean shouldAlert = !isSecure || needsAttention;
        
        // Don't modify the code below
        System.out.println("Smart Home Security Status:");
        System.out.println("-------------------------");
        System.out.println("Home is Secure: " + isSecure);
        System.out.println("Needs Attention: " + needsAttention);
        System.out.println("High Risk Situation: " + isHighRisk);
        System.out.println("Alert Required: " + shouldAlert);
    }
}
