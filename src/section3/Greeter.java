package section3;

import javax.swing.JOptionPane;

public class Greeter {
String name = JOptionPane.showInputDialog("What is your name?");
JOptionPane.showMessageDialog(null,"Hi there" + name);
}
