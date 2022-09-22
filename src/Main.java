import java.util.Scanner;
import java.text.DecimalFormat;
public class Main {
    public static void main (String[] args) {
        //inputting the objects
        Scanner scan = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("#.##");

        System.out.println("Thank you for eating with us! Calculate your tip here."); //greeting
        System.out.println("How many people are dining today?");
        int party = scan.nextInt();
        System.out.println("What tip percentage would you like to leave?");
        int tipPercent = scan.nextInt();
        System.out.println("Enter the cost of each item in dollars in cents, e.g. 9.27; to end, type -1");
        double bill = 0;
        double price = scan.nextDouble();
        while (price > 0) {
            bill = bill + price;
            price = scan.nextDouble();
        }

        double tip = tipPercent * bill / 100;
        double totalBill = bill + tip;
        double individualBill = bill / party;
        double individualTip = tip / party;
        double individualCost = totalBill / party;

        String formBill = formatter.format(bill);
        String formTip = formatter.format(tip);
        String formTotalBill = formatter.format(totalBill);
        String formIndividualBill = formatter.format(individualBill);
        String formIndividualTip = formatter.format(individualTip);
        String formIndividualCost = formatter.format(individualCost);


        System.out.println("----------------------------------------------------------");

        System.out.println("Total bill before tip: " + formBill);
        System.out.println("Tip percentage: " + tipPercent);
        System.out.println("Total tip: " + formTip);
        System.out.println("Total bill with tip: " + formTotalBill);
        System.out.println("Individual bill: " + formIndividualBill);
        System.out.println("Individual tip: " + formIndividualTip);
        System.out.println("Individual total cost: " + formIndividualCost);

        System.out.println("----------------------------------------------------------");

        System.out.println("Thanks for coming! Have a great day :-)");

    }
}
