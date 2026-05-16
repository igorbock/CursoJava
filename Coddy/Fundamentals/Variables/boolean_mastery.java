// Você está construindo um painel de status do sistema. Crie múltiplas variáveis booleanas para 
// rastrear diferentes estados do sistema:

// Crie essas variáveis booleanas com os valores especificados:
// isServerOnline com valor true
// isMaintenanceMode com valor false
// hasBackup com valor true
// isUpdating com valor false
// isDatabaseConnected com valor true
// needsRestart com valor false
// Preste atenção a:
// Nomes de variáveis corretos (exatamente como mostrado)
// Usando apenas valores true ou false
// Sintaxe correta de declaração booleana
// O programa exibirá o status do sistema usando essas variáveis.

public class boolean_mastery {
    public static void main(String[] args) {
        // Create your boolean variables below
        boolean isServerOnline = true;
        boolean isMaintenanceMode = false;
        boolean hasBackup = true;
        boolean isUpdating = false;
        boolean isDatabaseConnected = true;
        boolean needsRestart = false;

        // Don't modify the code below
        System.out.println("Server Status:");
        System.out.println("-------------");
        System.out.println("Server Online: " + isServerOnline);
        System.out.println("Maintenance Mode: " + isMaintenanceMode);
        System.out.println("Backup Available: " + hasBackup);
        System.out.println("Update in Progress: " + isUpdating);
        System.out.println("Database Connected: " + isDatabaseConnected);
        System.out.println("Restart Required: " + needsRestart);
    }
}
