// Write a function createCustomerGreeting that takes customerName, loyaltyPoints and returns a personalized greeting message.

// The function reverses the customer's name and creates a greeting message for the coffee shop's display screen.

// Parameters:

// customerName (String): The customer's name to reverse
// loyaltyPoints (int): The customer's loyalty points
// Returns: A greeting message. Format: Hi [reversed name], you have [points] loyalty points!

public class coffe_shop_customer_greeting{
    public static String createCustomerGreeting(String customerName, int loyaltyPoints) {
        // Write code here
        String reversedName = new StringBuilder(customerName).reverse().toString();
        return "Hi " + reversedName + ", you have " + loyaltyPoints + " loyalty points!";
    }
}