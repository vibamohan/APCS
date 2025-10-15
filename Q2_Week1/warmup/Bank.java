public class Bank {
  private String name;
  private double balance;

  public Bank(String name, double balance) {
    this.name = name;
    this.balance = balance;
  }

  public String getName() {
    return name;
  }

  public double getBalance() {
    return balance;
  }

  public void withDraw(double amt) {
    balance -= amt;
    System.out.println("New Balance: " + balance);
  }

  public void deposit(double amt) {
    balance += amt;
    System.out.println("New Balance: " + balance);
  }
}
