import java.util.Scanner;
import java.text.DecimalFormat;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("#.##");

        System.out.println("This is the tip calculator");
        //People Calc
        System.out.println("How many people are in your group? ");
        int numberofPeople = scan.nextInt();
        //Tip Percent
        System.out.println("What is the tip percentage? ");
        int tipPercentage = scan.nextInt();
        String formattedPercentage = formatter.format(tipPercentage);

        //Set before to make while loop work
        double num = 0;
        double billBeforetip = num;
        //User Input
        while ( num != -1) {
            System.out.println("Enter the item cost, Enter -1 to end: ");
            num = scan.nextDouble();
            billBeforetip = billBeforetip + num;
        }
        billBeforetip = billBeforetip + 1;
        String formattedbillBeforetip = formatter.format(billBeforetip);

        //Printout at the End
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

        System.out.println("Total Bill before Tip: " + formattedbillBeforetip);
        System.out.println("Total Bill after Tip: " + formattedtotalBill);
        System.out.println("Tip Percentage: " + tipPercentage);
        System.out.println("Tip Amount: " + formattedtipAmount);
        System.out.println("Per Person Cost Before Tip " + formattedperpersonBeforetip);
        System.out.println("Per Person Tip Amount: " + formattedperpersontipAmount);
        System.out.println("Per Person Total Cost " + formattedperpersonTotal);

    }
}
