// Você está criando um sistema de segurança com múltiplos sensores. 
// Calcule se o sistema deve disparar um alarme com base em diferentes combinações de sensores.

// Comece com estes estados dos sensores:
// motionDetected é true
// doorOpen é false
// windowOpen é true
// systemArmed é true
// Crie estas condições de segurança usando operadores lógicos:
// alarmTrigger1: Verdadeiro se sistema estiver armado E (movimento detectado OU porta aberta)
// alarmTrigger2: Verdadeiro se sistema estiver armado E janela aberta E NÃO porta aberta
// alarmTrigger3: Verdadeiro se NÃO sistema estiver armado OU (NÃO movimento detectado E NÃO janela aberta)

public class logical_operators_2_mastery {
    public static void main(String[] args) {
        // Initial sensor states - don't modify these!
        boolean motionDetected = true;
        boolean doorOpen = false;
        boolean windowOpen = true;
        boolean systemArmed = true;
        
        // Calculate security conditions
        boolean alarmTrigger1 = systemArmed && (motionDetected || doorOpen);
        boolean alarmTrigger2 = systemArmed && windowOpen && !doorOpen;
        boolean alarmTrigger3 = !systemArmed || (!motionDetected && !windowOpen);
        
        // Don't modify the code below
        System.out.println("Security System Status:");
        System.out.println("---------------------");
        System.out.println("Alarm Trigger 1: " + alarmTrigger1);
        System.out.println("Alarm Trigger 2: " + alarmTrigger2);
        System.out.println("Alarm Trigger 3: " + alarmTrigger3);
    }
}
