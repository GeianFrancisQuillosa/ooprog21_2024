public class TestCircle {
    public static void main(String[] args) {
	Circle a = new Circle ();
	Circle b = new Circle ();
	Circle c = new Circle ();

	Circle.setRadius(3);

	System.out.println("Circle a:");
	System.out.println("Radius: " + CIrcle.getRadius());
	System.out.println("Diameter: " + CIrcle.getDiameter());
	System.out.println("Area: " + CIrcle.getArea());

	Circle.setRadius(20);

	System.out.println("Circle b:");
	System.out.println("Radius: " + CIrcle.getRadius());
	System.out.println("Diameter: " + CIrcle.getDiameter());
	System.out.println("Area: " + CIrcle.getArea());
   }
}