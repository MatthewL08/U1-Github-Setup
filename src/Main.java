import java.text.DecimalFormat;
import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("What is your Bill amount($) : ");
        double totalBill = scan.nextDouble();
        System.out.print("What is your Tip percentage : ");
        double tipPercent = scan.nextDouble();
        System.out.print("Number of People : ");
        int numOfPeople = scan.nextInt();

        double tipPercentDecimal = tipPercent/100;
        double totalTipAmount = (totalBill * tipPercentDecimal);
        double totalBillCost = totalTipAmount + totalBill;
        double perPersonTip =  totalTipAmount/numOfPeople;
        double perPersonBill =  totalBillCost/numOfPeople;

        DecimalFormat df2 = new DecimalFormat("0.00");
        System.out.println("Total tip amount: $" + df2.format(totalTipAmount));
        System.out.println("Total bill cost: $" + df2.format(totalBillCost));
        System.out.println("Tip per Person: $" +  df2.format(perPersonTip));
        System.out.println("Total bill per person: $" +  df2.format(perPersonBill));
    }
}
