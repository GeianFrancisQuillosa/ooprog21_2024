import java.util.Scanner;

public class NumberOrder {
    public static void main(String[] args) {
    // Create a Scanner object for user input
    Scanner scanner = new Scanner(System.in);
    
    // Prompt the user to input three integers
    System.out.print("Enter the first number: ");
    int num1 = scanner.nextInt();

    System.out.print("Enter the second number: ");
    int num2 = scanner.nextInt();
    
    System.out.print("Enter the third number: ");
    int num3 = scanner.nextInt();
    
    // Close the scanner to prevent resource leaks
    scanner.close();
    
    // Determine the order of the numbers
    if (num1 <= num2 && num2 <= num3) {
        // NUmbers are in ascending order
         System.out.println("Numbers in ascending order: " + num1 + " " + num2 + " " + num3);
    } else {
        // NUmbers are not in ascending order, display in descending order
        int max = Math.max(num1, Math.max(num2, num3));
        int min = Math.min(num1, Math.min(num2, num3));
        int mid = num1 + num2 + num3 - max - min; // The middle number
        
        System.out.println("Numbers in descending order: " + max + " " + mid + " " + min);
    }
  }
}
        

