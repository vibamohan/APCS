
import java.util.Scanner;

public class Runner {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    Bank bank = new Bank("Bank", 10);
    while (true) {
      System.out.println("1. Print Name");
      System.out.println("2. Print Balance");
      System.out.println("3. Deposit");
      System.out.println("4. Withdrawal");
      System.out.print("-> ");
      int choice = scan.nextInt();

      if (choice == 1) {
        System.out.println("Bank is " + bank.getName());
      }

      else if (choice == 2) {
        System.out.println("Balance is " + bank.getBalance());
      }

      else if (choice == 3) {
        System.out.println("How much would you like to deposit? ");
        double depositAmt = scan.nextDouble();
        bank.deposit(depositAmt);
      }

      else if (choice == 4) {
        System.out.println("How much would you like to withdraw?");
        double amt = scan.nextDouble();
        bank.withDraw(amt);
      }
    }
  }
}
