public class Billing {
    public static void computeBill(double price) {
	double total = price * 1.08;
	System.out.println("Total bill: $" + String.format("%.2f", total));
    }

    public static void computeBIll(double price, int quantity) {
	double subtotal = price * quantity;
	double total = subtotal * 1.08;
	System.out.println("Total bill: $" + String.format("%.2f", total));
    }

    public static void computeBill(double price, int quantity, int couponDiscount) {
	double subtotal = price * quantity;
	double discountAmount = (subtotal * couponDiscount) / 100;
	double total = (subtotal - discountAmount) * 1.08;
	System.out.println("Total bill: $" + String.format("%.2f", total));
    }

    public static void main(String[] args) {
	System.out.println("Method 1: computeBill(23.2)");
	computeBill(23.2);

	System.out.println("\nMethod 2: computeBill(10.5, 2)");
	computeBill(23.2);

	System.out.println("\nMethod 3: computeBill(15.0, 3, 10)");
	computeBill(15.0, 3, 10);
    }
}