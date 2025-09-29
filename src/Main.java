import java.text.DecimalFormat;
import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("--------------------------------------------------------");
        System.out.println("Do not use any symbols when imputing the data below    |");
        System.out.println("--------------------------------------------------------");
        System.out.print("What is your Bill amount($) : ");
        double totalBill = scan.nextDouble();
        // Ask the user for their bill amount for future use in the calculation for tip amount and price

        System.out.print("What is your Tip percentage : ");
        double tipPercent = scan.nextDouble();

        // Ask the user for their tip amount for future use in the calculation for tip amount and price
        System.out.print("Number of People : ");
        int numOfPeople = scan.nextInt();
        // Ask the user for the number of people in the restaurant for future use in the calculation for tip amount and price

        double tipPercentDecimal = tipPercent/100;
        // changes the tip amount from a number into a decimal to correctly uses convert from a percentage
        double totalTipAmount = (totalBill * tipPercentDecimal);
        double totalBillCost = totalTipAmount + totalBill;
        double perPersonTip =  totalTipAmount/numOfPeople;
        double perPersonBill =  totalBillCost/numOfPeople;

        DecimalFormat df2 = new DecimalFormat("0.00");
        System.out.println("--------------------------------------------");
        System.out.println("|Total tip amount: $" + df2.format(totalTipAmount) + "                    |");
        System.out.println("--------------------------------------------");
        System.out.println("|Total bill cost: $" + df2.format(totalBillCost) + "                    |");
        System.out.println("--------------------------------------------");
        System.out.println("|Tip per Person: $" +  df2.format(perPersonTip) + "                      |");
        System.out.println("--------------------------------------------");
        System.out.println("Total bill per person: $" +  df2.format(perPersonBill) + "               |");
        System.out.println("--------------------------------------------");
    }
}