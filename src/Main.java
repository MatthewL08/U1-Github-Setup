import java.text.DecimalFormat;
import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("---------------------------------------------------------------");
        System.out.println("Do not use any symbols when imputing the data below w/o $ or % |");
        System.out.println("---------------------------------------------------------------");
        System.out.print("What is your Bill amount ($) : ");
        double totalBill = scan.nextDouble();
        // Asks the user for their Bill amount in order to store it in a variable for calculating the tip and total bill
        System.out.print("What is your Tip percentage : ");
        double tipPercent = scan.nextDouble();
        // Ask the user for their tip percentage to store in a variable for future use in the calculation for tip amount
        System.out.print("Number of People : ");
        int numOfPeople = scan.nextInt();
        // Ask the user for the number of people in the restaurant for future use in the calculation for tip amount and price
        double tipPercentDecimal = tipPercent/100;
        // changes the tip percentage from a whole number into a decimal so it can correctly find the tip amount
        double totalTipAmount = (totalBill * tipPercentDecimal);
        // uses the tip percentage to covert the bill into the total tip amount of the bill to answer the users question and calculating the total bill
        double totalBillCost = totalTipAmount + totalBill;
        // combines the total bill before tax with the tax in order to find the generated total cost of the bill
        double perPersonTip =  totalTipAmount/numOfPeople;
        // splits the tip amount into portions based on the number of people present in order to find the tip each person will have to pay
        double perPersonBill =  totalBillCost/numOfPeople;
        // converts the total bill with tax to a per-person bill by finding the quotient between the bill and amount of people
        DecimalFormat format = new DecimalFormat("0.00");
        // Sets up the format required to round the amount of money to the nearest hundredth
        System.out.println("---------------------------------------------------");
        System.out.println("|Total tip amount: $" + format.format(totalTipAmount) + "                          |");
        // the information type is stated before using the decimal format to round any extra decimal places so that the tip amount is clear before stating it
        System.out.println("--------------------------------------------------");
        System.out.println("|Total bill cost: $" + format.format(totalBillCost) + "                          |");
        // the information type is stated before using the decimal format to round any extra decimal places so that the total bill cost is clear before stating it
        System.out.println("---------------------------------------------------");
        System.out.println("|Tip per Person: $" +  format.format(perPersonTip) + "                             |");
        // the information type is stated before using the decimal format to round any extra decimal places so that the tip each person pays is clear before stating it
        System.out.println("---------------------------------------------------");
        System.out.println("Total bill per person: $" +  format.format(perPersonBill) + "                      |");
        // the information type is stated before using the decimal format to round any extra decimal places so that the split each person will pay of the bill is clear before stating it
        System.out.println("---------------------------------------------------");
    }
}