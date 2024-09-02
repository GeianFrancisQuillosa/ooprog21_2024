import java.util.Scanner;

public class SammysRentalPrice {
  public static void main(String[] args) {
    System.out.println("Sammy's Seashore Supplies - 'Sammy's makes it fun in the sun.'");


    Scanner scanner = new Scanner(Sysrem.in);
    System.out.println("Enter the number of minutes you rented the equipment: ");
    int totalMinutes = scanner.nextInt();


    int hours = totalMinutes / 60;
    int minutes = totalMinutes % 60;


    double costPerHour = 40.0;
    double costPerMinute = 1.0;
    double rentalCost = (hours * costPerHour) + (minutes * costPerMinute);


    System.out.println("Hours: " + hours);
    System.out.println("Minutes: " + minutes);
    System.out.println("Total price: $" + rentalCost);
  }
}



