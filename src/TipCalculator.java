import java.util.Scanner;
import java.text.DecimalFormat;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("#.##");

        System.out.println("This is the tip calculator");
        System.out.println("How many people are in your group? ");
        int numberofPeople = scan.nextInt();
        System.out.println("What is the tip percentage? ");
        int tipPercentage = scan.nextInt();
        String formattedPercentage = formatter.format(tipPercentage);

        double num = 0;
        double billBeforetip = num;
        while ( num != -1) {
            System.out.println("Enter the item cost, Enter -1 to end: ");
            num = scan.nextDouble();
            billBeforetip = billBeforetip + num;
        }

        
        double tipAmount = billBeforetip * ((double) tipPercentage / 100);
        String formattedtipAmount = formatter.format(tipAmount);
        double totalBill = tipAmount + billBeforetip;
        String formattedtotalBill = formatter.format(totalBill);
        double perpersonBeforetip = billBeforetip / numberofPeople;
        String formattedperpersonBeforetip = formatter.format(perpersonBeforetip);
        double perpersontipAmount = tipAmount  /  numberofPeople;
        String formattedperpersontipAmount = formatter.format(perpersontipAmount);
        double perpersonTotal = totalBill / numberofPeople;
        String formattedperpersonTotal = formatter.format(perpersonTotal);

        System.out.println("Total Bill before Tip: " + billBeforetip);
        System.out.println("Total Bill after Tip: " + totalBill);
        System.out.println("Tip Percentage: " + tipPercentage);
        System.out.println("Tip Amount: " + tipAmount);
        System.out.println("Per Person Cost Before Tip " + perpersonBeforetip);
        System.out.println("Per Person Tip Amount: " + perpersontipAmount);
        System.out.println("Per Person Total Cost " + perpersonTotal);

    }
}
