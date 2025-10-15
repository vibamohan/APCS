import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Screen extends JPanel implements ActionListener {

  // Instance variable
  private Bank customer = new Bank("John", 100.99, 1234);
  private boolean access = false;

  // GUI components
  private JTextField pinInput = new JTextField(10);
  private JButton loginButton = new JButton("Login");
  private JTextField moneyInput = new JTextField(10);
  private JButton withdrawButton = new JButton("Withdraw");
  private JButton depositButton = new JButton("Deposit");
  private JButton logoutButton = new JButton("Logout");

  public Screen() {
    // Add GUI components
    add(new JLabel("Enter PIN:"));
    add(pinInput);
    add(loginButton);
    loginButton.addActionListener(this);

    add(new JLabel("Amount:"));
    add(moneyInput);
    add(withdrawButton);
    withdrawButton.addActionListener(this);
    add(depositButton);
    depositButton.addActionListener(this);

    add(logoutButton);
    logoutButton.addActionListener(this);
  }

  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    if (access) {
      g.drawString("Name: " + customer.getName(), 20, 100);
      g.drawString("Balance: " + customer.getBalance(), 20, 120);
    }
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == loginButton) {
      int pin = Integer.parseInt(pinInput.getText());
      access = customer.checkedPin(pin) && customer.getAccess();
    } else if (e.getSource() == withdrawButton && access) {
      double amount = Double.parseDouble(moneyInput.getText());
      customer.withdraw(amount);
    } else if (e.getSource() == depositButton && access) {
      double amount = Double.parseDouble(moneyInput.getText());
      customer.deposit(amount);
    } else if (e.getSource() == logoutButton) {
      access = false;
      customer.logout();
    }
    repaint(); // Update display after each action
  }
}
