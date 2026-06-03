// Você está criando um sistema simples de classes de personagens para um jogo de RPG. Crie uma instrução switch que determina a habilidade especial do personagem e as estatísticas iniciais com base no número da classe dele.

// Classes de Personagens e suas habilidades:

// Guerreiro (Classe 1):
// Habilidade Especial: "Sword Master"
// Vida: 100
// Poder: 8
// Mago (Classe 2):
// Habilidade Especial: "Spell Caster"
// Vida: 70
// Poder: 10
// Arqueiro (Classe 3):
// Habilidade Especial: "Sharp Shooter"
// Vida: 80
// Poder: 9
// Curandeiro (Classe 4):
// Habilidade Especial: "Life Giver"
// Vida: 60
// Poder: 7
// Cavaleiro (Classe 5):
// Habilidade Especial: "Shield Bearer"
// Vida: 90
// Poder: 8
// Para qualquer número de classe inválido, defina:

// Habilidade Especial: "Unknown"
// Vida: 50
// Poder: 5

public class switch_statement_mastery {
    public static void main(String[] args) {
        // Don't modify these lines
        int classNumber = 3;  // This will be different in each test
        String ability = "";
        int health = 0;
        int power = 0;
        
        // Write your switch statement here
        switch (classNumber) {
            case 1:
                ability = "Sword Master";
                health = 100;
                power = 8;
                break;
            case 2:
                ability = "Spell Caster";
                health = 70;
                power = 10;
                break;
            case 3:
                ability = "Sharp Shooter";
                health = 80;
                power = 9;
                break;
            case 4:
                ability = "Life Giver";
                health = 60;
                power = 7;
                break;
            case 5:
                ability = "Shield Bearer";
                health = 90;
                power = 8;
                break;
            default:
                ability = "Unknown";
                health = 50;
                power = 5;
        }

        // Don't modify the code below
        System.out.println("Character Creation:");
        System.out.println("-----------------");
        System.out.println("Class Number: " + classNumber);
        System.out.println("Special Ability: " + ability);
        System.out.println("Health: " + health);
        System.out.println("Power: " + power);
    }
}