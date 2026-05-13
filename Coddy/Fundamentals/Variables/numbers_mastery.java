// Você está criando um programa de rastreamento do tempo. Inicialize múltiplas variáveis para armazenar 
// diferentes aspectos do tempo:

// Crie estas variáveis inteiras:
// temperature com valor 28
// humidity com valor 65
// windSpeed com valor 15
// Crie estas variáveis decimais (double):
// morningTemp com valor 22.5
// afternoonTemp com valor 28.8
// eveningTemp com valor 23.4
// O programa imprimirá automaticamente todos os valores neste formato:
// Current Temperature: [temperature]
// Humidity Level: [humidity]
// Wind Speed: [windSpeed]
// Morning Temperature: [morningTemp]
// Afternoon Temperature: [afternoonTemp]
// Evening Temperature: [eveningTemp]

public class numbers_mastery {
    public static void main(String[] args) {
        // Create integer variables
        int temperature = 28;
        int humidity = 65;
        int windSpeed = 15;

        // Create decimal variables
        double morningTemp = 22.5;
        double afternoonTemp = 28.8;
        double eveningTemp = 23.4;

        // Don't modify the code below
        System.out.println("Current Temperature: " + temperature);
        System.out.println("Humidity Level: " + humidity);
        System.out.println("Wind Speed: " + windSpeed);
        System.out.println("Morning Temperature: " + morningTemp);
        System.out.println("Afternoon Temperature: " + afternoonTemp);
        System.out.println("Evening Temperature: " + eveningTemp);
    }
}