import javax.swing.JOptionPane;

public class Main{

    public static void main(String []s){

        String name=JOptionPane.showInputDialog("Enter Your name");

        JOptionPane.showMessageDialog(null, "Hello "+name);

        int age=Integer.parseInt(JOptionPane.showInputDialog("Enter your Age"));

        JOptionPane.showMessageDialog(null,"You are "+age+" years old");

        double height=Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));

        JOptionPane.showMessageDialog(null,"You are "+height+" cm tall");
    }
}