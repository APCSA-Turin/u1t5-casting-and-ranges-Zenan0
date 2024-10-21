import java.util.Scanner;

public class Debugging {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter first integer: ");
    double num1 = scan.nextDouble();

    System.out.print("Enter second integer: ");
    double num2 = scan.nextDouble();

    double quotient = num1 / num2;               // Line A
    int sum = (int) (num1 + num2);                       // Line B

    System.out.println("The quotient is " + quotient);
    System.out.println("The sum is " + sum);
  }
}