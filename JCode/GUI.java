package JCode;
import javax.print.attribute.standard.JobHoldUntil;
import javax.swing.JOptionPane;
class GUI{
    public static void main(String[] args) {
      String name = JOptionPane.showInputDialog("Enter Yor name:","What is your name?");
      JOptionPane.showMessageDialog(null,"Hello "+name);
      int age = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Your age", "How old are You"));
      JOptionPane.showMessageDialog(null,"You are "+age);
      double height = Double.parseDouble(JOptionPane.showInputDialog("Enter Your Height?"));
      JOptionPane.showMessageDialog(null, "Your are "+height+" cm tall");
    }
}