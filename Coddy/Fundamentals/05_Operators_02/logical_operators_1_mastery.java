// Você está criando um sistema de status para personagem de jogo. O personagem tem várias condições
// de status que precisam ser verificadas usando operadores lógicos.

// Comece com estas condições de status:
// hasShield é true
// hasWeapon é true
// isInjured é false
// hasPotion é false
// Crie estas condições booleanas usando operadores lógicos:
// canFight: Verdadeiro se o personagem tiver arma E não estiver ferido
// needsHealing: Verdadeiro se o personagem estiver ferido OU não tiver escudo
// isVulnerable: Verdadeiro se o personagem não tiver escudo E não tiver arma
// shouldUsePotion: Verdadeiro se o personagem tiver poção E estiver ferido
// isReadyForBattle: Verdadeiro se o personagem tiver arma E tiver escudo E não estiver ferido

public class logical_operators_1_mastery {
    public static void main(String[] args) {
        // Initial status conditions - don't modify these!
        boolean hasShield = true;
        boolean hasWeapon = true;
        boolean isInjured = false;
        boolean hasPotion = false;
        
        // Create your boolean conditions below
        boolean canFight = hasWeapon && isInjured == false;
        boolean needsHealing = isInjured || hasShield == false;
        boolean isVulnerable = hasShield == false && hasWeapon == false;
        boolean shouldUsePotion = hasPotion && isInjured;
        boolean isReadyForBattle = hasWeapon && hasShield && isInjured == false;
        
        // Don't modify the code below
        System.out.println("Character Status Check:");
        System.out.println("---------------------");
        System.out.println("Can Fight: " + canFight);
        System.out.println("Needs Healing: " + needsHealing);
        System.out.println("Is Vulnerable: " + isVulnerable);
        System.out.println("Should Use Potion: " + shouldUsePotion);
        System.out.println("Ready for Battle: " + isReadyForBattle);
    }
}
