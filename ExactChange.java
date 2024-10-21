import java.util.Scanner;

public class ExactChange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter an amount in dollars and cents: ");
        double amount = scan.nextDouble();
        scan.nextLine();
        amount *= 100;

        int quarters = (int) (amount / 25);
        amount %= 25;
        int dimes = (int) (amount / 10);
        amount %= 10;
        int nickels = (int) (amount / 5);
        amount %= 5;
        int pennies = (int) (amount / 1);
        amount %= 1;

        System.out.println("The minimum number of coins is: " + (quarters + dimes + nickels + pennies));
        System.out.println(quarters + " quarters");
        System.out.println(dimes + " dimes");
        System.out.println(nickels + " nickels");
        System.out.println(pennies + " pennies");

        scan.close();
    }
}
