package th.ac.nu.students.u54347606.compro.ch02;
import java.util.Scanner;
public class Exercise6 {
    public static void main(String args[]){
        
        Scanner in = new Scanner(System.in);
        final int PENNIES_PER_DOLLAR = 100;
        final int PENNIES_PER_QUARTER = 25;

        System.out.println("Enter bill value (1 = $0.25 bill, 5 = $1.25 bill):");
        int billValue = in.nextInt();

        System.out.println("Enter item price for pennies:");
        
        int itemPrice = in.nextInt();

        int amountDue = PENNIES_PER_QUARTER * billValue - itemPrice;
        int dollarCoins = amountDue/PENNIES_PER_DOLLAR;
        amountDue = amountDue%PENNIES_PER_DOLLAR;
        int quarters = amountDue/PENNIES_PER_QUARTER;

        System.out.printf("Dollar coins: %6d",dollarCoins);
        System.out.println();
        System.out.printf("Quarters: %6d\n",quarters);
        System.out.println();
        
        }
}
    

