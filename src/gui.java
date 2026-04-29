import javax.swing.*;

void main() {
    String name = JOptionPane.showInputDialog("Enter your name");
    JOptionPane.showMessageDialog(null, "Hello " + name);

    int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
    JOptionPane.showMessageDialog(null, "You are " + age + " years old");

    double height = Integer.parseInt(JOptionPane.showInputDialog("Enter your height"));
    JOptionPane.showMessageDialog(null, "You are " + height + " cm tall");


    IO.println("Hello " + name);
    IO.println("You are " + age + " years old");
    IO.println("You are " + height + " cm tall");
}
