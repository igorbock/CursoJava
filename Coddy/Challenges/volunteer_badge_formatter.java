// Create a program that processes volunteer shift information for the community center. 
// Read a volunteer's name, their assigned room number, and their ID number. 
// Clean the name by removing all punctuation, check if the room number is a valid power of 10 
// (1, 10, 100, 1000, or 10000), and format the ID with leading zeros to make it exactly 6 digits.

// Print the cleaned name, "Valid" or "Invalid" for the room, and the formatted ID on separate lines.

import java.util.Scanner;

public class volunteer_badge_formatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the volunteer's name
        String name = scanner.nextLine();
        
        // Read the room number
        int roomNumber = scanner.nextInt();
        
        // Read the ID number
        int idNumber = scanner.nextInt();
        
        // TODO: Clean the name by removing all punctuation
        String cleanedName = name.replaceAll("[^a-zA-Z0-9\s]", "");
        
        // TODO: Check if room number is a valid power of 10 (1, 10, 100, 1000, or 10000)
        String roomStatus = (roomNumber == 1) ? "Valid" : (roomNumber == 10) ? "Valid" : (roomNumber == 100) ? "Valid" : (roomNumber == 1000) ? "Valid" : (roomNumber == 10000) ? "Valid" : "Invalid";
        
        // TODO: Format the ID with leading zeros to make it exactly 6 digits
        String formattedId = String.format("%06d", idNumber);
        
        // Print the results
        System.out.println(cleanedName);
        System.out.println(roomStatus);
        System.out.println(formattedId);
    }
}
