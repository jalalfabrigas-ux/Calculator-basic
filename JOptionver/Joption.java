package JOptionver;
import javax.swing.JOptionPane;
public class Joption {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Hello, Welcome to my Calculator!");
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Enter First Number: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Enter Second Number: "));
        String ope = JOptionPane.showInputDialog("Enter Operator: \n + | - | * | / ");

    }   void isResult(int n1, int n2, String ope){
        switch (ope){
            case "+":
                JOptionPane.showMessageDialog(null, "Result: " + (n1+n2));
                break;
            case "-":
                JOptionPane.showMessageDialog(null, "Result: " + (n1-n2));
                break;
            case "*":
                JOptionPane.showMessageDialog(null, "Result: " + (n1*n2));
                break;
            case "/":
                if(n2==0){
                    JOptionPane.showMessageDialog(null, "Error: Division by zero is not allowed.");
                } else {
                    JOptionPane.showMessageDialog(null, "Result: " + (n1/n2));
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Invalid operator. Please use +, -, *, or /.");  
        }
    }
}
