import java.util.*;

public class CalculatorBasic {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== BASIC CALCULATOR =====");

        System.out.println("Enter First Number: ");
        int n1 = sc.nextInt();
        System.out.println("Enter Second Number: ");
        int n2 = sc.nextInt();
        System.out.println("Enter Operator: ");
        System.out.println(" + | - | * | / ");
        char ope= sc.next().charAt(0);


        switch (ope){
            case '+':
                System.out.println("Result: " + (n1+n2));
                break;
            case '-':
                System.out.println("Result: " + (n1-n2));
                break;
            case '*':
                System.out.println("Result: " + (n1*n2));
                break;
            case '/':
                if(n2==0){
                    System.out.println("Error: Division by zero is not allowed.");
                } else {
                    System.out.println("Result: " + (n1/n2));
                }
                break;
            default:
                System.out.println("Invalid operator. Please use +, -, *, or /.");  
        }

        sc.close();
    }
}