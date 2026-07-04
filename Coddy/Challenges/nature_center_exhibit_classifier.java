// Write a function classifyExhibit that takes name and returns the appropriate exhibit category based on keywords in the animal or plant name.

// The function checks for specific keywords to determine which exhibit section the specimen belongs to at the nature center.

// Conditions:

// If name contains "frog" or "salamander" → return "Amphibian Exhibit"
// If name contains "snake" or "lizard" → return "Reptile Exhibit"
// If name contains "palm" → return "Plant Exhibit"
// If no keywords match → return "Exhibit not found"
// Parameters:

// name (String): The name of the animal or plant specimen
// Returns: String indicating the exhibit category. Format: "Amphibian Exhibit", "Reptile Exhibit", "Plant Exhibit", or "Exhibit not found"

public class nature_center_exhibit_classifier {
    public static String classifyExhibit(String name) {
        // Write code here
        String category;
        if(name.contains("frog") || name.contains("salamander")) {
            category = "Amphibian Exhibit";
        } else if(name.contains("snake") || name.contains("lizard")) {
            category = "Reptile Exhibit";
        } else if(name.contains("palm")) {
            category = "Plant Exhibit";
        } else {
            category = "Exhibit not found";
        }
        return category;
    }
}
