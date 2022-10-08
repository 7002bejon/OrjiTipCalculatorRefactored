import java.util.Scanner;
import java.text.DecimalFormat;

public class TipCalculatorRunner {
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

        TipCalculator tip = new TipCalculator(numberofPeople, tipPercentage);

        //Set before to make while loop work
        System.out.println("Enter a cost in dollars plus cents");
        double itemCost = scan.nextDouble();
        //User Input
        while (itemCost != -1) {
            tip.addMeal(itemCost);
            System.out.println("Enter the item cost, Enter -1 to end: ");
            itemCost = scan.nextDouble();
        }

        String formattedbillBeforetip = formatter.format(tip.getBillBeforetip());

        //Printout at the End

        String formattedtipAmount = formatter.format(tip.tipAmount());
        String formattedtotalBill = formatter.format(tip.totalBill());
        String formattedperpersonBeforetip = formatter.format(tip.perpersonBeforetip());
        String formattedperpersontipAmount = formatter.format(tip.perpersontipAmount());
        String formattedperpersonTotal = formatter.format(tip.perpersonTotal());

        System.out.println("Total Bill before Tip: " + formattedbillBeforetip);
        System.out.println("Total Bill after Tip: " + formattedtotalBill);
        System.out.println("Tip Percentage: " + tipPercentage);
        System.out.println("Tip Amount: " + formattedtipAmount);
        System.out.println("Per Person Cost Before Tip " + formattedperpersonBeforetip);
        System.out.println("Per Person Tip Amount: " + formattedperpersontipAmount);
        System.out.println("Per Person Total Cost " + formattedperpersonTotal);

    }
}
