// Write a function formatHarvestDistribution that takes plants, families and returns a formatted string showing the harvest distribution.

// The function pairs each plant with a family and creates distribution messages for the community garden harvest.

// Parameters:

// plants (String[]): Array of plant names from the garden
// families (String[]): Array of family names receiving produce
// Returns: String with distribution messages, each on a new line. Format: The [family name] family gets [plant name] The [family name] family gets [plant name]

public class garden_harvest_distribution_java {
    public static String formatHarvestDistribution(String[] plants, String[] families) {
        // Write code here
        String message = "";
        for (int i = 0; i < plants.length; i++) {
            message += "The " + families[i] + " family gets " + plants[i] + "\n";
        }
        return message;
    }
}
