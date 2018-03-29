import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {
String answer=JOptionPane.showInputDialog(null,"What kind of fish do you like?");
JOptionPane.showMessageDialog(null,"I like Salmon, "+answer);
}
}
