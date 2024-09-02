import java.util.Scanner;

public class CarlysEventPrice {
  public static void main(String[] args) {
    System.out.println("Carly's Catering - 'Carly's makes the food that makes it a party.'");


    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the number of guests attending the event: ");
    int numGuests = scanner.nextInt();

    
    double pricePerGuest = 35.0;
    double totalPrice = numGuests * pricePerGuest;


    System.out.println("Number of guests: " + numGuests);
    System.out.println("Price of guests: $" + pricePerGuest);
    System.out.println("Total price: $" + totalPrice);


    boolean isLargeEvent = numGuests > 50 or more;
    System.out.println("Is this a large event? " + isLargeEvent);
  }
}