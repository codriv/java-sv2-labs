package classstructureintegrate;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        System.out.println("\r\nBankszámlák 1.0\r\n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("A számlatulajdonos neve: ");
        String ownerName = scanner.nextLine();
        System.out.println("Az ügyfél számlaszáma: ");
        String ownerAccountNumber = scanner.nextLine();
        System.out.println("A számlán lévő pénz: ");
        int ownerBalance = scanner.nextInt();

        BankAccount bankAccount = new BankAccount(ownerName, ownerAccountNumber, ownerBalance);
        System.out.println("\r\nA számla adatai:");
        System.out.println(bankAccount.getInfo());
        System.out.println("\r\nMennyi befizetést eszközöl a számlára?");
        bankAccount.deposit(scanner.nextInt());
        System.out.println("Az új egyenleg:\r\n" + bankAccount.getInfo());
        System.out.println("\r\nMennyit vesz ki a számláról?");
        bankAccount.withdraw(scanner.nextInt());
        System.out.println("Az új egyenleg:\r\n" + bankAccount.getInfo());
    }
}
