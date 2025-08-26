import javax.swing.*;

public class gui {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null, "You are " + age+ " years old" );

        double height = Integer.parseInt(JOptionPane.showInputDialog("Enter your height"));
        JOptionPane.showMessageDialog(null, "You are " + height + " cm tall");




        System.out.println("Hello " + name);
        System.out.println("You are " + age+ " years old");
        System.out.println("You are " + height + " cm tall");
    }
}
