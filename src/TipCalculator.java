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

        double num = 0;
        double billBeforetip = 0;
        while ( num != -1) {
            System.out.println("Enter the item cost, Enter -1 to end: ");
            num = scan.nextDouble();
            billBeforetip = billBeforetip + num;
        }
        double tipAmount = billBeforetip * (tipPercentage / 100);
        double totalBill = tipAmount + billBeforetip;
        double perpersonBeforetip = billBeforetip / numberofPeople;
        double perpersontipAmount = tipAmount  /  numberofPeople;
        double perpersonTotal = totalBill / numberofPeople;

        System.out.println("Total Bill before Tip: " + billBeforetip);
        System.out.println("Total Bill after Tip: " + totalBill);
        System.out.println("Tip Percentage: " + tipPercentage);
        System.out.println("Tip Amount: " + tipAmount);
        System.out.println("Per Person Cost Before Tip " + perpersonBeforetip);
        System.out.println("Per Person Tip Amount: " + perpersontipAmount);
        System.out.println("Per Person Total Cost " + perpersonTotal);



    }
}
