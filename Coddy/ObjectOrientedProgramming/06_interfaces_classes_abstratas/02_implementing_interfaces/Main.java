import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ler entradas
        String humanName = scanner.nextLine();
        String robotModel = scanner.nextLine();
        
        // TODO: Crie um objeto Human com o nome fornecido
        Human human = new Human(humanName);

        // TODO: Crie um objeto Robot com o modelo fornecido
        Robot robot = new Robot(robotModel);
        
        // TODO: Crie um array de referências Speaker contendo ambos os objetos
        Speaker[] speakers = {
            human,
            robot
        };
        
        // TODO: Percorra o array e imprima o resultado de speak() para cada speaker
        for (Speaker spk : speakers) {
            System.out.println(spk.speak());
        }
    }
}
