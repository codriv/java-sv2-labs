package statements;

import java.util.Scanner;

public class InvestmentMain {
    public static void main(String[] args) {
        System.out.println("\r\nBefektetések 1.0\r\n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adja meg a befektetett összeget!");
        int fund = scanner.nextInt();
        System.out.println("Adja meg a kamatlábat!");
        int interestRate = scanner.nextInt();
        Investment investment = new Investment(fund, interestRate);
        System.out.println("\r\nA befektetés adatai:");
        System.out.println(" Tőke: " + investment.getFund() + " Ft");
        System.out.println(" Kamatláb: " + interestRate + "%"); // interestRate helyett investment.getInterestRate()?
        int days = 20;
        int daysClose = 125;
        int daysClose2 = 230;
        System.out.println(" Hozam " + days + " napra: " + investment.getYield(days) + " Ft");
        System.out.println(" Kivett összeg " + daysClose + " nap után: " + investment.close(daysClose) + " Ft");
        System.out.println(" Kivett összeg " + daysClose2 + " nap után: " + investment.close(daysClose2) + " Ft");
    }
}
