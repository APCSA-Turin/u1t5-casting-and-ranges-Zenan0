import java.util.Scanner;

public class PairProgramming {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Type in a decimal between 100.00 and 999.99 with up to two decimals: ");
        double number = scan.nextDouble();
        scan.nextLine();

        int hundreds = (int) (number / 100);
        int tens = (int) (((number - hundreds * 100) / 10));
        int ones = (int) (((number - hundreds * 100) - tens * 10));
        int tenths = (int) ((((((number * 100) - hundreds * 10000) - tens * 1000) - ones * 100) / 10));
        int hundredths = (int) ((((((number * 100) - hundreds * 10000) - tens * 1000) - ones * 100) - tenths * 10));

        int hundredsPlace = ((hundreds + 1) % 10);
        int tensPlace = ((tens + 1) % 10);
        int onesPlace = ((ones + 1) % 10);
        int tenthsPlace = ((tenths + 1) % 10);
        int hundredthsPlace = ((hundredths + 1) % 10);

        System.out.println("The adjusted number is: " + hundredsPlace + tensPlace + onesPlace + "." + tenthsPlace + hundredthsPlace + ".");
        
        scan.close();
    }
}