 import javax.swing.JOptionPane;

 public class SwingAlert {
	public static void main(String[] args) {
	String message = "Hello, World!";
	String title = "Simple Alert";

	JOptionPane.showMessageDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);
    }
}
	